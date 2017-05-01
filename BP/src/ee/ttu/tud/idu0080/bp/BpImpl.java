
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ee.ttu.tud.idu0080.bp;

import java.net.URL;
import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.namespace.QName;

//import ee.ttu.tud.idu0080.kuller.Kuller;
//import ee.ttu.tud.idu0080.kuller.Kuller_Service;
import ttu.idu0080.order.server.OrderService;
import ttu.idu0080.order.server.OrderServiceService;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-04-21T14:29:08.439+03:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "bp",
                      portName = "bpSOAP",
                      targetNamespace = "http://idu0080.tud.ttu.ee/bp/",
                      wsdlLocation = "file:/C:/Projektid/IDU0080_4/BP/WebContent/bp.wsdl",
                      endpointInterface = "ee.ttu.tud.idu0080.bp.Bp")
                      
public class BpImpl implements Bp {

    private static final Logger LOG = Logger.getLogger(BpImpl.class.getName());
    
    private static final QName SERVICE_NAME = new QName("http://server.order.idu0080.ttu/", "OrderServiceService");

    /* (non-Javadoc)
     * @see ee.ttu.tud.idu0080.bp.Bp#tellimuseEsitamine(ee.ttu.tud.idu0080.bp.MinuTellimus  parameters )*
     */
    public MinuTellimuseVastus tellimuseEsitamine(MinuTellimus parameters) { 
        LOG.info("Executing operation tellimuseEsitamine");
        System.out.println(parameters);
        try { 
            MinuTellimuseVastus _return = new MinuTellimuseVastus();
            
            //Seda faili muudetakse kohe väga palju
            
            //Samm 1, tellimuse andmete küsimine tund.ttu.ee lehelt
            OrderServiceService ss = new OrderServiceService(new URL("http://localhost:8080/BPServer/services/OrderServicePort?wsdl"), 
            		SERVICE_NAME);
            OrderService port = ss.getOrderServicePort();  
            
            
            System.out.println("Invoking getOrdersByOrderId...");
            
            int tellimusId = parameters.getId().intValue();
            ttu.idu0080.order.server.Order tellimusVastus = port.getOrdersByOrderId(tellimusId);
            System.out.println("getOrdersByOrderId.result=" + tellimusVastus.getOrderId()+" "+tellimusVastus.getPriceTotal());

            //2. samm, enda kirjutatud veebiteenuselt kullerite andmete küsimine
            /*Kuller_Service kullerss = new Kuller_Service(
            		new URL("http://localhost:8083/BP4/services/kullerSOAP?wsdl"), 
            		new QName("http://idu0080.tud.ttu.ee/kuller/", "kuller"));
            Kuller kullerport = kullerss.getKullerSOAP();  */
            
            /*System.out.println("Invoking getKullerid...");
            ee.ttu.tud.idu0080.kuller.KulleridVastus kullerid = kullerport.getKullerid();
            System.out.println("getKullerid.result=" + kullerid.getKuller().size());*/
      
            
            MinuTellimuseVastus response = new MinuTellimuseVastus();
            response.setTeade("Woopdedoo");
            return response;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
