package com.wsclientemploye.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2023-04-24T11:46:25.364-05:00
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://client.wsclientemploye.com/", name = "Operaciones")
@XmlSeeAlso({ObjectFactory.class})
public interface Operaciones {

    @WebMethod
    @Action(input = "http://client.wsclientemploye.com/Operaciones/getEmployeIdRequest", output = "http://client.wsclientemploye.com/Operaciones/getEmployeIdResponse")
    @RequestWrapper(localName = "getEmployeId", targetNamespace = "http://client.wsclientemploye.com/", className = "com.wsclientemploye.client.GetEmployeId")
    @ResponseWrapper(localName = "getEmployeIdResponse", targetNamespace = "http://client.wsclientemploye.com/", className = "com.wsclientemploye.client.GetEmployeIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.wsclientemploye.client.Employe getEmployeId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod
    @Action(input = "http://client.wsclientemploye.com/Operaciones/saveRequest", output = "http://client.wsclientemploye.com/Operaciones/saveResponse")
    @RequestWrapper(localName = "save", targetNamespace = "http://client.wsclientemploye.com/", className = "com.wsclientemploye.client.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://client.wsclientemploye.com/", className = "com.wsclientemploye.client.SaveResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.wsclientemploye.client.Response save(
        @WebParam(name = "arg0", targetNamespace = "")
        com.wsclientemploye.client.Employe arg0
    );

    @WebMethod
    @Action(input = "http://client.wsclientemploye.com/Operaciones/getDocumentTypeRequest", output = "http://client.wsclientemploye.com/Operaciones/getDocumentTypeResponse")
    @RequestWrapper(localName = "getDocumentType", targetNamespace = "http://client.wsclientemploye.com/", className = "com.wsclientemploye.client.GetDocumentType")
    @ResponseWrapper(localName = "getDocumentTypeResponse", targetNamespace = "http://client.wsclientemploye.com/", className = "com.wsclientemploye.client.GetDocumentTypeResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.wsclientemploye.client.Response getDocumentType(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
