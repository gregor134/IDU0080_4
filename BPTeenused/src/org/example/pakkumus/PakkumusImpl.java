
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.example.pakkumus;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.xml.namespace.QName;

import logging.ServiceLogger;
import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.CourierService;
import ttu.idu0080.order.server.CourierServiceService;
import ttu.idu0080.order.server.EntAddress;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-05-04T23:13:57.489+03:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "pakkumus",
                      portName = "pakkumusSOAP",
                      targetNamespace = "http://www.example.org/pakkumus/",
                      wsdlLocation = "file:/C:/Projektid/IDU0080_4/BPTeenused/WebContent/pakkumus.wsdl",
                      endpointInterface = "org.example.pakkumus.Pakkumus")
                      
public class PakkumusImpl implements Pakkumus {

    private static final QName COURIER_SERVICE_NAME = new QName("http://server.order.idu0080.ttu/", "CourierServiceService");

    /* (non-Javadoc)
     * @see org.example.pakkumus.Pakkumus#teePakkumus(org.example.pakkumus.PakkumusParing  parameters )*
     */
    public org.example.pakkumus.PakkumusVastus teePakkumus(PakkumusParing parameters) { 
    	ServiceLogger.log("Start teePakkumus");
        try {
        	CourierServiceService courierSs = new CourierServiceService(new URL("http://localhost:8080/BPServer/services/CourierServicePort?wsdl"), 
            		COURIER_SERVICE_NAME);
            CourierService courierPort = courierSs.getCourierServicePort();
            Courier courier = courierPort.getCourierById(parameters.getKullerId());
            String shippingAddressCounty = parameters.getTellimus().getShippingAddress().getCounty();
            ServiceLogger.log("Received:\n"
            		+ "\tCourier: [" + courier.getEnterprise() + "]\n"
    				+ "\tPrice: [" + BigDecimal.valueOf((long) parameters.getTellimus().getPriceTotal()).setScale(2, RoundingMode.HALF_EVEN) + "]\n"
					+ "\tCounty: [" + parameters.getTellimus().getShippingAddress().getCounty() + "]\n"
					+ "\tPercent: [" + courier.getPercentFromOrder() + "]");
              
            boolean shippingAddressDiscount = courier.getAddresses().stream()
                    .map(EntAddress::getCounty)
                    .anyMatch(shippingAddressCounty::equals);

            List<Address> sellerAddresses = parameters.getTellimus().getSeller().getAddresses();
            boolean sellerDiscount = courier.getAddresses().stream()
                    .map(EntAddress::getCounty)
                    .anyMatch(courierCounty ->
                            sellerAddresses.stream()
                                    .map(Address::getCounty)
                                    .anyMatch(courierCounty::equals));
            float discount = 1;
            if (shippingAddressDiscount) {
            	ServiceLogger.log("Kohaletoimetamise maakond langeb kokku kullerfirma maakonnaga.");
                discount -= 0.3;
            }
            if (sellerDiscount) {
            	ServiceLogger.log("Müüja maakond langeb kokku kullerfirma maakonnaga.");
                discount -= 0.3;
            }
            ServiceLogger.log("Discount: [" + (1-discount) * 100 + "%]");

            int days = ThreadLocalRandom.current().nextInt(1, 7 + 1);

            String offerId = "OF"+Integer.toString(ThreadLocalRandom.current().nextInt(10000000, 19999999 + 1));
        	
            PakkumusVastus pakkumusVastus = new PakkumusVastus();
            pakkumusVastus.setHind(parameters.getTellimus().getPriceTotal()*courier.getPercentFromOrder()*discount);
            pakkumusVastus.setPaevadeArv(days);
            pakkumusVastus.setOfferId(offerId);
            
            ServiceLogger.log("Offered:\n"
            		+ "\tOffer: [" + offerId + "]\n"
    				+ "\tPrice: [" + BigDecimal.valueOf(pakkumusVastus.getHind()).setScale(2, RoundingMode.HALF_EVEN) + "]\n"
					+ "\tDays: [" + days + "]\n");
            ServiceLogger.log("End teePakkumus");
            return pakkumusVastus;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}