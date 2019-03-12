
package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto;

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
 *       &lt;choice>
 *         &lt;element name="COMPROVANTE" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}COMPROVANTE_TYPE" minOccurs="0"/>
 *         &lt;element name="INCLUI_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}INCLUI_BOLETO_SAIDA_TYPE" minOccurs="0"/>
 *         &lt;element name="ALTERA_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}ALTERA_BOLETO_SAIDA_TYPE" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DADOS_SAIDA_TYPE", propOrder = {
    "comprovante",
    "incluiboleto",
    "alteraboleto"
})
public class DADOSSAIDATYPE
    extends br.gov.caixa.sibar.DADOSSAIDATYPE
{

    @XmlElement(name = "COMPROVANTE")
    protected COMPROVANTETYPE comprovante;
    @XmlElement(name = "INCLUI_BOLETO")
    protected INCLUIBOLETOSAIDATYPE incluiboleto;
    @XmlElement(name = "ALTERA_BOLETO")
    protected ALTERABOLETOSAIDATYPE alteraboleto;

    /**
     * Obtém o valor da propriedade comprovante.
     * 
     * @return
     *     possible object is
     *     {@link COMPROVANTETYPE }
     *     
     */
    public COMPROVANTETYPE getCOMPROVANTE() {
        return comprovante;
    }

    /**
     * Define o valor da propriedade comprovante.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPROVANTETYPE }
     *     
     */
    public void setCOMPROVANTE(COMPROVANTETYPE value) {
        this.comprovante = value;
    }

    /**
     * Obtém o valor da propriedade incluiboleto.
     * 
     * @return
     *     possible object is
     *     {@link INCLUIBOLETOSAIDATYPE }
     *     
     */
    public INCLUIBOLETOSAIDATYPE getINCLUIBOLETO() {
        return incluiboleto;
    }

    /**
     * Define o valor da propriedade incluiboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link INCLUIBOLETOSAIDATYPE }
     *     
     */
    public void setINCLUIBOLETO(INCLUIBOLETOSAIDATYPE value) {
        this.incluiboleto = value;
    }

    /**
     * Obtém o valor da propriedade alteraboleto.
     * 
     * @return
     *     possible object is
     *     {@link ALTERABOLETOSAIDATYPE }
     *     
     */
    public ALTERABOLETOSAIDATYPE getALTERABOLETO() {
        return alteraboleto;
    }

    /**
     * Define o valor da propriedade alteraboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link ALTERABOLETOSAIDATYPE }
     *     
     */
    public void setALTERABOLETO(ALTERABOLETOSAIDATYPE value) {
        this.alteraboleto = value;
    }

}
