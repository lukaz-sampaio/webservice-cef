
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DADOS_SAIDA_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DADOS_SAIDA_TYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caixa.gov.br/sibar}DADOS_SAIDA_TYPE">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="CONSULTA_SOLICITACAO_GRUPO_PAGADOR" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE"/>
 *           &lt;element name="CONSULTA_SOLICITACAO_PRE_IMPRESSO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE"/>
 *           &lt;element name="CONSULTA_SOLICITACOES_GRUPO_PAGADOR" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}CONSULTA_SOLICITACOES_GRUPO_PAGADOR_TYPE"/>
 *           &lt;element name="CONSULTA_SOLICITACOES_PRE_IMPRESSO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE"/>
 *           &lt;element name="IMPRIME_BOLETO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}IMPRIME_BOLETO_TYPE"/>
 *           &lt;element name="CONSULTA_BOLETO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_saida_Type"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DADOS_SAIDA_TYPE", propOrder = {
    "consultasolicitacaogrupopagador",
    "consultasolicitacaopreimpresso",
    "consultasolicitacoesgrupopagador",
    "consultasolicitacoespreimpresso",
    "imprimeboleto",
    "consultaboleto"
})
public class DADOSSAIDATYPE
    extends br.gov.caixa.sibar.DADOSSAIDATYPE
{

    @XmlElement(name = "CONSULTA_SOLICITACAO_GRUPO_PAGADOR")
    protected CONSULTASOLICITACAOGRUPOPAGADORTYPE consultasolicitacaogrupopagador;
    @XmlElement(name = "CONSULTA_SOLICITACAO_PRE_IMPRESSO")
    protected CONSULTASOLICITACAOPREIMPRESSOTYPE consultasolicitacaopreimpresso;
    @XmlElement(name = "CONSULTA_SOLICITACOES_GRUPO_PAGADOR")
    protected CONSULTASOLICITACOESGRUPOPAGADORTYPE consultasolicitacoesgrupopagador;
    @XmlElement(name = "CONSULTA_SOLICITACOES_PRE_IMPRESSO")
    protected CONSULTASOLICITACOESPREIMPRESSOTYPE consultasolicitacoespreimpresso;
    @XmlElement(name = "IMPRIME_BOLETO")
    protected IMPRIMEBOLETOTYPE imprimeboleto;
    @XmlElement(name = "CONSULTA_BOLETO")
    protected ConsultaBoletoSaidaType consultaboleto;

    /**
     * Obtém o valor da propriedade consultasolicitacaogrupopagador.
     * 
     * @return
     *     possible object is
     *     {@link CONSULTASOLICITACAOGRUPOPAGADORTYPE }
     *     
     */
    public CONSULTASOLICITACAOGRUPOPAGADORTYPE getCONSULTASOLICITACAOGRUPOPAGADOR() {
        return consultasolicitacaogrupopagador;
    }

    /**
     * Define o valor da propriedade consultasolicitacaogrupopagador.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSULTASOLICITACAOGRUPOPAGADORTYPE }
     *     
     */
    public void setCONSULTASOLICITACAOGRUPOPAGADOR(CONSULTASOLICITACAOGRUPOPAGADORTYPE value) {
        this.consultasolicitacaogrupopagador = value;
    }

    /**
     * Obtém o valor da propriedade consultasolicitacaopreimpresso.
     * 
     * @return
     *     possible object is
     *     {@link CONSULTASOLICITACAOPREIMPRESSOTYPE }
     *     
     */
    public CONSULTASOLICITACAOPREIMPRESSOTYPE getCONSULTASOLICITACAOPREIMPRESSO() {
        return consultasolicitacaopreimpresso;
    }

    /**
     * Define o valor da propriedade consultasolicitacaopreimpresso.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSULTASOLICITACAOPREIMPRESSOTYPE }
     *     
     */
    public void setCONSULTASOLICITACAOPREIMPRESSO(CONSULTASOLICITACAOPREIMPRESSOTYPE value) {
        this.consultasolicitacaopreimpresso = value;
    }

    /**
     * Obtém o valor da propriedade consultasolicitacoesgrupopagador.
     * 
     * @return
     *     possible object is
     *     {@link CONSULTASOLICITACOESGRUPOPAGADORTYPE }
     *     
     */
    public CONSULTASOLICITACOESGRUPOPAGADORTYPE getCONSULTASOLICITACOESGRUPOPAGADOR() {
        return consultasolicitacoesgrupopagador;
    }

    /**
     * Define o valor da propriedade consultasolicitacoesgrupopagador.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSULTASOLICITACOESGRUPOPAGADORTYPE }
     *     
     */
    public void setCONSULTASOLICITACOESGRUPOPAGADOR(CONSULTASOLICITACOESGRUPOPAGADORTYPE value) {
        this.consultasolicitacoesgrupopagador = value;
    }

    /**
     * Obtém o valor da propriedade consultasolicitacoespreimpresso.
     * 
     * @return
     *     possible object is
     *     {@link CONSULTASOLICITACOESPREIMPRESSOTYPE }
     *     
     */
    public CONSULTASOLICITACOESPREIMPRESSOTYPE getCONSULTASOLICITACOESPREIMPRESSO() {
        return consultasolicitacoespreimpresso;
    }

    /**
     * Define o valor da propriedade consultasolicitacoespreimpresso.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSULTASOLICITACOESPREIMPRESSOTYPE }
     *     
     */
    public void setCONSULTASOLICITACOESPREIMPRESSO(CONSULTASOLICITACOESPREIMPRESSOTYPE value) {
        this.consultasolicitacoespreimpresso = value;
    }

    /**
     * Obtém o valor da propriedade imprimeboleto.
     * 
     * @return
     *     possible object is
     *     {@link IMPRIMEBOLETOTYPE }
     *     
     */
    public IMPRIMEBOLETOTYPE getIMPRIMEBOLETO() {
        return imprimeboleto;
    }

    /**
     * Define o valor da propriedade imprimeboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link IMPRIMEBOLETOTYPE }
     *     
     */
    public void setIMPRIMEBOLETO(IMPRIMEBOLETOTYPE value) {
        this.imprimeboleto = value;
    }

    /**
     * Obtém o valor da propriedade consultaboleto.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoSaidaType }
     *     
     */
    public ConsultaBoletoSaidaType getCONSULTABOLETO() {
        return consultaboleto;
    }

    /**
     * Define o valor da propriedade consultaboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoSaidaType }
     *     
     */
    public void setCONSULTABOLETO(ConsultaBoletoSaidaType value) {
        this.consultaboleto = value;
    }

}
