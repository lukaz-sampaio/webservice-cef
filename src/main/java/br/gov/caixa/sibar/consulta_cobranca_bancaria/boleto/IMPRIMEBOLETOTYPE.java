
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IMPRIME_BOLETO_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IMPRIME_BOLETO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CEDENTE" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}CEDENTE_TYPE"/>
 *         &lt;element name="SACADO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}SACADO_TYPE"/>
 *         &lt;element name="SACADOR" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}SACADOR_TYPE"/>
 *         &lt;element name="TITULO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}TITULO_TYPE"/>
 *         &lt;element name="VALOR" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}VALOR_TYPE"/>
 *         &lt;element name="MENSAGENS" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}MENSAGENS_TYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMPRIME_BOLETO_TYPE", propOrder = {
    "cedente",
    "sacado",
    "sacador",
    "titulo",
    "valor",
    "mensagens"
})
public class IMPRIMEBOLETOTYPE {

    @XmlElement(name = "CEDENTE", required = true)
    protected CEDENTETYPE cedente;
    @XmlElement(name = "SACADO", required = true)
    protected SACADOTYPE sacado;
    @XmlElement(name = "SACADOR", required = true)
    protected SACADORTYPE sacador;
    @XmlElement(name = "TITULO", required = true)
    protected TITULOTYPE titulo;
    @XmlElement(name = "VALOR", required = true)
    protected VALORTYPE valor;
    @XmlElement(name = "MENSAGENS")
    protected MENSAGENSTYPE mensagens;

    /**
     * Obtém o valor da propriedade cedente.
     * 
     * @return
     *     possible object is
     *     {@link CEDENTETYPE }
     *     
     */
    public CEDENTETYPE getCEDENTE() {
        return cedente;
    }

    /**
     * Define o valor da propriedade cedente.
     * 
     * @param value
     *     allowed object is
     *     {@link CEDENTETYPE }
     *     
     */
    public void setCEDENTE(CEDENTETYPE value) {
        this.cedente = value;
    }

    /**
     * Obtém o valor da propriedade sacado.
     * 
     * @return
     *     possible object is
     *     {@link SACADOTYPE }
     *     
     */
    public SACADOTYPE getSACADO() {
        return sacado;
    }

    /**
     * Define o valor da propriedade sacado.
     * 
     * @param value
     *     allowed object is
     *     {@link SACADOTYPE }
     *     
     */
    public void setSACADO(SACADOTYPE value) {
        this.sacado = value;
    }

    /**
     * Obtém o valor da propriedade sacador.
     * 
     * @return
     *     possible object is
     *     {@link SACADORTYPE }
     *     
     */
    public SACADORTYPE getSACADOR() {
        return sacador;
    }

    /**
     * Define o valor da propriedade sacador.
     * 
     * @param value
     *     allowed object is
     *     {@link SACADORTYPE }
     *     
     */
    public void setSACADOR(SACADORTYPE value) {
        this.sacador = value;
    }

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link TITULOTYPE }
     *     
     */
    public TITULOTYPE getTITULO() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link TITULOTYPE }
     *     
     */
    public void setTITULO(TITULOTYPE value) {
        this.titulo = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link VALORTYPE }
     *     
     */
    public VALORTYPE getVALOR() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link VALORTYPE }
     *     
     */
    public void setVALOR(VALORTYPE value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade mensagens.
     * 
     * @return
     *     possible object is
     *     {@link MENSAGENSTYPE }
     *     
     */
    public MENSAGENSTYPE getMENSAGENS() {
        return mensagens;
    }

    /**
     * Define o valor da propriedade mensagens.
     * 
     * @param value
     *     allowed object is
     *     {@link MENSAGENSTYPE }
     *     
     */
    public void setMENSAGENS(MENSAGENSTYPE value) {
        this.mensagens = value;
    }

}
