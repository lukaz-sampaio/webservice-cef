
package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.IncluiBoletoEntradaType;


/**
 * <p>Classe Java de INCLUI_BOLETO_ENTRADA_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="INCLUI_BOLETO_ENTRADA_TYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}inclui_boleto_entrada_Type">
 *       &lt;sequence>
 *         &lt;element name="FLAG_REGISTRO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="N"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INCLUI_BOLETO_ENTRADA_TYPE", propOrder = {
    "flagregistro"
})
public class INCLUIBOLETOENTRADATYPE
    extends IncluiBoletoEntradaType
{

    @XmlElement(name = "FLAG_REGISTRO", required = true)
    protected String flagregistro;

    /**
     * Obtém o valor da propriedade flagregistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGREGISTRO() {
        return flagregistro;
    }

    /**
     * Define o valor da propriedade flagregistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGREGISTRO(String value) {
        this.flagregistro = value;
    }

}
