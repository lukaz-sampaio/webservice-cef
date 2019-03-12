
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DADOS_ENTRADA_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DADOS_ENTRADA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CONSULTA_SOLICITACAO_GRUPO_PAGADOR" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}CONSULTA_SOLICITACAO_GRUPO_PAGADOR_INPUT_TYPE"/>
 *           &lt;element name="CONSULTA_SOLICITACAO_PRE_IMPRESSO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE"/>
 *           &lt;element name="CONSULTA_SOLICITACOES_GRUPO_PAGADOR" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE"/>
 *           &lt;element name="CONSULTA_SOLICITACOES_PRE_IMPRESSO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE"/>
 *           &lt;element name="IMPRIME_BOLETO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}IMPRIME_BOLETO_INPUT_TYPE"/>
 *           &lt;element name="CONSULTA_BOLETO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_entrada_Type"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DADOS_ENTRADA_TYPE", propOrder = {
    "consultasolicitacaogrupopagador",
    "consultasolicitacaopreimpresso",
    "consultasolicitacoesgrupopagador",
    "consultasolicitacoespreimpresso",
    "imprimeboleto",
    "consultaboleto"
})
public class DADOSENTRADATYPE {

    @XmlElement(name = "CONSULTA_SOLICITACAO_GRUPO_PAGADOR")
    protected CONSULTASOLICITACAOGRUPOPAGADORINPUTTYPE consultasolicitacaogrupopagador;
    @XmlElement(name = "CONSULTA_SOLICITACAO_PRE_IMPRESSO")
    protected CONSULTASOLICITACAOPREIMPRESSOINPUTTYPE consultasolicitacaopreimpresso;
    @XmlElement(name = "CONSULTA_SOLICITACOES_GRUPO_PAGADOR")
    protected CONSULTASOLICITACOESGRUPOPAGADORINPUTTYPE consultasolicitacoesgrupopagador;
    @XmlElement(name = "CONSULTA_SOLICITACOES_PRE_IMPRESSO")
    protected CONSULTASOLICITACOESPREIMPRESSOINPUTTYPE consultasolicitacoespreimpresso;
    @XmlElement(name = "IMPRIME_BOLETO")
    protected IMPRIMEBOLETOINPUTTYPE imprimeboleto;
    @XmlElement(name = "CONSULTA_BOLETO")
    protected ConsultaBoletoEntradaType consultaboleto;

    /**
     * Obtém o valor da propriedade consultasolicitacaogrupopagador.
     * 
     * @return
     *     possible object is
     *     {@link CONSULTASOLICITACAOGRUPOPAGADORINPUTTYPE }
     *     
     */
    public CONSULTASOLICITACAOGRUPOPAGADORINPUTTYPE getCONSULTASOLICITACAOGRUPOPAGADOR() {
        return consultasolicitacaogrupopagador;
    }

    /**
     * Define o valor da propriedade consultasolicitacaogrupopagador.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSULTASOLICITACAOGRUPOPAGADORINPUTTYPE }
     *     
     */
    public void setCONSULTASOLICITACAOGRUPOPAGADOR(CONSULTASOLICITACAOGRUPOPAGADORINPUTTYPE value) {
        this.consultasolicitacaogrupopagador = value;
    }

    /**
     * Obtém o valor da propriedade consultasolicitacaopreimpresso.
     * 
     * @return
     *     possible object is
     *     {@link CONSULTASOLICITACAOPREIMPRESSOINPUTTYPE }
     *     
     */
    public CONSULTASOLICITACAOPREIMPRESSOINPUTTYPE getCONSULTASOLICITACAOPREIMPRESSO() {
        return consultasolicitacaopreimpresso;
    }

    /**
     * Define o valor da propriedade consultasolicitacaopreimpresso.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSULTASOLICITACAOPREIMPRESSOINPUTTYPE }
     *     
     */
    public void setCONSULTASOLICITACAOPREIMPRESSO(CONSULTASOLICITACAOPREIMPRESSOINPUTTYPE value) {
        this.consultasolicitacaopreimpresso = value;
    }

    /**
     * Obtém o valor da propriedade consultasolicitacoesgrupopagador.
     * 
     * @return
     *     possible object is
     *     {@link CONSULTASOLICITACOESGRUPOPAGADORINPUTTYPE }
     *     
     */
    public CONSULTASOLICITACOESGRUPOPAGADORINPUTTYPE getCONSULTASOLICITACOESGRUPOPAGADOR() {
        return consultasolicitacoesgrupopagador;
    }

    /**
     * Define o valor da propriedade consultasolicitacoesgrupopagador.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSULTASOLICITACOESGRUPOPAGADORINPUTTYPE }
     *     
     */
    public void setCONSULTASOLICITACOESGRUPOPAGADOR(CONSULTASOLICITACOESGRUPOPAGADORINPUTTYPE value) {
        this.consultasolicitacoesgrupopagador = value;
    }

    /**
     * Obtém o valor da propriedade consultasolicitacoespreimpresso.
     * 
     * @return
     *     possible object is
     *     {@link CONSULTASOLICITACOESPREIMPRESSOINPUTTYPE }
     *     
     */
    public CONSULTASOLICITACOESPREIMPRESSOINPUTTYPE getCONSULTASOLICITACOESPREIMPRESSO() {
        return consultasolicitacoespreimpresso;
    }

    /**
     * Define o valor da propriedade consultasolicitacoespreimpresso.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSULTASOLICITACOESPREIMPRESSOINPUTTYPE }
     *     
     */
    public void setCONSULTASOLICITACOESPREIMPRESSO(CONSULTASOLICITACOESPREIMPRESSOINPUTTYPE value) {
        this.consultasolicitacoespreimpresso = value;
    }

    /**
     * Obtém o valor da propriedade imprimeboleto.
     * 
     * @return
     *     possible object is
     *     {@link IMPRIMEBOLETOINPUTTYPE }
     *     
     */
    public IMPRIMEBOLETOINPUTTYPE getIMPRIMEBOLETO() {
        return imprimeboleto;
    }

    /**
     * Define o valor da propriedade imprimeboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link IMPRIMEBOLETOINPUTTYPE }
     *     
     */
    public void setIMPRIMEBOLETO(IMPRIMEBOLETOINPUTTYPE value) {
        this.imprimeboleto = value;
    }

    /**
     * Obtém o valor da propriedade consultaboleto.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoEntradaType }
     *     
     */
    public ConsultaBoletoEntradaType getCONSULTABOLETO() {
        return consultaboleto;
    }

    /**
     * Define o valor da propriedade consultaboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoEntradaType }
     *     
     */
    public void setCONSULTABOLETO(ConsultaBoletoEntradaType value) {
        this.consultaboleto = value;
    }

}
