
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

    private final static QName _SommeResponse_QNAME = new QName("http://calculatrice/", "SommeResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://calculatrice/", "helloResponse");
    private final static QName _Hello_QNAME = new QName("http://calculatrice/", "hello");
    private final static QName _Somme_QNAME = new QName("http://calculatrice/", "Somme");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: calculatrice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SommeResponse }
     * 
     */
    public SommeResponse createSommeResponse() {
        return new SommeResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Somme }
     * 
     */
    public Somme createSomme() {
        return new Somme();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SommeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculatrice/", name = "SommeResponse")
    public JAXBElement<SommeResponse> createSommeResponse(SommeResponse value) {
        return new JAXBElement<SommeResponse>(_SommeResponse_QNAME, SommeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculatrice/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculatrice/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculatrice/", name = "Somme")
    public JAXBElement<Somme> createSomme(Somme value) {
        return new JAXBElement<Somme>(_Somme_QNAME, Somme.class, null, value);
    }

}
