package com.wsclienteemploye.servicio.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import com.wsclientemploye.client.Operaciones;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2023-04-24T12:57:59.888-05:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "EmployeServiceImplService",
                  wsdlLocation = "file:/D:/Proyectos/mvnparameter/src/main/resources/Employe.wsdl",
                  targetNamespace = "http://Impl.servicio.wsclienteemploye.com/")
public class EmployeServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Impl.servicio.wsclienteemploye.com/", "EmployeServiceImplService");
    public final static QName EmployeServiceImplPort = new QName("http://Impl.servicio.wsclienteemploye.com/", "EmployeServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/Proyectos/mvnparameter/src/main/resources/Employe.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EmployeServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/Proyectos/mvnparameter/src/main/resources/Employe.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EmployeServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EmployeServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public EmployeServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EmployeServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EmployeServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Operaciones
     */
    @WebEndpoint(name = "EmployeServiceImplPort")
    public Operaciones getEmployeServiceImplPort() {
        return super.getPort(EmployeServiceImplPort, Operaciones.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Operaciones
     */
    @WebEndpoint(name = "EmployeServiceImplPort")
    public Operaciones getEmployeServiceImplPort(WebServiceFeature... features) {
        return super.getPort(EmployeServiceImplPort, Operaciones.class, features);
    }

}
