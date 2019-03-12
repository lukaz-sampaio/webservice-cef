
package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pagador_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pagador_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="CPF" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}cpf_Type"/>
 *             &lt;element name="NOME">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;maxLength value="40"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="CNPJ" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}cnpj_Type"/>
 *             &lt;element name="RAZAO_SOCIAL">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;maxLength value="40"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="ENDERECO" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}endereco_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagador_Type", propOrder = {
    "cpf",
    "nome",
    "cnpj",
    "razaosocial",
    "endereco"
})
public class PagadorType {

    @XmlElement(name = "CPF")
    protected Long cpf;
    @XmlElement(name = "NOME")
    protected String nome;
    @XmlElement(name = "CNPJ")
    protected Long cnpj;
    @XmlElement(name = "RAZAO_SOCIAL")
    protected String razaosocial;
    @XmlElement(name = "ENDERECO")
    protected EnderecoType endereco;

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCPF(Long value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOME() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOME(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCNPJ(Long value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade razaosocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAZAOSOCIAL() {
        return razaosocial;
    }

    /**
     * Define o valor da propriedade razaosocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAZAOSOCIAL(String value) {
        this.razaosocial = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoType }
     *     
     */
    public EnderecoType getENDERECO() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoType }
     *     
     */
    public void setENDERECO(EnderecoType value) {
        this.endereco = value;
    }

}
