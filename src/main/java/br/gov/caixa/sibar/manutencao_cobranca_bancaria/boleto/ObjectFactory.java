package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SERVICOENTRADA_QNAME = new QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto", "SERVICO_ENTRADA");
    private final static QName _SERVICOSAIDA_QNAME = new QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto", "SERVICO_SAIDA");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SERVICOENTRADANEGOCIALTYPE }
     *
     */
    public SERVICOENTRADANEGOCIALTYPE createSERVICOENTRADANEGOCIALTYPE() {
        return new SERVICOENTRADANEGOCIALTYPE();
    }

    /**
     * Create an instance of {@link SERVICOSAIDANEGOCIALTYPE }
     *
     */
    public SERVICOSAIDANEGOCIALTYPE createSERVICOSAIDANEGOCIALTYPE() {
        return new SERVICOSAIDANEGOCIALTYPE();
    }

    /**
     * Create an instance of {@link IMPOSTOSTYPE }
     *
     */
    public IMPOSTOSTYPE createIMPOSTOSTYPE() {
        return new IMPOSTOSTYPE();
    }

    /**
     * Create an instance of {@link DADOSENTRADATYPE }
     *
     */
    public DADOSENTRADATYPE createDADOSENTRADATYPE() {
        return new DADOSENTRADATYPE();
    }

    /**
     * Create an instance of {@link INCLUISOLICITACAOPREIMPRESSOTYPE }
     *
     */
    public INCLUISOLICITACAOPREIMPRESSOTYPE createINCLUISOLICITACAOPREIMPRESSOTYPE() {
        return new INCLUISOLICITACAOPREIMPRESSOTYPE();
    }

    /**
     * Create an instance of {@link BAIXABOLETOENTRADATYPE }
     *
     */
    public BAIXABOLETOENTRADATYPE createBAIXABOLETOENTRADATYPE() {
        return new BAIXABOLETOENTRADATYPE();
    }

    /**
     * Create an instance of {@link COMPROVANTETYPE }
     *
     */
    public COMPROVANTETYPE createCOMPROVANTETYPE() {
        return new COMPROVANTETYPE();
    }

    /**
     * Create an instance of {@link DADOSSAIDATYPE }
     *
     */
    public DADOSSAIDATYPE createDADOSSAIDATYPE() {
        return new DADOSSAIDATYPE();
    }

    /**
     * Create an instance of {@link EXCLUISOLICITACAOPREIMPRESSOTYPE }
     *
     */
    public EXCLUISOLICITACAOPREIMPRESSOTYPE createEXCLUISOLICITACAOPREIMPRESSOTYPE() {
        return new EXCLUISOLICITACAOPREIMPRESSOTYPE();
    }

    /**
     * Create an instance of {@link JUROSTYPE }
     *
     */
    public JUROSTYPE createJUROSTYPE() {
        return new JUROSTYPE();
    }

    /**
     * Create an instance of {@link INCLUIBOLETOSAIDATYPE }
     *
     */
    public INCLUIBOLETOSAIDATYPE createINCLUIBOLETOSAIDATYPE() {
        return new INCLUIBOLETOSAIDATYPE();
    }

    /**
     * Create an instance of {@link COMPLEMENTARESTYPE }
     *
     */
    public COMPLEMENTARESTYPE createCOMPLEMENTARESTYPE() {
        return new COMPLEMENTARESTYPE();
    }

    /**
     * Create an instance of {@link DESCONTOMULTATYPE }
     *
     */
    public DESCONTOMULTATYPE createDESCONTOMULTATYPE() {
        return new DESCONTOMULTATYPE();
    }

    /**
     * Create an instance of {@link ALTERABOLETOSAIDATYPE }
     *
     */
    public ALTERABOLETOSAIDATYPE createALTERABOLETOSAIDATYPE() {
        return new ALTERABOLETOSAIDATYPE();
    }

    /**
     * Create an instance of {@link INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE }
     *
     */
    public INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE createINCLUIALTERASOLICITACAOGRUPOPAGADORTYPE() {
        return new INCLUIALTERASOLICITACAOGRUPOPAGADORTYPE();
    }

    /**
     * Create an instance of {@link DESCONTOSTYPE }
     *
     */
    public DESCONTOSTYPE createDESCONTOSTYPE() {
        return new DESCONTOSTYPE();
    }

    /**
     * Create an instance of {@link ALTERASOLICITACAOPREIMPRESSOTYPE }
     *
     */
    public ALTERASOLICITACAOPREIMPRESSOTYPE createALTERASOLICITACAOPREIMPRESSOTYPE() {
        return new ALTERASOLICITACAOPREIMPRESSOTYPE();
    }

    /**
     * Create an instance of {@link INCLUIBOLETOENTRADATYPE }
     *
     */
    public INCLUIBOLETOENTRADATYPE createINCLUIBOLETOENTRADATYPE() {
        return new INCLUIBOLETOENTRADATYPE();
    }

    /**
     * Create an instance of {@link EXCLUISOLICITACAOGRUPOPAGADORTYPE }
     *
     */
    public EXCLUISOLICITACAOGRUPOPAGADORTYPE createEXCLUISOLICITACAOGRUPOPAGADORTYPE() {
        return new EXCLUISOLICITACAOGRUPOPAGADORTYPE();
    }

    /**
     * Create an instance of {@link ALTERABOLETOENTRADATYPE }
     *
     */
    public ALTERABOLETOENTRADATYPE createALTERABOLETOENTRADATYPE() {
        return new ALTERABOLETOENTRADATYPE();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link SERVICOENTRADANEGOCIALTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto", name = "SERVICO_ENTRADA_BAIXAR")
    public JAXBElement<SERVICOENTRADANEGOCIALTYPE> createSERVICOENTRADABAIXAR(SERVICOENTRADANEGOCIALTYPE value) {
        return new JAXBElement<SERVICOENTRADANEGOCIALTYPE>(_SERVICOENTRADA_QNAME, SERVICOENTRADANEGOCIALTYPE.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link SERVICOSAIDANEGOCIALTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto", name = "SERVICO_SAIDA")
    public JAXBElement<SERVICOSAIDANEGOCIALTYPE> createSERVICOSAIDA(SERVICOSAIDANEGOCIALTYPE value) {
        return new JAXBElement<SERVICOSAIDANEGOCIALTYPE>(_SERVICOSAIDA_QNAME, SERVICOSAIDANEGOCIALTYPE.class, null, value);
    }

}
