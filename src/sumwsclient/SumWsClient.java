/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumwsclient;

/**
 *
 * @author MSI
 */
public class SumWsClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 3;
        int b = 5;
        int S;
        S = somme(a,b);
        System.out.println("La somme de "+a+" et "+b+" = "+ S);
        int n=5;
        int F= facto(n); 
        System.out.println("Le factoriel de "+n+" est egale à "+ F);
    }

    private static int somme(int a, int b) {
        calculatrice.NewWebService_Service service = new calculatrice.NewWebService_Service();
        calculatrice.NewWebService port = service.getNewWebServicePort();
        return port.somme(a, b);
    }

    private static int facto(int n) {
        calculatrice.Facto_Service service = new calculatrice.Facto_Service();
        calculatrice.Facto port = service.getFactoPort();
        return port.facto(n);
    }
    
}
