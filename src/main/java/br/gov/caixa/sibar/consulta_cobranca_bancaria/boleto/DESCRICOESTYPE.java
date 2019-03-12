
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DESCRICOES_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DESCRICOES_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REGISTRO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OBTER_ENVIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ENVIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OBTER_VALOR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROTESTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ESPECIE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACEITE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ENDOSSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESCRICOES_TYPE", propOrder = {
    "registro",
    "obterenvio",
    "envio",
    "obtervalor",
    "protesto",
    "especie",
    "aceite",
    "endosso"
})
public class DESCRICOESTYPE {

    @XmlElement(name = "REGISTRO", required = true)
    protected String registro;
    @XmlElement(name = "OBTER_ENVIO", required = true)
    protected String obterenvio;
    @XmlElement(name = "ENVIO", required = true)
    protected String envio;
    @XmlElement(name = "OBTER_VALOR", required = true)
    protected String obtervalor;
    @XmlElement(name = "PROTESTO", required = true)
    protected String protesto;
    @XmlElement(name = "ESPECIE", required = true)
    protected String especie;
    @XmlElement(name = "ACEITE", required = true)
    protected String aceite;
    @XmlElement(name = "ENDOSSO", required = true)
    protected String endosso;

    /**
     * Obtém o valor da propriedade registro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGISTRO() {
        return registro;
    }

    /**
     * Define o valor da propriedade registro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGISTRO(String value) {
        this.registro = value;
    }

    /**
     * Obtém o valor da propriedade obterenvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBTERENVIO() {
        return obterenvio;
    }

    /**
     * Define o valor da propriedade obterenvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBTERENVIO(String value) {
        this.obterenvio = value;
    }

    /**
     * Obtém o valor da propriedade envio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENVIO() {
        return envio;
    }

    /**
     * Define o valor da propriedade envio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENVIO(String value) {
        this.envio = value;
    }

    /**
     * Obtém o valor da propriedade obtervalor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBTERVALOR() {
        return obtervalor;
    }

    /**
     * Define o valor da propriedade obtervalor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBTERVALOR(String value) {
        this.obtervalor = value;
    }

    /**
     * Obtém o valor da propriedade protesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROTESTO() {
        return protesto;
    }

    /**
     * Define o valor da propriedade protesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROTESTO(String value) {
        this.protesto = value;
    }

    /**
     * Obtém o valor da propriedade especie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESPECIE() {
        return especie;
    }

    /**
     * Define o valor da propriedade especie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESPECIE(String value) {
        this.especie = value;
    }

    /**
     * Obtém o valor da propriedade aceite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACEITE() {
        return aceite;
    }

    /**
     * Define o valor da propriedade aceite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACEITE(String value) {
        this.aceite = value;
    }

    /**
     * Obtém o valor da propriedade endosso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDOSSO() {
        return endosso;
    }

    /**
     * Define o valor da propriedade endosso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDOSSO(String value) {
        this.endosso = value;
    }

}
