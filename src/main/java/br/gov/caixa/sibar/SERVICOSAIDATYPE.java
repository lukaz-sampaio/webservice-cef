
package br.gov.caixa.sibar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.SERVICOSAIDANEGOCIALTYPE;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.ServicoSaidaNegocialType;


/**
 * <p>Classe Java de SERVICO_SAIDA_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SERVICO_SAIDA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://caixa.gov.br/sibar}HEADER"/>
 *         &lt;element name="COD_RETORNO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ORIGEM_RETORNO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSG_RETORNO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
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
@XmlType(name = "SERVICO_SAIDA_TYPE", propOrder = {
    "header",
    "codretorno",
    "origemretorno",
    "msgretorno"
})
@XmlSeeAlso({
    SERVICOSAIDANEGOCIALTYPE.class,
    ServicoSaidaNegocialType.class
})
public class SERVICOSAIDATYPE {

    @XmlElement(name = "HEADER", namespace = "http://caixa.gov.br/sibar", required = true)
    protected HEADERBARRAMENTOTYPE header;
    @XmlElement(name = "COD_RETORNO", required = true)
    protected String codretorno;
    @XmlElement(name = "ORIGEM_RETORNO", required = true)
    protected String origemretorno;
    @XmlElement(name = "MSG_RETORNO", required = true)
    protected String msgretorno;

    /**
     * Obtém o valor da propriedade header.
     * 
     * @return
     *     possible object is
     *     {@link HEADERBARRAMENTOTYPE }
     *     
     */
    public HEADERBARRAMENTOTYPE getHEADER() {
        return header;
    }

    /**
     * Define o valor da propriedade header.
     * 
     * @param value
     *     allowed object is
     *     {@link HEADERBARRAMENTOTYPE }
     *     
     */
    public void setHEADER(HEADERBARRAMENTOTYPE value) {
        this.header = value;
    }

    /**
     * Obtém o valor da propriedade codretorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODRETORNO() {
        return codretorno;
    }

    /**
     * Define o valor da propriedade codretorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODRETORNO(String value) {
        this.codretorno = value;
    }

    /**
     * Obtém o valor da propriedade origemretorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGEMRETORNO() {
        return origemretorno;
    }

    /**
     * Define o valor da propriedade origemretorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGEMRETORNO(String value) {
        this.origemretorno = value;
    }

    /**
     * Obtém o valor da propriedade msgretorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGRETORNO() {
        return msgretorno;
    }

    /**
     * Define o valor da propriedade msgretorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGRETORNO(String value) {
        this.msgretorno = value;
    }

}
