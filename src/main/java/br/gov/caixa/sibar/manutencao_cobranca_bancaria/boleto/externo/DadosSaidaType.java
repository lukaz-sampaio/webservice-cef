
package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.caixa.sibar.DADOSSAIDATYPE;


/**
 * <p>Classe Java de dados_saida_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_saida_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caixa.gov.br/sibar}DADOS_SAIDA_TYPE">
 *       &lt;choice>
 *         &lt;element name="INCLUI_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}inclui_boleto_saida_Type"/>
 *         &lt;element name="ALTERA_BOLETO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_saida_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_saida_Type", propOrder = {
    "incluiboleto",
    "alteraboleto"
})
public class DadosSaidaType
    extends DADOSSAIDATYPE
{

    @XmlElement(name = "INCLUI_BOLETO")
    protected IncluiBoletoSaidaType incluiboleto;
    @XmlElement(name = "ALTERA_BOLETO")
    protected AlteraBoletoSaidaType alteraboleto;

    /**
     * Obtém o valor da propriedade incluiboleto.
     * 
     * @return
     *     possible object is
     *     {@link IncluiBoletoSaidaType }
     *     
     */
    public IncluiBoletoSaidaType getINCLUIBOLETO() {
        return incluiboleto;
    }

    /**
     * Define o valor da propriedade incluiboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link IncluiBoletoSaidaType }
     *     
     */
    public void setINCLUIBOLETO(IncluiBoletoSaidaType value) {
        this.incluiboleto = value;
    }

    /**
     * Obtém o valor da propriedade alteraboleto.
     * 
     * @return
     *     possible object is
     *     {@link AlteraBoletoSaidaType }
     *     
     */
    public AlteraBoletoSaidaType getALTERABOLETO() {
        return alteraboleto;
    }

    /**
     * Define o valor da propriedade alteraboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link AlteraBoletoSaidaType }
     *     
     */
    public void setALTERABOLETO(AlteraBoletoSaidaType value) {
        this.alteraboleto = value;
    }

}
