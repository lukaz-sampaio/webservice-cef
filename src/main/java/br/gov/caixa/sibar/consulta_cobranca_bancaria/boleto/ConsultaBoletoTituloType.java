
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de consulta_boleto_titulo_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consulta_boleto_titulo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMERO_DOCUMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_VENCIMENTO" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="VALOR" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}valor_Type"/>
 *         &lt;element name="TIPO_ESPECIE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLAG_ACEITE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="N"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_EMISSAO" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="JUROS_MORA" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_juros_mora_Type"/>
 *         &lt;element name="VALOR_ABATIMENTO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}valor_Type"/>
 *         &lt;element name="POS_VENCIMENTO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_pos_vencimento_Type"/>
 *         &lt;element name="CODIGO_MOEDA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAGADOR" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_pagador_Type"/>
 *         &lt;element name="SACADOR_AVALISTA" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_sacador_avalista_Type" minOccurs="0"/>
 *         &lt;element name="MULTA" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_multa_Type" minOccurs="0"/>
 *         &lt;element name="DESCONTOS" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_descontos_Type" minOccurs="0"/>
 *         &lt;element name="VALOR_IOF" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}valor_Type" minOccurs="0"/>
 *         &lt;element name="IDENTIFICACAO_EMPRESA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FICHA_COMPENSACAO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_ficha_compensacao_Type" minOccurs="0"/>
 *         &lt;element name="RECIBO_PAGADOR" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_recibo_pagador_Type" minOccurs="0"/>
 *         &lt;element name="PAGAMENTO" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_pagamento_Type" minOccurs="0"/>
 *         &lt;element name="CODIGO_BARRAS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="44"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LINHA_DIGITAVEL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="47"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="URL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
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
@XmlType(name = "consulta_boleto_titulo_Type", propOrder = {
    "numerodocumento",
    "datavencimento",
    "valor",
    "tipoespecie",
    "flagaceite",
    "dataemissao",
    "jurosmora",
    "valorabatimento",
    "posvencimento",
    "codigomoeda",
    "pagador",
    "sacadoravalista",
    "multa",
    "descontos",
    "valoriof",
    "identificacaoempresa",
    "fichacompensacao",
    "recibopagador",
    "pagamento",
    "codigobarras",
    "linhadigitavel",
    "url"
})
public class ConsultaBoletoTituloType {

    @XmlElement(name = "NUMERO_DOCUMENTO", required = true)
    protected String numerodocumento;
    @XmlElement(name = "DATA_VENCIMENTO")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datavencimento;
    @XmlElement(name = "VALOR", required = true)
    protected BigDecimal valor;
    @XmlElement(name = "TIPO_ESPECIE")
    protected short tipoespecie;
    @XmlElement(name = "FLAG_ACEITE", required = true)
    protected String flagaceite;
    @XmlElement(name = "DATA_EMISSAO")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataemissao;
    @XmlElement(name = "JUROS_MORA", required = true)
    protected ConsultaBoletoJurosMoraType jurosmora;
    @XmlElement(name = "VALOR_ABATIMENTO", required = true)
    protected BigDecimal valorabatimento;
    @XmlElement(name = "POS_VENCIMENTO", required = true)
    protected ConsultaBoletoPosVencimentoType posvencimento;
    @XmlElement(name = "CODIGO_MOEDA")
    protected short codigomoeda;
    @XmlElement(name = "PAGADOR", required = true)
    protected ConsultaBoletoPagadorType pagador;
    @XmlElement(name = "SACADOR_AVALISTA")
    protected ConsultaBoletoSacadorAvalistaType sacadoravalista;
    @XmlElement(name = "MULTA")
    protected ConsultaBoletoMultaType multa;
    @XmlElement(name = "DESCONTOS")
    protected ConsultaBoletoDescontosType descontos;
    @XmlElement(name = "VALOR_IOF")
    protected BigDecimal valoriof;
    @XmlElement(name = "IDENTIFICACAO_EMPRESA")
    protected String identificacaoempresa;
    @XmlElement(name = "FICHA_COMPENSACAO")
    protected ConsultaBoletoFichaCompensacaoType fichacompensacao;
    @XmlElement(name = "RECIBO_PAGADOR")
    protected ConsultaBoletoReciboPagadorType recibopagador;
    @XmlElement(name = "PAGAMENTO")
    protected ConsultaBoletoPagamentoType pagamento;
    @XmlElement(name = "CODIGO_BARRAS", required = true)
    protected String codigobarras;
    @XmlElement(name = "LINHA_DIGITAVEL", required = true)
    protected String linhadigitavel;
    @XmlElement(name = "URL")
    protected String url;

    /**
     * Obtém o valor da propriedade numerodocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODOCUMENTO() {
        return numerodocumento;
    }

    /**
     * Define o valor da propriedade numerodocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODOCUMENTO(String value) {
        this.numerodocumento = value;
    }

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
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALOR() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALOR(BigDecimal value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade tipoespecie.
     * 
     */
    public short getTIPOESPECIE() {
        return tipoespecie;
    }

    /**
     * Define o valor da propriedade tipoespecie.
     * 
     */
    public void setTIPOESPECIE(short value) {
        this.tipoespecie = value;
    }

