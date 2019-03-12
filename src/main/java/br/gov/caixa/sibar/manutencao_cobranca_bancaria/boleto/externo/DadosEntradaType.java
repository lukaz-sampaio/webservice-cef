
package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_entrada_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_entrada_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="INCLUI_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}inclui_boleto_entrada_Type"/>
 *         &lt;element name="BAIXA_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}baixa_boleto_entrada_Type"/>
 *         &lt;element name="ALTERA_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_entrada_Type"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_entrada_Type", propOrder = {
    "incluiboleto",
    "baixaboleto",
    "alteraboleto"
})
public class DadosEntradaType {

    @XmlElement(name = "INCLUI_BOLETO")
    protected IncluiBoletoEntradaType incluiboleto;
    @XmlElement(name = "BAIXA_BOLETO")
    protected BaixaBoletoEntradaType baixaboleto;
    @XmlElement(name = "ALTERA_BOLETO")
    protected AlteraBoletoEntradaType alteraboleto;

    /**
     * Obtém o valor da propriedade incluiboleto.
     * 
     * @return
     *     possible object is
     *     {@link IncluiBoletoEntradaType }
     *     
     */
    public IncluiBoletoEntradaType getINCLUIBOLETO() {
        return incluiboleto;
    }

    /**
     * Define o valor da propriedade incluiboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link IncluiBoletoEntradaType }
     *     
     */
    public void setINCLUIBOLETO(IncluiBoletoEntradaType value) {
        this.incluiboleto = value;
    }

    /**
     * Obtém o valor da propriedade baixaboleto.
     * 
     * @return
     *     possible object is
     *     {@link BaixaBoletoEntradaType }
     *     
     */
    public BaixaBoletoEntradaType getBAIXABOLETO() {
        return baixaboleto;
    }

    /**
     * Define o valor da propriedade baixaboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link BaixaBoletoEntradaType }
     *     
     */
    public void setBAIXABOLETO(BaixaBoletoEntradaType value) {
        this.baixaboleto = value;
    }

    /**
     * Obtém o valor da propriedade alteraboleto.
     * 
     * @return
     *     possible object is
     *     {@link AlteraBoletoEntradaType }
     *     
     */
    public AlteraBoletoEntradaType getALTERABOLETO() {
        return alteraboleto;
    }

    /**
     * Define o valor da propriedade alteraboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link AlteraBoletoEntradaType }
     *     
     */
    public void setALTERABOLETO(AlteraBoletoEntradaType value) {
        this.alteraboleto = value;
    }

}
