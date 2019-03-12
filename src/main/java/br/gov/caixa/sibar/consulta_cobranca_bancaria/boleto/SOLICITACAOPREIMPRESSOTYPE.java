
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SOLICITACAO_PRE_IMPRESSO_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SOLICITACAO_PRE_IMPRESSO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATA_SOLICITACAO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="QUANTIDADE_BOLETOS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOSSO_NUMERO_INICIAL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESCRICAO_TIPO_ENTREGA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESCRICAO_TIPO_BOLETO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SITUACAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
@XmlType(name = "SOLICITACAO_PRE_IMPRESSO_TYPE", propOrder = {
    "datasolicitacao",
    "quantidadeboletos",
    "nossonumeroinicial",
    "descricaotipoentrega",
    "descricaotipoboleto",
    "situacao"
})
public class SOLICITACAOPREIMPRESSOTYPE {

    @XmlElement(name = "DATA_SOLICITACAO", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datasolicitacao;
    @XmlElement(name = "QUANTIDADE_BOLETOS")
    protected int quantidadeboletos;
    @XmlElement(name = "NOSSO_NUMERO_INICIAL")
    protected long nossonumeroinicial;
    @XmlElement(name = "DESCRICAO_TIPO_ENTREGA", required = true)
    protected String descricaotipoentrega;
    @XmlElement(name = "DESCRICAO_TIPO_BOLETO", required = true)
    protected String descricaotipoboleto;
    @XmlElement(name = "SITUACAO", required = true)
    protected String situacao;

    /**
     * Obtém o valor da propriedade datasolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATASOLICITACAO() {
        return datasolicitacao;
    }

    /**
     * Define o valor da propriedade datasolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATASOLICITACAO(XMLGregorianCalendar value) {
        this.datasolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeboletos.
     * 
     */
    public int getQUANTIDADEBOLETOS() {
        return quantidadeboletos;
    }

    /**
     * Define o valor da propriedade quantidadeboletos.
     * 
     */
    public void setQUANTIDADEBOLETOS(int value) {
        this.quantidadeboletos = value;
    }

    /**
     * Obtém o valor da propriedade nossonumeroinicial.
     * 
     */
    public long getNOSSONUMEROINICIAL() {
        return nossonumeroinicial;
    }

    /**
     * Define o valor da propriedade nossonumeroinicial.
     * 
     */
    public void setNOSSONUMEROINICIAL(long value) {
        this.nossonumeroinicial = value;
    }

    /**
     * Obtém o valor da propriedade descricaotipoentrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRICAOTIPOENTREGA() {
        return descricaotipoentrega;
    }

    /**
     * Define o valor da propriedade descricaotipoentrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRICAOTIPOENTREGA(String value) {
        this.descricaotipoentrega = value;
    }

    /**
     * Obtém o valor da propriedade descricaotipoboleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRICAOTIPOBOLETO() {
        return descricaotipoboleto;
    }

    /**
     * Define o valor da propriedade descricaotipoboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRICAOTIPOBOLETO(String value) {
        this.descricaotipoboleto = value;
    }

    /**
     * Obtém o valor da propriedade situacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITUACAO() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITUACAO(String value) {
        this.situacao = value;
    }

}
