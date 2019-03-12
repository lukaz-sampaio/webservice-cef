
package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de INCLUI_SOLICITACAO_PRE_IMPRESSO_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="INCLUI_SOLICITACAO_PRE_IMPRESSO_TYPE">
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
 *         &lt;element name="NOSSO_NUMERO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_ENTREGA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QUANTIDADE_BLOQUETO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_BLOQUETO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_COBRANCA">
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
@XmlType(name = "INCLUI_SOLICITACAO_PRE_IMPRESSO_TYPE", propOrder = {
    "codigobeneficiario",
    "nossonumero",
    "tipoentrega",
    "quantidadebloqueto",
    "tipobloqueto",
    "tipocobranca"
})
public class INCLUISOLICITACAOPREIMPRESSOTYPE {

    @XmlElement(name = "CODIGO_BENEFICIARIO")
    protected int codigobeneficiario;
    @XmlElement(name = "NOSSO_NUMERO")
    protected Long nossonumero;
    @XmlElement(name = "TIPO_ENTREGA")
    protected short tipoentrega;
    @XmlElement(name = "QUANTIDADE_BLOQUETO")
    protected int quantidadebloqueto;
    @XmlElement(name = "TIPO_BLOQUETO")
    protected short tipobloqueto;
    @XmlElement(name = "TIPO_COBRANCA", required = true)
    protected String tipocobranca;

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
     * Obtém o valor da propriedade tipoentrega.
     * 
     */
    public short getTIPOENTREGA() {
        return tipoentrega;
    }

    /**
     * Define o valor da propriedade tipoentrega.
     * 
     */
    public void setTIPOENTREGA(short value) {
        this.tipoentrega = value;
    }

    /**
     * Obtém o valor da propriedade quantidadebloqueto.
     * 
     */
    public int getQUANTIDADEBLOQUETO() {
        return quantidadebloqueto;
    }

    /**
     * Define o valor da propriedade quantidadebloqueto.
     * 
     */
    public void setQUANTIDADEBLOQUETO(int value) {
        this.quantidadebloqueto = value;
    }

    /**
     * Obtém o valor da propriedade tipobloqueto.
     * 
     */
    public short getTIPOBLOQUETO() {
        return tipobloqueto;
    }

    /**
     * Define o valor da propriedade tipobloqueto.
     * 
     */
    public void setTIPOBLOQUETO(short value) {
        this.tipobloqueto = value;
    }

    /**
     * Obtém o valor da propriedade tipocobranca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCOBRANCA() {
        return tipocobranca;
    }

    /**
     * Define o valor da propriedade tipocobranca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCOBRANCA(String value) {
        this.tipocobranca = value;
    }

}
