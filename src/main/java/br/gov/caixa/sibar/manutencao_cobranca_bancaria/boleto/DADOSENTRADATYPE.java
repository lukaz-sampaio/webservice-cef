
package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto;

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
 *           &lt;element name="INCLUI_SOLICITACAO_PRE_IMPRESSO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}INCLUI_SOLICITACAO_PRE_IMPRESSO_TYPE"/>
 *           &lt;element name="ALTERA_SOLICITACAO_PRE_IMPRESSO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}ALTERA_SOLICITACAO_PRE_IMPRESSO_TYPE"/>
 *           &lt;element name="EXCLUI_SOLICITACAO_PRE_IMPRESSO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}EXCLUI_SOLICITACAO_PRE_IMPRESSO_TYPE"/>
 *           &lt;element name="INCLUI_SOLICITACAO_GRUPO_PAGADOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}INCLUI_ALTERA_SOLICITACAO_GRUPO_PAGADOR_TYPE"/>
 *           &lt;element name="ALTERA_SOLICITACAO_GRUPO_PAGADOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}INCLUI_ALTERA_SOLICITACAO_GRUPO_PAGADOR_TYPE"/>
 *           &lt;element name="EXCLUI_SOLICITACAO_GRUPO_PAGADOR" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}EXCLUI_SOLICITACAO_GRUPO_PAGADOR_TYPE"/>
 *           &lt;element name="INCLUI_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}INCLUI_BOLETO_ENTRADA_TYPE"/>
 *           &lt;element name="ALTERA_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}ALTERA_BOLETO_ENTRADA_TYPE"/>
 *           &lt;element name="BAIXA_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}BAIXA_BOLETO_ENTRADA_TYPE"/>
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
    "incluisolicitacaopreimpresso",
    "alterasolicitacaopreimpresso",
    "excluisolicitacaopreimpresso",
    "incluisolicitacaogrupopagador",
    "alterasolicitacaogrupopagador",
    "excluisolicitacaogrupopagador",
    "incluiboleto",
    "alteraboleto",
    "baixaboleto"
})
public class DADOSENTRADATYPE {

    @XmlElement(name = "INCLUI_SOLICITACAO_PRE_IMPRESSO")
    protected INCLUISOLICITACAOPREIMPRESSOTYPE incluisolicitacaopreimpresso;
    @XmlElement(name = "ALTERA_SOLICITACAO_PRE_IMPRESSO")
    protected ALTERASOLICITACAOPREIMPRESSOTYPE alterasolicitacaopreimpresso;
    @XmlElement(name = "EXCLUI_SOLICITACAO_PRE_IMPRESSO")
    protected EXCLUISOLICITACAOPREIMPRESSOTYPE excluisolicitacaopreimpresso;
    @XmlElement(name = "INCLUI_SOLICITACAO_GRUPO_PAGADOR")
    protected INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE incluisolicitacaogrupopagador;
    @XmlElement(name = "ALTERA_SOLICITACAO_GRUPO_PAGADOR")
    protected INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE alterasolicitacaogrupopagador;
    @XmlElement(name = "EXCLUI_SOLICITACAO_GRUPO_PAGADOR")
    protected EXCLUISOLICITACAOGRUPOPAGADORTYPE excluisolicitacaogrupopagador;
    @XmlElement(name = "INCLUI_BOLETO")
    protected INCLUIBOLETOENTRADATYPE incluiboleto;
    @XmlElement(name = "ALTERA_BOLETO")
    protected ALTERABOLETOENTRADATYPE alteraboleto;
    @XmlElement(name = "BAIXA_BOLETO")
    protected BAIXABOLETOENTRADATYPE baixaboleto;

    /**
     * Obtém o valor da propriedade incluisolicitacaopreimpresso.
     * 
     * @return
     *     possible object is
     *     {@link INCLUISOLICITACAOPREIMPRESSOTYPE }
     *     
     */
    public INCLUISOLICITACAOPREIMPRESSOTYPE getINCLUISOLICITACAOPREIMPRESSO() {
        return incluisolicitacaopreimpresso;
    }

    /**
     * Define o valor da propriedade incluisolicitacaopreimpresso.
     * 
     * @param value
     *     allowed object is
     *     {@link INCLUISOLICITACAOPREIMPRESSOTYPE }
     *     
     */
    public void setINCLUISOLICITACAOPREIMPRESSO(INCLUISOLICITACAOPREIMPRESSOTYPE value) {
        this.incluisolicitacaopreimpresso = value;
    }

    /**
     * Obtém o valor da propriedade alterasolicitacaopreimpresso.
     * 
     * @return
     *     possible object is
     *     {@link ALTERASOLICITACAOPREIMPRESSOTYPE }
     *     
     */
    public ALTERASOLICITACAOPREIMPRESSOTYPE getALTERASOLICITACAOPREIMPRESSO() {
        return alterasolicitacaopreimpresso;
    }

