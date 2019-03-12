
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IMPRIME_BOLETO_INPUT_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IMPRIME_BOLETO_INPUT_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="CODIGO_BENEFICIARIO">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   &lt;minInclusive value="0"/>
 *                   &lt;maxInclusive value="999999"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="NOSSO_NUMERO">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                   &lt;minInclusive value="0"/>
 *                   &lt;maxInclusive value="99999999999999999"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="LINHA_DIGITAVEL">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;length value="47"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
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
@XmlType(name = "IMPRIME_BOLETO_INPUT_TYPE", propOrder = {
    "codigobeneficiario",
    "nossonumero",
    "linhadigitavel"
})
public class IMPRIMEBOLETOINPUTTYPE {

    @XmlElement(name = "CODIGO_BENEFICIARIO")
    protected Integer codigobeneficiario;
    @XmlElement(name = "NOSSO_NUMERO")
    protected Long nossonumero;
    @XmlElement(name = "LINHA_DIGITAVEL")
    protected String linhadigitavel;

    /**
     * Obtém o valor da propriedade codigobeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCODIGOBENEFICIARIO() {
        return codigobeneficiario;
    }

    /**
     * Define o valor da propriedade codigobeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCODIGOBENEFICIARIO(Integer value) {
        this.codigobeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade nossonumero.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNOSSONUMERO() {
        return nossonumero;
    }

    /**
     * Define o valor da propriedade nossonumero.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNOSSONUMERO(Long value) {
        this.nossonumero = value;
    }

    /**
     * Obtém o valor da propriedade linhadigitavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINHADIGITAVEL() {
        return linhadigitavel;
    }

    /**
     * Define o valor da propriedade linhadigitavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINHADIGITAVEL(String value) {
        this.linhadigitavel = value;
    }

}
