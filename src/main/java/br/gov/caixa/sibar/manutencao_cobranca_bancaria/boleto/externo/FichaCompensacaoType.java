
package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ficha_compensacao_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ficha_compensacao_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MENSAGENS" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo}mensagens_ficha_compensacao_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ficha_compensacao_Type", propOrder = {
    "mensagens"
})
public class FichaCompensacaoType {

    @XmlElement(name = "MENSAGENS", required = true)
    protected MensagensFichaCompensacaoType mensagens;

    /**
     * Obtém o valor da propriedade mensagens.
     * 
     * @return
     *     possible object is
     *     {@link MensagensFichaCompensacaoType }
     *     
     */
    public MensagensFichaCompensacaoType getMENSAGENS() {
        return mensagens;
    }

    /**
     * Define o valor da propriedade mensagens.
     * 
     * @param value
     *     allowed object is
     *     {@link MensagensFichaCompensacaoType }
     *     
     */
    public void setMENSAGENS(MensagensFichaCompensacaoType value) {
        this.mensagens = value;
    }

}
