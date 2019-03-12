
package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.AlteraBoletoEntradaType;


/**
 * <p>Classe Java de ALTERA_BOLETO_ENTRADA_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ALTERA_BOLETO_ENTRADA_TYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}altera_boleto_entrada_Type">
 *       &lt;sequence>
 *         &lt;element name="FLAG_REGISTRO" minOccurs="0">
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
@XmlType(name = "ALTERA_BOLETO_ENTRADA_TYPE", propOrder = {
    "flagregistro"
})
public class ALTERABOLETOENTRADATYPE
    extends AlteraBoletoEntradaType
{

    @XmlElement(name = "FLAG_REGISTRO")
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
