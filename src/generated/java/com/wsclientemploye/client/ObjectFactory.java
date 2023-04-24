
package com.wsclientemploye.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wsclientemploye.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDocumentType_QNAME = new QName("http://client.wsclientemploye.com/", "getDocumentType");
    private final static QName _GetDocumentTypeResponse_QNAME = new QName("http://client.wsclientemploye.com/", "getDocumentTypeResponse");
    private final static QName _GetEmployeId_QNAME = new QName("http://client.wsclientemploye.com/", "getEmployeId");
    private final static QName _GetEmployeIdResponse_QNAME = new QName("http://client.wsclientemploye.com/", "getEmployeIdResponse");
    private final static QName _Save_QNAME = new QName("http://client.wsclientemploye.com/", "save");
    private final static QName _SaveResponse_QNAME = new QName("http://client.wsclientemploye.com/", "saveResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wsclientemploye.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDocumentType }
     * 
     */
    public GetDocumentType createGetDocumentType() {
        return new GetDocumentType();
    }

    /**
     * Create an instance of {@link GetDocumentTypeResponse }
     * 
     */
    public GetDocumentTypeResponse createGetDocumentTypeResponse() {
        return new GetDocumentTypeResponse();
    }

    /**
     * Create an instance of {@link GetEmployeId }
     * 
     */
    public GetEmployeId createGetEmployeId() {
        return new GetEmployeId();
    }

    /**
     * Create an instance of {@link GetEmployeIdResponse }
     * 
     */
    public GetEmployeIdResponse createGetEmployeIdResponse() {
        return new GetEmployeIdResponse();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link Employe }
     * 
     */
    public Employe createEmploye() {
        return new Employe();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.wsclientemploye.com/", name = "getDocumentType")
    public JAXBElement<GetDocumentType> createGetDocumentType(GetDocumentType value) {
        return new JAXBElement<GetDocumentType>(_GetDocumentType_QNAME, GetDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.wsclientemploye.com/", name = "getDocumentTypeResponse")
    public JAXBElement<GetDocumentTypeResponse> createGetDocumentTypeResponse(GetDocumentTypeResponse value) {
        return new JAXBElement<GetDocumentTypeResponse>(_GetDocumentTypeResponse_QNAME, GetDocumentTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployeId }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.wsclientemploye.com/", name = "getEmployeId")
    public JAXBElement<GetEmployeId> createGetEmployeId(GetEmployeId value) {
        return new JAXBElement<GetEmployeId>(_GetEmployeId_QNAME, GetEmployeId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployeIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.wsclientemploye.com/", name = "getEmployeIdResponse")
    public JAXBElement<GetEmployeIdResponse> createGetEmployeIdResponse(GetEmployeIdResponse value) {
        return new JAXBElement<GetEmployeIdResponse>(_GetEmployeIdResponse_QNAME, GetEmployeIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.wsclientemploye.com/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.wsclientemploye.com/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

}
