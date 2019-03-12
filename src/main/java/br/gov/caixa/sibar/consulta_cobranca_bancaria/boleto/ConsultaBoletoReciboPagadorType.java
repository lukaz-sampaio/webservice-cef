
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consulta_boleto_recibo_pagador_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consulta_boleto_recibo_pagador_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MENSAGENS" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}consulta_boleto_mensagens_recibo_pagador_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consulta_boleto_recibo_pagador_Type", propOrder = {
    "mensagens"
})
public class ConsultaBoletoReciboPagadorType {

    @XmlElement(name = "MENSAGENS", required = true)
    protected ConsultaBoletoMensagensReciboPagadorType mensagens;

    /**
     * Obtém o valor da propriedade mensagens.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBoletoMensagensReciboPagadorType }
     *     
     */
    public ConsultaBoletoMensagensReciboPagadorType getMENSAGENS() {
        return mensagens;
    }

    /**
     * Define o valor da propriedade mensagens.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBoletoMensagensReciboPagadorType }
     *     
     */
    public void setMENSAGENS(ConsultaBoletoMensagensReciboPagadorType value) {
        this.mensagens = value;
    }

}
