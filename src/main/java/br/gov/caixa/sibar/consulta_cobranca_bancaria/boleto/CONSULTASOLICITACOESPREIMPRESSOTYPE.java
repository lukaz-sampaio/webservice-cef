
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QUANTIDADE_PAGINAS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOLICITACOES" type="{http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto}SOLICITACOES_PRE_IMPRESSO_TYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE", propOrder = {
    "quantidadepaginas",
    "solicitacoes"
})
public class CONSULTASOLICITACOESPREIMPRESSOTYPE {

    @XmlElement(name = "QUANTIDADE_PAGINAS")
    protected int quantidadepaginas;
    @XmlElement(name = "SOLICITACOES")
    protected SOLICITACOESPREIMPRESSOTYPE solicitacoes;

    /**
     * Obtém o valor da propriedade quantidadepaginas.
     * 
     */
    public int getQUANTIDADEPAGINAS() {
        return quantidadepaginas;
    }

    /**
     * Define o valor da propriedade quantidadepaginas.
     * 
     */
    public void setQUANTIDADEPAGINAS(int value) {
        this.quantidadepaginas = value;
    }

    /**
     * Obtém o valor da propriedade solicitacoes.
     * 
     * @return
     *     possible object is
     *     {@link SOLICITACOESPREIMPRESSOTYPE }
     *     
     */
    public SOLICITACOESPREIMPRESSOTYPE getSOLICITACOES() {
        return solicitacoes;
    }

    /**
     * Define o valor da propriedade solicitacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link SOLICITACOESPREIMPRESSOTYPE }
     *     
     */
    public void setSOLICITACOES(SOLICITACOESPREIMPRESSOTYPE value) {
        this.solicitacoes = value;
    }

}
