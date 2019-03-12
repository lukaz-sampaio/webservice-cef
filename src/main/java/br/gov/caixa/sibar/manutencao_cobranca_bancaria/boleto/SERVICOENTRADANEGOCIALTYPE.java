
package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.caixa.sibar.SERVICOENTRADATYPE;


/**
 * <p>Classe Java de SERVICO_ENTRADA_NEGOCIAL_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SERVICO_ENTRADA_NEGOCIAL_TYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caixa.gov.br/sibar}SERVICO_ENTRADA_TYPE">
 *       &lt;sequence>
 *         &lt;element name="DADOS" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}DADOS_ENTRADA_TYPE"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICO_ENTRADA_NEGOCIAL_TYPE", propOrder = {
    "dados"
})
public class SERVICOENTRADANEGOCIALTYPE
    extends SERVICOENTRADATYPE
{

    @XmlElement(name = "DADOS", required = true)
    protected DADOSENTRADATYPE dados;

    /**
     * Obtém o valor da propriedade dados.
     * 
     * @return
     *     possible object is
     *     {@link DADOSENTRADATYPE }
     *     
     */
    public DADOSENTRADATYPE getDADOS() {
        return dados;
    }

    /**
     * Define o valor da propriedade dados.
     * 
     * @param value
     *     allowed object is
     *     {@link DADOSENTRADATYPE }
     *     
     */
    public void setDADOS(DADOSENTRADATYPE value) {
        this.dados = value;
    }

}