    /**
     * Obtém o valor da propriedade flagaceite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGACEITE() {
        return flagaceite;
    }

    /**
     * Define o valor da propriedade flagaceite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGACEITE(String value) {
        this.flagaceite = value;
    }

    /**
     * Obtém o valor da propriedade dataemissao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAEMISSAO() {
        return dataemissao;
    }

    /**
     * Define o valor da propriedade dataemissao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAEMISSAO(XMLGregorianCalendar value) {
        this.dataemissao = value;
    }

    /**
     * Obtém o valor da propriedade jurosmora.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoJurosMoraType }
     *     
     */
    public ConsultaBoletoJurosMoraType getJUROSMORA() {
        return jurosmora;
    }

    /**
     * Define o valor da propriedade jurosmora.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoJurosMoraType }
     *     
     */
    public void setJUROSMORA(ConsultaBoletoJurosMoraType value) {
        this.jurosmora = value;
    }

    /**
     * Obtém o valor da propriedade valorabatimento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALORABATIMENTO() {
        return valorabatimento;
    }

    /**
     * Define o valor da propriedade valorabatimento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALORABATIMENTO(BigDecimal value) {
        this.valorabatimento = value;
    }

    /**
     * Obtém o valor da propriedade posvencimento.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoPosVencimentoType }
     *     
     */
    public ConsultaBoletoPosVencimentoType getPOSVENCIMENTO() {
        return posvencimento;
    }

    /**
     * Define o valor da propriedade posvencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoPosVencimentoType }
     *     
     */
    public void setPOSVENCIMENTO(ConsultaBoletoPosVencimentoType value) {
        this.posvencimento = value;
    }

    /**
     * Obtém o valor da propriedade codigomoeda.
     * 
     */
    public short getCODIGOMOEDA() {
        return codigomoeda;
    }

    /**
     * Define o valor da propriedade codigomoeda.
     * 
     */
    public void setCODIGOMOEDA(short value) {
        this.codigomoeda = value;
    }

    /**
     * Obtém o valor da propriedade pagador.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoPagadorType }
     *     
     */
    public ConsultaBoletoPagadorType getPAGADOR() {
        return pagador;
    }

    /**
     * Define o valor da propriedade pagador.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoPagadorType }
     *     
     */
    public void setPAGADOR(ConsultaBoletoPagadorType value) {
        this.pagador = value;
    }

    /**
     * Obtém o valor da propriedade sacadoravalista.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoSacadorAvalistaType }
     *     
     */
    public ConsultaBoletoSacadorAvalistaType getSACADORAVALISTA() {
        return sacadoravalista;
    }

    /**
     * Define o valor da propriedade sacadoravalista.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoSacadorAvalistaType }
     *     
     */
    public void setSACADORAVALISTA(ConsultaBoletoSacadorAvalistaType value) {
        this.sacadoravalista = value;
    }

    /**
     * Obtém o valor da propriedade multa.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoMultaType }
     *     
     */
    public ConsultaBoletoMultaType getMULTA() {
        return multa;
    }

    /**
     * Define o valor da propriedade multa.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoMultaType }
     *     
     */
    public void setMULTA(ConsultaBoletoMultaType value) {
        this.multa = value;
    }

    /**
     * Obtém o valor da propriedade descontos.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoDescontosType }
     *     
     */
    public ConsultaBoletoDescontosType getDESCONTOS() {
        return descontos;
    }

    /**
     * Define o valor da propriedade descontos.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoDescontosType }
     *     
     */
    public void setDESCONTOS(ConsultaBoletoDescontosType value) {
        this.descontos = value;
    }

    /**
     * Obtém o valor da propriedade valoriof.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALORIOF() {
        return valoriof;
    }

    /**
     * Define o valor da propriedade valoriof.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALORIOF(BigDecimal value) {
        this.valoriof = value;
    }

    /**
     * Obtém o valor da propriedade identificacaoempresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFICACAOEMPRESA() {
        return identificacaoempresa;
    }

    /**
     * Define o valor da propriedade identificacaoempresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFICACAOEMPRESA(String value) {
        this.identificacaoempresa = value;
    }

    /**
     * Obtém o valor da propriedade fichacompensacao.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoFichaCompensacaoType }
     *     
     */
    public ConsultaBoletoFichaCompensacaoType getFICHACOMPENSACAO() {
        return fichacompensacao;
    }

    /**
     * Define o valor da propriedade fichacompensacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoFichaCompensacaoType }
     *     
     */
    public void setFICHACOMPENSACAO(ConsultaBoletoFichaCompensacaoType value) {
        this.fichacompensacao = value;
    }

    /**
     * Obtém o valor da propriedade recibopagador.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoReciboPagadorType }
     *     
     */
    public ConsultaBoletoReciboPagadorType getRECIBOPAGADOR() {
        return recibopagador;
    }

    /**
     * Define o valor da propriedade recibopagador.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoReciboPagadorType }
     *     
     */
    public void setRECIBOPAGADOR(ConsultaBoletoReciboPagadorType value) {
        this.recibopagador = value;
    }

    /**
     * Obtém o valor da propriedade pagamento.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoPagamentoType }
     *     
     */
    public ConsultaBoletoPagamentoType getPAGAMENTO() {
        return pagamento;
    }

    /**
     * Define o valor da propriedade pagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoPagamentoType }
     *     
     */
    public void setPAGAMENTO(ConsultaBoletoPagamentoType value) {
        this.pagamento = value;
    }

    /**
     * Obtém o valor da propriedade codigobarras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOBARRAS() {
        return codigobarras;
    }

    /**
     * Define o valor da propriedade codigobarras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOBARRAS(String value) {
        this.codigobarras = value;
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

    /**
     * Obtém o valor da propriedade url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Define o valor da propriedade url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

}
