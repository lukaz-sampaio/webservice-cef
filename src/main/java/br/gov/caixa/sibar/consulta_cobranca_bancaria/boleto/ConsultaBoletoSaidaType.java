
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consulta_boleto_saida_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consulta_boleto_saida_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TITULO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_titulo_Type"/>
 *         &lt;element name="FLAG_REGISTRO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="N"/>
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
@XmlType(name = "consulta_boleto_saida_Type", propOrder = {
    "titulo",
    "flagregistro"
})
public class ConsultaBoletoSaidaType {

    @XmlElement(name = "TITULO", required = true)
    protected ConsultaBoletoTituloType titulo;
    @XmlElement(name = "FLAG_REGISTRO")
    protected String flagregistro;

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoTituloType }
     *     
     */
    public ConsultaBoletoTituloType getTITULO() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoTituloType }
     *     
     */
    public void setTITULO(ConsultaBoletoTituloType value) {
        this.titulo = value;
    }

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
