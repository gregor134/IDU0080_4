
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.order.server;

import java.math.BigDecimal;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-05-05T09:44:33.469+03:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "OrderShipmentServiceService",
                      portName = "OrderShipmentServicePort",
                      targetNamespace = "http://server.order.idu0080.ttu/",
                      wsdlLocation = "http://localhost:8080/BPServer/services/OrderShipmentServicePort?wsdl",
                      endpointInterface = "ttu.idu0080.order.server.OrderShipmentService")
                      
public class OrderShipmentServiceImpl implements OrderShipmentService {

    private static final Logger LOG = Logger.getLogger(OrderShipmentServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderShipmentService#getOrderShipmentsByOrderIdRyhmName(int  orderId ,)java.lang.String  ryhmName )*
     */
    public java.util.List<ttu.idu0080.order.server.OrderShipment> getOrderShipmentsByOrderIdRyhmName(int orderId,java.lang.String ryhmName) { 
        LOG.info("Executing operation getOrderShipmentsByOrderIdRyhmName");
        System.out.println(orderId);
        System.out.println(ryhmName);
        try {
            java.util.List<ttu.idu0080.order.server.OrderShipment> _return = new java.util.ArrayList<ttu.idu0080.order.server.OrderShipment>();
            ttu.idu0080.order.server.OrderShipment _returnVal1 = new ttu.idu0080.order.server.OrderShipment();
            _returnVal1.setApproxDeliveryDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-05-05T09:44:33.479+03:00"));
            _returnVal1.setCourierName("CourierName1169523869");
            _returnVal1.setOrder(-672341260);
            _returnVal1.setOrderShipment(-1173827368);
            _returnVal1.setRyhmName("RyhmName-502379339");
            _returnVal1.setShippingPrice(0.18926387747496032);
            _returnVal1.setTrackingNumber("TrackingNumber1205978776");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderShipmentService#insertOrderShipment(int  orderId ,)java.lang.String  ryhmName ,)java.lang.String  trackingNumber ,)java.lang.String  courierName ,)javax.xml.datatype.XMLGregorianCalendar  approxDeliveryDate ,)BigDecimal  shippingPrice )*
     */
    public int insertOrderShipment(int orderId,java.lang.String ryhmName,java.lang.String trackingNumber,java.lang.String courierName,javax.xml.datatype.XMLGregorianCalendar approxDeliveryDate,BigDecimal shippingPrice) { 
        LOG.info("Executing operation insertOrderShipment");
        System.out.println(orderId);
        System.out.println(ryhmName);
        System.out.println(trackingNumber);
        System.out.println(courierName);
        System.out.println(approxDeliveryDate);
        System.out.println(shippingPrice);
        try {
            int _return = 1003913106;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
