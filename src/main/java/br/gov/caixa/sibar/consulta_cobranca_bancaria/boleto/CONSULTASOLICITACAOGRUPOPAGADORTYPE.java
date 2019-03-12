
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATA_VENCIMENTO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="VALOR_TITULO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRAZO_PROTESTO_DEVOLUCAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESCRICOES" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}DESCRICOES_TYPE"/>
 *         &lt;element name="COMPLEMENTARES" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}COMPLEMENTARES_TYPE" minOccurs="0"/>
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
@XmlType(name = "CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE", propOrder = {
    "datavencimento",
    "valortitulo",
    "prazoprotestodevolucao",
    "descricoes",
    "complementares",
    "situacao"
})
public class CONSULTASOLICITACAOGRUPOPAGADORTYPE {

    @XmlElement(name = "DATA_VENCIMENTO", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datavencimento;
    @XmlElement(name = "VALOR_TITULO", required = true)
    protected BigDecimal valortitulo;
    @XmlElement(name = "PRAZO_PROTESTO_DEVOLUCAO")
    protected short prazoprotestodevolucao;
    @XmlElement(name = "DESCRICOES", required = true)
    protected DESCRICOESTYPE descricoes;
    @XmlElement(name = "COMPLEMENTARES")
    protected COMPLEMENTARESTYPE complementares;
    @XmlElement(name = "SITUACAO", required = true)
    protected String situacao;

    /**
     * Obtém o valor da propriedade datavencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAVENCIMENTO() {
        return datavencimento;
    }

    /**
     * Define o valor da propriedade datavencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAVENCIMENTO(XMLGregorianCalendar value) {
        this.datavencimento = value;
    }

    /**
     * Obtém o valor da propriedade valortitulo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALORTITULO() {
        return valortitulo;
    }

    /**
     * Define o valor da propriedade valortitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALORTITULO(BigDecimal value) {
        this.valortitulo = value;
    }

    /**
     * Obtém o valor da propriedade prazoprotestodevolucao.
     * 
     */
    public short getPRAZOPROTESTODEVOLUCAO() {
        return prazoprotestodevolucao;
    }

    /**
     * Define o valor da propriedade prazoprotestodevolucao.
     * 
     */
    public void setPRAZOPROTESTODEVOLUCAO(short value) {
        this.prazoprotestodevolucao = value;
    }

    /**
     * Obtém o valor da propriedade descricoes.
     * 
     * @return
     *     possible object is
     *     {@link DESCRICOESTYPE }
     *     
     */
    public DESCRICOESTYPE getDESCRICOES() {
        return descricoes;
    }

    /**
     * Define o valor da propriedade descricoes.
     * 
     * @param value
     *     allowed object is
     *     {@link DESCRICOESTYPE }
     *     
     */
    public void setDESCRICOES(DESCRICOESTYPE value) {
        this.descricoes = value;
    }

    /**
     * Obtém o valor da propriedade complementares.
     * 
     * @return
     *     possible object is
     *     {@link COMPLEMENTARESTYPE }
     *     
     */
    public COMPLEMENTARESTYPE getCOMPLEMENTARES() {
        return complementares;
    }

    /**
     * Define o valor da propriedade complementares.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPLEMENTARESTYPE }
     *     
     */
    public void setCOMPLEMENTARES(COMPLEMENTARESTYPE value) {
        this.complementares = value;
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
