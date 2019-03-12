
package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de COMPLEMENTARES_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="COMPLEMENTARES_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCONTOS" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}DESCONTOS_TYPE" minOccurs="0"/>
 *         &lt;element name="MULTA" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}DESCONTO_MULTA_TYPE" minOccurs="0"/>
 *         &lt;element name="JUROS" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}JUROS_TYPE" minOccurs="0"/>
 *         &lt;element name="IMPOSTOS" type="{http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto}IMPOSTOS_TYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPLEMENTARES_TYPE", propOrder = {
    "descontos",
    "multa",
    "juros",
    "impostos"
})
public class COMPLEMENTARESTYPE {

    @XmlElement(name = "DESCONTOS")
    protected DESCONTOSTYPE descontos;
    @XmlElement(name = "MULTA")
    protected DESCONTOMULTATYPE multa;
    @XmlElement(name = "JUROS")
    protected JUROSTYPE juros;
    @XmlElement(name = "IMPOSTOS")
    protected IMPOSTOSTYPE impostos;

    /**
     * Obtém o valor da propriedade descontos.
     * 
     * @return
     *     possible object is
     *     {@link DESCONTOSTYPE }
     *     
     */
    public DESCONTOSTYPE getDESCONTOS() {
        return descontos;
    }

    /**
     * Define o valor da propriedade descontos.
     * 
     * @param value
     *     allowed object is
     *     {@link DESCONTOSTYPE }
     *     
     */
    public void setDESCONTOS(DESCONTOSTYPE value) {
        this.descontos = value;
    }

    /**
     * Obtém o valor da propriedade multa.
     * 
     * @return
     *     possible object is
     *     {@link DESCONTOMULTATYPE }
     *     
     */
    public DESCONTOMULTATYPE getMULTA() {
        return multa;
    }

    /**
     * Define o valor da propriedade multa.
     * 
     * @param value
     *     allowed object is
     *     {@link DESCONTOMULTATYPE }
     *     
     */
    public void setMULTA(DESCONTOMULTATYPE value) {
        this.multa = value;
    }

    /**
     * Obtém o valor da propriedade juros.
     * 
     * @return
     *     possible object is
     *     {@link JUROSTYPE }
     *     
     */
    public JUROSTYPE getJUROS() {
        return juros;
    }

    /**
     * Define o valor da propriedade juros.
     * 
     * @param value
     *     allowed object is
     *     {@link JUROSTYPE }
     *     
     */
    public void setJUROS(JUROSTYPE value) {
        this.juros = value;
    }

    /**
     * Obtém o valor da propriedade impostos.
     * 
     * @return
     *     possible object is
     *     {@link IMPOSTOSTYPE }
     *     
     */
    public IMPOSTOSTYPE getIMPOSTOS() {
        return impostos;
    }

    /**
     * Define o valor da propriedade impostos.
     * 
     * @param value
     *     allowed object is
     *     {@link IMPOSTOSTYPE }
     *     
     */
    public void setIMPOSTOS(IMPOSTOSTYPE value) {
        this.impostos = value;
    }

}
