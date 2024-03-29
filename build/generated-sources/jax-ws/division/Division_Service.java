
package division;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "division", targetNamespace = "http://division/", wsdlLocation = "http://localhost:8080/calculatrice/division?wsdl")
public class Division_Service
    extends Service
{

    private final static URL DIVISION_WSDL_LOCATION;
    private final static WebServiceException DIVISION_EXCEPTION;
    private final static QName DIVISION_QNAME = new QName("http://division/", "division");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/calculatrice/division?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DIVISION_WSDL_LOCATION = url;
        DIVISION_EXCEPTION = e;
    }

    public Division_Service() {
        super(__getWsdlLocation(), DIVISION_QNAME);
    }

    public Division_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DIVISION_QNAME, features);
    }

    public Division_Service(URL wsdlLocation) {
        super(wsdlLocation, DIVISION_QNAME);
    }

    public Division_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DIVISION_QNAME, features);
    }

    public Division_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Division_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Division
     */
    @WebEndpoint(name = "divisionPort")
    public Division getDivisionPort() {
        return super.getPort(new QName("http://division/", "divisionPort"), Division.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Division
     */
    @WebEndpoint(name = "divisionPort")
    public Division getDivisionPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://division/", "divisionPort"), Division.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DIVISION_EXCEPTION!= null) {
            throw DIVISION_EXCEPTION;
        }
        return DIVISION_WSDL_LOCATION;
    }

}
