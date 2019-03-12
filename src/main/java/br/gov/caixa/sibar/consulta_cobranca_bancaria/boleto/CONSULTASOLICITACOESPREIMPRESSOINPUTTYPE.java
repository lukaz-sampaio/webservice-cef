
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_BENEFICIARIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_BOLETO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_INICIO" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DATA_FIM" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FLAG_SITUACAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAGINA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999"/>
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
@XmlType(name = "CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE", propOrder = {
    "codigobeneficiario",
    "tipoboleto",
    "datainicio",
    "datafim",
    "flagsituacao",
    "pagina"
})
public class CONSULTASOLICITACOESPREIMPRESSOINPUTTYPE {

    @XmlElement(name = "CODIGO_BENEFICIARIO")
    protected int codigobeneficiario;
    @XmlElement(name = "TIPO_BOLETO")
    protected String tipoboleto;
    @XmlElement(name = "DATA_INICIO")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datainicio;
    @XmlElement(name = "DATA_FIM")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datafim;
    @XmlElement(name = "FLAG_SITUACAO", required = true)
    protected String flagsituacao;
    @XmlElement(name = "PAGINA")
    protected int pagina;

    /**
     * Obtém o valor da propriedade codigobeneficiario.
     * 
     */
    public int getCODIGOBENEFICIARIO() {
        return codigobeneficiario;
    }

    /**
     * Define o valor da propriedade codigobeneficiario.
     * 
     */
    public void setCODIGOBENEFICIARIO(int value) {
        this.codigobeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade tipoboleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOBOLETO() {
        return tipoboleto;
    }

    /**
     * Define o valor da propriedade tipoboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOBOLETO(String value) {
        this.tipoboleto = value;
    }

    /**
     * Obtém o valor da propriedade datainicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAINICIO() {
        return datainicio;
    }

    /**
     * Define o valor da propriedade datainicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAINICIO(XMLGregorianCalendar value) {
        this.datainicio = value;
    }

    /**
     * Obtém o valor da propriedade datafim.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAFIM() {
        return datafim;
    }

    /**
     * Define o valor da propriedade datafim.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAFIM(XMLGregorianCalendar value) {
        this.datafim = value;
    }

    /**
     * Obtém o valor da propriedade flagsituacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGSITUACAO() {
        return flagsituacao;
    }

    /**
     * Define o valor da propriedade flagsituacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGSITUACAO(String value) {
        this.flagsituacao = value;
    }

    /**
     * Obtém o valor da propriedade pagina.
     * 
     */
    public int getPAGINA() {
        return pagina;
    }

    /**
     * Define o valor da propriedade pagina.
     * 
     */
    public void setPAGINA(int value) {
        this.pagina = value;
    }

}
