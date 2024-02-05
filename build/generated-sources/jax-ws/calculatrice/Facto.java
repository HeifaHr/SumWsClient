
package calculatrice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "facto", targetNamespace = "http://calculatrice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Facto {


    /**
     * 
     * @param n
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Facto")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Facto", targetNamespace = "http://calculatrice/", className = "calculatrice.Facto_Type")
    @ResponseWrapper(localName = "FactoResponse", targetNamespace = "http://calculatrice/", className = "calculatrice.FactoResponse")
    @Action(input = "http://calculatrice/facto/FactoRequest", output = "http://calculatrice/facto/FactoResponse")
    public int facto(
        @WebParam(name = "n", targetNamespace = "")
        int n);

}