    /**
     * Define o valor da propriedade alterasolicitacaopreimpresso.
     * 
     * @param value
     *     allowed object is
     *     {@link ALTERASOLICITACAOPREIMPRESSOTYPE }
     *     
     */
    public void setALTERASOLICITACAOPREIMPRESSO(ALTERASOLICITACAOPREIMPRESSOTYPE value) {
        this.alterasolicitacaopreimpresso = value;
    }

    /**
     * Obtém o valor da propriedade excluisolicitacaopreimpresso.
     * 
     * @return
     *     possible object is
     *     {@link EXCLUISOLICITACAOPREIMPRESSOTYPE }
     *     
     */
    public EXCLUISOLICITACAOPREIMPRESSOTYPE getEXCLUISOLICITACAOPREIMPRESSO() {
        return excluisolicitacaopreimpresso;
    }

    /**
     * Define o valor da propriedade excluisolicitacaopreimpresso.
     * 
     * @param value
     *     allowed object is
     *     {@link EXCLUISOLICITACAOPREIMPRESSOTYPE }
     *     
     */
    public void setEXCLUISOLICITACAOPREIMPRESSO(EXCLUISOLICITACAOPREIMPRESSOTYPE value) {
        this.excluisolicitacaopreimpresso = value;
    }

    /**
     * Obtém o valor da propriedade incluisolicitacaogrupopagador.
     * 
     * @return
     *     possible object is
     *     {@link INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE }
     *     
     */
    public INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE getINCLUISOLICITACAOGRUPOPAGADOR() {
        return incluisolicitacaogrupopagador;
    }

    /**
     * Define o valor da propriedade incluisolicitacaogrupopagador.
     * 
     * @param value
     *     allowed object is
     *     {@link INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE }
     *     
     */
    public void setINCLUISOLICITACAOGRUPOPAGADOR(INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE value) {
        this.incluisolicitacaogrupopagador = value;
    }

    /**
     * Obtém o valor da propriedade alterasolicitacaogrupopagador.
     * 
     * @return
     *     possible object is
     *     {@link INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE }
     *     
     */
    public INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE getALTERASOLICITACAOGRUPOPAGADOR() {
        return alterasolicitacaogrupopagador;
    }

    /**
     * Define o valor da propriedade alterasolicitacaogrupopagador.
     * 
     * @param value
     *     allowed object is
     *     {@link INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE }
     *     
     */
    public void setALTERASOLICITACAOGRUPOPAGADOR(INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE value) {
        this.alterasolicitacaogrupopagador = value;
    }

    /**
     * Obtém o valor da propriedade excluisolicitacaogrupopagador.
     * 
     * @return
     *     possible object is
     *     {@link EXCLUISOLICITACAOGRUPOPAGADORTYPE }
     *     
     */
    public EXCLUISOLICITACAOGRUPOPAGADORTYPE getEXCLUISOLICITACAOGRUPOPAGADOR() {
        return excluisolicitacaogrupopagador;
    }

    /**
     * Define o valor da propriedade excluisolicitacaogrupopagador.
     * 
     * @param value
     *     allowed object is
     *     {@link EXCLUISOLICITACAOGRUPOPAGADORTYPE }
     *     
     */
    public void setEXCLUISOLICITACAOGRUPOPAGADOR(EXCLUISOLICITACAOGRUPOPAGADORTYPE value) {
        this.excluisolicitacaogrupopagador = value;
    }

    /**
     * Obtém o valor da propriedade incluiboleto.
     * 
     * @return
     *     possible object is
     *     {@link INCLUIBOLETOENTRADATYPE }
     *     
     */
    public INCLUIBOLETOENTRADATYPE getINCLUIBOLETO() {
        return incluiboleto;
    }

    /**
     * Define o valor da propriedade incluiboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link INCLUIBOLETOENTRADATYPE }
     *     
     */
    public void setINCLUIBOLETO(INCLUIBOLETOENTRADATYPE value) {
        this.incluiboleto = value;
    }

    /**
     * Obtém o valor da propriedade alteraboleto.
     * 
     * @return
     *     possible object is
     *     {@link ALTERABOLETOENTRADATYPE }
     *     
     */
    public ALTERABOLETOENTRADATYPE getALTERABOLETO() {
        return alteraboleto;
    }

    /**
     * Define o valor da propriedade alteraboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link ALTERABOLETOENTRADATYPE }
     *     
     */
    public void setALTERABOLETO(ALTERABOLETOENTRADATYPE value) {
        this.alteraboleto = value;
    }

    /**
     * Obtém o valor da propriedade baixaboleto.
     * 
     * @return
     *     possible object is
     *     {@link BAIXABOLETOENTRADATYPE }
     *     
     */
    public BAIXABOLETOENTRADATYPE getBAIXABOLETO() {
        return baixaboleto;
    }

    /**
     * Define o valor da propriedade baixaboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link BAIXABOLETOENTRADATYPE }
     *     
     */
    public void setBAIXABOLETO(BAIXABOLETOENTRADATYPE value) {
        this.baixaboleto = value;
    }

}
