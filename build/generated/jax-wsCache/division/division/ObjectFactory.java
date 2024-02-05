
package division;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the division package. 
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

    private final static QName _Divsion_QNAME = new QName("http://division/", "divsion");
    private final static QName _HelloResponse_QNAME = new QName("http://division/", "helloResponse");
    private final static QName _DivsionResponse_QNAME = new QName("http://division/", "divsionResponse");
    private final static QName _Hello_QNAME = new QName("http://division/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: division
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Divsion }
     * 
     */
    public Divsion createDivsion() {
        return new Divsion();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link DivsionResponse }
     * 
     */
    public DivsionResponse createDivsionResponse() {
        return new DivsionResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divsion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://division/", name = "divsion")
    public JAXBElement<Divsion> createDivsion(Divsion value) {
        return new JAXBElement<Divsion>(_Divsion_QNAME, Divsion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://division/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivsionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://division/", name = "divsionResponse")
    public JAXBElement<DivsionResponse> createDivsionResponse(DivsionResponse value) {
        return new JAXBElement<DivsionResponse>(_DivsionResponse_QNAME, DivsionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://division/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
