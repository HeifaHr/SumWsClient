
package calculatrice;

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
@WebServiceClient(name = "facto", targetNamespace = "http://calculatrice/", wsdlLocation = "http://localhost:8080/calculatrice/facto?wsdl")
public class Facto_Service
    extends Service
{

    private final static URL FACTO_WSDL_LOCATION;
    private final static WebServiceException FACTO_EXCEPTION;
    private final static QName FACTO_QNAME = new QName("http://calculatrice/", "facto");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/calculatrice/facto?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FACTO_WSDL_LOCATION = url;
        FACTO_EXCEPTION = e;
    }

    public Facto_Service() {
        super(__getWsdlLocation(), FACTO_QNAME);
    }

    public Facto_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), FACTO_QNAME, features);
    }

    public Facto_Service(URL wsdlLocation) {
        super(wsdlLocation, FACTO_QNAME);
    }

    public Facto_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FACTO_QNAME, features);
    }

    public Facto_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Facto_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Facto
     */
    @WebEndpoint(name = "factoPort")
    public Facto getFactoPort() {
        return super.getPort(new QName("http://calculatrice/", "factoPort"), Facto.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Facto
     */
    @WebEndpoint(name = "factoPort")
    public Facto getFactoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://calculatrice/", "factoPort"), Facto.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FACTO_EXCEPTION!= null) {
            throw FACTO_EXCEPTION;
        }
        return FACTO_WSDL_LOCATION;
    }

}
