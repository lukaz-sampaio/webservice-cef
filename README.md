
# Gerar boletos Caixa Econômica Federal vai WebService

Nesse projeto estão somente as classes geradas a partir dos arquivos WSDL disponibilizados pela Caixa Econômica Federal, mas se quiser obter os arquivos e gerá-los por conta própria, fique à vontade.

Primeiramente você deve ligar pra Caixa Econômica Federal e pedir os seguintes arquivos

```
Consulta_Cobranca_Bancaria_Boleto.wsdl
Consulta_Cobranca_Bancaria_Boleto.xsd
EmiteBoleto.xsd
Manutencao_Cobranca_Bancaria_Externo.wsdl
Manutencao_Cobranca_Bancaria_Boleto_Externo.xsd
MensagensBarramento.xsd
```

Por sorte, tem um [repositório](https://github.com/vmassuchetto/WebserviceCaixa) que está implementando esta mesma solução em PHP e disponibilizou os arquivos no github.com. 

Aqui tem um trecho do README do projeto que basicamente ensina como baixar os arquivos.

Se você não os tiver, é possível baixar as versões de desenvolvimento e modificar os caminhos dos arquivos para apontar para os caminhos locais.

```
cd caminho/salvar_arquivos

curl -sk "https://des.barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto?wsdl" -o "Consulta_Cobranca_Bancaria_Boleto.wsdl"
curl -sk "https://des.barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto?xsd=xsd0" -o "Consulta_Cobranca_Bancaria_Boleto0.xsd"
curl -sk "https://des.barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto?xsd=xsd1" -o "Consulta_Cobranca_Bancaria_Boleto1.xsd"
curl -sk "https://des.barramento.caixa.gov.br/sibar/ManutencaoCobrancaBancaria/Boleto?wsdl" -o "Manutencao_Cobranca_Bancaria_Externo.wsdl"
curl -sk "https://des.barramento.caixa.gov.br/sibar/ManutencaoCobrancaBancaria/Boleto?xsd=xsd0" -o "Manutencao_Cobranca_Bancaria_Boleto_Externo0.xsd"
curl -sk "https://des.barramento.caixa.gov.br/sibar/ManutencaoCobrancaBancaria/Boleto?xsd=xsd1" -o "Manutencao_Cobranca_Bancaria_Boleto_Externo1.xsd"
curl -sk "https://des.barramento.caixa.gov.br/sibar/ManutencaoCobrancaBancaria/Boleto?xsd=xsd2" -o "Manutencao_Cobranca_Bancaria_Boleto_Externo2.xsd"
```

```
for i in *; do
    sed -i 's,https://des.barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto?wsdl,Consulta_Cobranca_Bancaria_Boleto.wsdl,g' $i
    sed -i 's,https://des.barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto?xsd=xsd0,Consulta_Cobranca_Bancaria_Boleto0.xsd,g' $i
    sed -i 's,https://des.barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto?xsd=xsd1,Consulta_Cobranca_Bancaria_Boleto1.xsd,g' $i
    sed -i 's,https://des.barramento.caixa.gov.br/sibar/ManutencaoCobrancaBancaria/Boleto?wsdl,Manutencao_Cobranca_Bancaria_Externo.wsdl,g' $i
    sed -i 's,https://des.barramento.caixa.gov.br/sibar/ManutencaoCobrancaBancaria/Boleto?xsd=xsd0,Manutencao_Cobranca_Bancaria_Boleto_Externo0.xsd,g' $i
    sed -i 's,https://des.barramento.caixa.gov.br/sibar/ManutencaoCobrancaBancaria/Boleto?xsd=xsd1,Manutencao_Cobranca_Bancaria_Boleto_Externo1.xsd,g' $i
    sed -i 's,https://des.barramento.caixa.gov.br/sibar/ManutencaoCobrancaBancaria/Boleto?xsd=xsd2,Manutencao_Cobranca_Bancaria_Boleto_Externo2.xsd,g' $i
done
```

Se for utilizar para produção, modifique também o endereço do barramento de requisições dos arquivos WSDL:

```
sed -i 's,https://des.barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto,https://barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto,g' Consulta_Cobranca_Bancaria_Boleto.wsdl
sed -i 's,https://des.barramento.caixa.gov.br/sibar/ManutencaoCobrancaBancaria/Boleto,https://barramento.caixa.gov.br/sibar/ManutencaoCobrancaBancaria/Boleto,g' Manutencao_Cobranca_Bancaria_Externo.wsdl
```

## Gerando classes Java a partir do WSDL

Abra um terminal e navegue até a pasta onde estão os arquivos `wsdl` e execute o comando:

```
wsimport -keep -verbose arquivo.wsdl -d caminho/classes_geradas
```

NOTA: 
Ao tentar gerar as classes do _Manutencao\_Cobranca\_Bancaria\_Externo.wsdl_ e ocorrer o seguinte erro:

```
[ERROR] Sem partes do corpo exclusivas! Em uma porta, conforme BP 1.1 R2710, as operações devem ter assinatura de operação exclusiva na conexão para obter despacho com sucesso. Na porta manutencao_cobranca_bancariaSOAP, as Operações \"ALTERA_BOLETO\" e \"BAIXA_BOLETO\" têm o mesmo bloco do corpo da solicitação {http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}SERVICO_ENTRADA. Tente executar wsimport com a chave -extension, o runtime tentará despachar usando SOAPAction
  linha 79 de file:/home/lucas/NetBeansProjects/boletos-cef/src/main/resources/Manutencao_Cobranca_Bancaria_Externo.wsdl

Exception in thread "main" com.sun.tools.internal.ws.wscompile.AbortException
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModelerBase.error(WSDLModelerBase.java:732)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModeler.processLiteralSOAPOperation(WSDLModeler.java:845)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModeler.processSOAPOperation(WSDLModeler.java:698)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModeler.processPort(WSDLModeler.java:466)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModeler.processService(WSDLModeler.java:245)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModeler.internalBuildModel(WSDLModeler.java:216)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModeler.buildModel(WSDLModeler.java:126)
	at com.sun.tools.internal.ws.wscompile.WsimportTool.buildWsdlModel(WsimportTool.java:429)
	at com.sun.tools.internal.ws.wscompile.WsimportTool.run(WsimportTool.java:190)
	at com.sun.tools.internal.ws.wscompile.WsimportTool.run(WsimportTool.java:168)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.sun.tools.internal.ws.Invoker.invoke(Invoker.java:159)
	at com.sun.tools.internal.ws.WsImport.main(WsImport.java:42)

```

Será necessário modificar as `linhas 17, 23, 29` do arquivo _Manutencao_Cobranca_Bancaria_Externo.wsdl_ alterando o sufixo da ação em `SERVICO_ENTRADA_acao`. Devem ficar assim:

```
...
17.    <wsdl:part element="manutencaocobrancabancaria:SERVICO_ENTRADA_INCLUIR" name="parameters"/>

23.    <wsdl:part element="manutencaocobrancabancaria:SERVICO_ENTRADA_BAIXAR" name="parameters"/

29.    <wsdl:part element="manutencaocobrancabancaria:SERVICO_ENTRADA_ALTERAR" name="parameters"/>
...
```

Depois modificar a `linha 06` do arquivo `Manutencao_Cobranca_Bancaria_Boleto_Externo0.xsd` de:

```
...
<xsd:element name="SERVICO_ENTRADA" type="manutencaocobrancabancaria:SERVICO_ENTRADA_NEGOCIAL_TYPE"/>
...
```

para: 

```
...
<xsd:element name="SERVICO_ENTRADA_INCLUIR" type="manutencaocobrancabancaria:SERVICO_ENTRADA_NEGOCIAL_TYPE"/>
    
<xsd:element name="SERVICO_ENTRADA_BAIXAR" type="manutencaocobrancabancaria:SERVICO_ENTRADA_NEGOCIAL_TYPE"/>
    
<xsd:element name="SERVICO_ENTRADA_ALTERAR" type="manutencaocobrancabancaria:SERVICO_ENTRADA_NEGOCIAL_TYPE"/>
...
```

Depois só rodar o comando `wsimport` novamente;

NOTA 2:
Depois de ter as classes geradas, será necessário fazer algumas alterações. Por exemplo, se as classes `ManutencaoCobrancaBancaria_Service.java` e `ConsultaCobrancaBancariaBoleto_Service.java` estiverem com a URL apontando para os arquivos (`file:///home/$USER/path/to/resources/`), modificar para apontar para as URL's dos WSDL's (`https://des.barramento.caixa.gov.br/sibar/ManutencaoCobrancaBancaria/Boleto?wsdl` e `https://des.barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto?wsdl` respectivamente). Também será necessário desfazer as modificções nas classes removendo os ações que ficaram como sufixo nas classes:

* ObjectFactory.java
* ManutencaoCobrancaBancaria.java
* Manutencao_Cobranca_Bancaria_Boleto_Externo0.xsd
* Manutencao_Cobranca_Bancaria_Externo.wsdl

Ou seja, trocar os nomes `SERVICO_ENTRADA_INCLUIR`, `SERVICO_ENTRADA_BAIXAR`, `SERVICO_ENTRADA_ALTERAR`, para apenas `SERVICO_ENTRADA` e remover se tiver mais de uma ocorrência (ocorre apenas na classe `ObjectFactory.java`) já que não existe apenas a ação `SERVICO_ENTRADA`.

---

**NOTAS:**

* Caso queira escolher os ambientes basta editar as URLs das linhas 17 e 33 das classes
`ConsultaCobrancaBancariaBoleto_Service.java` e `ManutencaoCobrancaBancaria_Service.java`.
Removendo o prefixo `des.` das URLs ficará em ambiente de **PRODUÇÃO** e deixando com o prefixo
`des.` ficará em ambiente de **HOMOLOGAÇÃO**.
