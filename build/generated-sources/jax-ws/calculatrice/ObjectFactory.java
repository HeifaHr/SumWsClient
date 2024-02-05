
package calculatrice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the calculatrice package. 
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

    private final static QName _Facto_QNAME = new QName("http://calculatrice/", "Facto");
    private final static QName _FactoResponse_QNAME = new QName("http://calculatrice/", "FactoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: calculatrice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Facto_Type }
     * 
     */
    public Facto_Type createFacto_Type() {
        return new Facto_Type();
    }

    /**
     * Create an instance of {@link FactoResponse }
     * 
     */
    public FactoResponse createFactoResponse() {
        return new FactoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facto_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculatrice/", name = "Facto")
    public JAXBElement<Facto_Type> createFacto(Facto_Type value) {
        return new JAXBElement<Facto_Type>(_Facto_QNAME, Facto_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculatrice/", name = "FactoResponse")
    public JAXBElement<FactoResponse> createFactoResponse(FactoResponse value) {
        return new JAXBElement<FactoResponse>(_FactoResponse_QNAME, FactoResponse.class, null, value);
    }

}
