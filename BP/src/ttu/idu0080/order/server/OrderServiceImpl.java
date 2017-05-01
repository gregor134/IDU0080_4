
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.order.server;

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
 * 2017-04-23T21:40:43.858+03:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "OrderServiceService",
                      portName = "OrderServicePort",
                      targetNamespace = "http://server.order.idu0080.ttu/",
                      wsdlLocation = "http://localhost:8080/BPServer/services/OrderServicePort?wsdl",
                      endpointInterface = "ttu.idu0080.order.server.OrderService")
                      
public class OrderServiceImpl implements OrderService {

    private static final Logger LOG = Logger.getLogger(OrderServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderService#getOrdersByOrderId(int  orderId )*
     */
    public ttu.idu0080.order.server.Order getOrdersByOrderId(int orderId) { 
        LOG.info("Executing operation getOrdersByOrderId");
        System.out.println(orderId);
        try {
            ttu.idu0080.order.server.Order _return = new ttu.idu0080.order.server.Order();
            ttu.idu0080.order.server.Customer _returnCustomer = new ttu.idu0080.order.server.Customer();
            java.util.List<ttu.idu0080.order.server.Address> _returnCustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.Address>();
            ttu.idu0080.order.server.Address _returnCustomerAddressesVal1 = new ttu.idu0080.order.server.Address();
            _returnCustomerAddressesVal1.setAddress(1488632670);
            _returnCustomerAddressesVal1.setCountry("Country-1843340040");
            _returnCustomerAddressesVal1.setCounty("County2143983407");
            _returnCustomerAddressesVal1.setStreetAddress("StreetAddress-1271611747");
            _returnCustomerAddressesVal1.setTownVillage("TownVillage-523307441");
            _returnCustomerAddressesVal1.setZipcode("Zipcode866728985");
            _returnCustomerAddresses.add(_returnCustomerAddressesVal1);
            _returnCustomer.getAddresses().addAll(_returnCustomerAddresses);
            _returnCustomer.setCustomer(-16741411);
            _returnCustomer.setFirstName("FirstName1299176107");
            _returnCustomer.setLastName("LastName424178822");
            _return.setCustomer(_returnCustomer);
            _return.setOrderId(-584816473);
            java.util.List<ttu.idu0080.order.server.OrderProduct> _returnOrderProducts = new java.util.ArrayList<ttu.idu0080.order.server.OrderProduct>();
            ttu.idu0080.order.server.OrderProduct _returnOrderProductsVal1 = new ttu.idu0080.order.server.OrderProduct();
            _returnOrderProductsVal1.setOrderProduct(-1361564959);
            _returnOrderProductsVal1.setPrice(0.31867903f);
            _returnOrderProductsVal1.setPriceTotal(0.16998732f);
            _returnOrderProductsVal1.setProductCount(921776075);
            _returnOrderProductsVal1.setProductName("ProductName427617559");
            _returnOrderProducts.add(_returnOrderProductsVal1);
            _return.getOrderProducts().addAll(_returnOrderProducts);
            _return.setPriceTotal(0.6559033f);
            ttu.idu0080.order.server.Seller _returnSeller = new ttu.idu0080.order.server.Seller();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnSellerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            ttu.idu0080.order.server.EntAddress _returnSellerAddressesVal1 = new ttu.idu0080.order.server.EntAddress();
            _returnSellerAddressesVal1.setAddress(-1078390406);
            _returnSellerAddressesVal1.setCountry("Country1997391847");
            _returnSellerAddressesVal1.setCounty("County885688375");
            _returnSellerAddressesVal1.setStreetAddress("StreetAddress1051228744");
            _returnSellerAddressesVal1.setTownVillage("TownVillage215948046");
            _returnSellerAddressesVal1.setZipcode("Zipcode-709778710");
            _returnSellerAddresses.add(_returnSellerAddressesVal1);
            _returnSeller.getAddresses().addAll(_returnSellerAddresses);
            _returnSeller.setEnterprise(-130878302);
            _returnSeller.setName("Name-808247522");
            _return.setSeller(_returnSeller);
            ttu.idu0080.order.server.Address _returnShippingAddress = new ttu.idu0080.order.server.Address();
            _returnShippingAddress.setAddress(1237482011);
            _returnShippingAddress.setCountry("Country-1828613659");
            _returnShippingAddress.setCounty("County-958887073");
            _returnShippingAddress.setStreetAddress("StreetAddress-1460331502");
            _returnShippingAddress.setTownVillage("TownVillage1214609579");
            _returnShippingAddress.setZipcode("Zipcode447352286");
            _return.setShippingAddress(_returnShippingAddress);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderService#getOrdersByCustomerId(int  customerId )*
     */
    public java.util.List<ttu.idu0080.order.server.Order> getOrdersByCustomerId(int customerId) { 
        LOG.info("Executing operation getOrdersByCustomerId");
        System.out.println(customerId);
        try {
            java.util.List<ttu.idu0080.order.server.Order> _return = new java.util.ArrayList<ttu.idu0080.order.server.Order>();
            ttu.idu0080.order.server.Order _returnVal1 = new ttu.idu0080.order.server.Order();
            ttu.idu0080.order.server.Customer _returnVal1Customer = new ttu.idu0080.order.server.Customer();
            java.util.List<ttu.idu0080.order.server.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.Address>();
            _returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
            _returnVal1Customer.setCustomer(824016991);
            _returnVal1Customer.setFirstName("FirstName-1413099824");
            _returnVal1Customer.setLastName("LastName505439788");
            _returnVal1.setCustomer(_returnVal1Customer);
            _returnVal1.setOrderId(-1298875932);
            java.util.List<ttu.idu0080.order.server.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.order.server.OrderProduct>();
            ttu.idu0080.order.server.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.order.server.OrderProduct();
            _returnVal1OrderProductsVal1.setOrderProduct(-1388692216);
            _returnVal1OrderProductsVal1.setPrice(0.8952512f);
            _returnVal1OrderProductsVal1.setPriceTotal(0.4778728f);
            _returnVal1OrderProductsVal1.setProductCount(397111907);
            _returnVal1OrderProductsVal1.setProductName("ProductName-1887412496");
            _returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
            _returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
            _returnVal1.setPriceTotal(0.27893645f);
            ttu.idu0080.order.server.Seller _returnVal1Seller = new ttu.idu0080.order.server.Seller();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            _returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
            _returnVal1Seller.setEnterprise(1902179798);
            _returnVal1Seller.setName("Name-135496263");
            _returnVal1.setSeller(_returnVal1Seller);
            ttu.idu0080.order.server.Address _returnVal1ShippingAddress = new ttu.idu0080.order.server.Address();
            _returnVal1ShippingAddress.setAddress(1225285353);
            _returnVal1ShippingAddress.setCountry("Country-844928798");
            _returnVal1ShippingAddress.setCounty("County1809110623");
            _returnVal1ShippingAddress.setStreetAddress("StreetAddress-1321684471");
            _returnVal1ShippingAddress.setTownVillage("TownVillage-1830542275");
            _returnVal1ShippingAddress.setZipcode("Zipcode194311855");
            _returnVal1.setShippingAddress(_returnVal1ShippingAddress);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderService#getAllOrders(*
     */
    public java.util.List<ttu.idu0080.order.server.Order> getAllOrders() { 
        LOG.info("Executing operation getAllOrders");
        try {
            java.util.List<ttu.idu0080.order.server.Order> _return = new java.util.ArrayList<ttu.idu0080.order.server.Order>();
            ttu.idu0080.order.server.Order _returnVal1 = new ttu.idu0080.order.server.Order();
            ttu.idu0080.order.server.Customer _returnVal1Customer = new ttu.idu0080.order.server.Customer();
            java.util.List<ttu.idu0080.order.server.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.Address>();
            _returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
            _returnVal1Customer.setCustomer(-511976923);
            _returnVal1Customer.setFirstName("FirstName-1988254642");
            _returnVal1Customer.setLastName("LastName-53409734");
            _returnVal1.setCustomer(_returnVal1Customer);
            _returnVal1.setOrderId(-1810333989);
            java.util.List<ttu.idu0080.order.server.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.order.server.OrderProduct>();
            ttu.idu0080.order.server.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.order.server.OrderProduct();
            _returnVal1OrderProductsVal1.setOrderProduct(-167895377);
            _returnVal1OrderProductsVal1.setPrice(0.4547608f);
            _returnVal1OrderProductsVal1.setPriceTotal(0.4259041f);
            _returnVal1OrderProductsVal1.setProductCount(-677245024);
            _returnVal1OrderProductsVal1.setProductName("ProductName-1057616504");
            _returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
            _returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
            _returnVal1.setPriceTotal(0.7422645f);
            ttu.idu0080.order.server.Seller _returnVal1Seller = new ttu.idu0080.order.server.Seller();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            _returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
            _returnVal1Seller.setEnterprise(-1821158856);
            _returnVal1Seller.setName("Name-263021825");
            _returnVal1.setSeller(_returnVal1Seller);
            ttu.idu0080.order.server.Address _returnVal1ShippingAddress = new ttu.idu0080.order.server.Address();
            _returnVal1ShippingAddress.setAddress(1991996890);
            _returnVal1ShippingAddress.setCountry("Country-1118445802");
            _returnVal1ShippingAddress.setCounty("County-2122582023");
            _returnVal1ShippingAddress.setStreetAddress("StreetAddress228239277");
            _returnVal1ShippingAddress.setTownVillage("TownVillage546577493");
            _returnVal1ShippingAddress.setZipcode("Zipcode1083410880");
            _returnVal1.setShippingAddress(_returnVal1ShippingAddress);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderService#getOrdersByShippingAddress(java.lang.String  country ,)java.lang.String  county )*
     */
    public java.util.List<ttu.idu0080.order.server.Order> getOrdersByShippingAddress(java.lang.String country,java.lang.String county) { 
        LOG.info("Executing operation getOrdersByShippingAddress");
        System.out.println(country);
        System.out.println(county);
        try {
            java.util.List<ttu.idu0080.order.server.Order> _return = new java.util.ArrayList<ttu.idu0080.order.server.Order>();
            ttu.idu0080.order.server.Order _returnVal1 = new ttu.idu0080.order.server.Order();
            ttu.idu0080.order.server.Customer _returnVal1Customer = new ttu.idu0080.order.server.Customer();
            java.util.List<ttu.idu0080.order.server.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.Address>();
            _returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
            _returnVal1Customer.setCustomer(1628705958);
            _returnVal1Customer.setFirstName("FirstName-811426484");
            _returnVal1Customer.setLastName("LastName-1803360940");
            _returnVal1.setCustomer(_returnVal1Customer);
            _returnVal1.setOrderId(1096833346);
            java.util.List<ttu.idu0080.order.server.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.order.server.OrderProduct>();
            ttu.idu0080.order.server.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.order.server.OrderProduct();
            _returnVal1OrderProductsVal1.setOrderProduct(1305764106);
            _returnVal1OrderProductsVal1.setPrice(0.32200807f);
            _returnVal1OrderProductsVal1.setPriceTotal(0.768997f);
            _returnVal1OrderProductsVal1.setProductCount(-1111026091);
            _returnVal1OrderProductsVal1.setProductName("ProductName1111339591");
            _returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
            _returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
            _returnVal1.setPriceTotal(0.05144012f);
            ttu.idu0080.order.server.Seller _returnVal1Seller = new ttu.idu0080.order.server.Seller();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            _returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
            _returnVal1Seller.setEnterprise(-799104198);
            _returnVal1Seller.setName("Name1179952404");
            _returnVal1.setSeller(_returnVal1Seller);
            ttu.idu0080.order.server.Address _returnVal1ShippingAddress = new ttu.idu0080.order.server.Address();
            _returnVal1ShippingAddress.setAddress(-844464357);
            _returnVal1ShippingAddress.setCountry("Country443087136");
            _returnVal1ShippingAddress.setCounty("County-621839891");
            _returnVal1ShippingAddress.setStreetAddress("StreetAddress-192197096");
            _returnVal1ShippingAddress.setTownVillage("TownVillage1300034917");
            _returnVal1ShippingAddress.setZipcode("Zipcode1170580041");
            _returnVal1.setShippingAddress(_returnVal1ShippingAddress);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderService#getOrdersByCustomerLastName(java.lang.String  lastName )*
     */
    public java.util.List<ttu.idu0080.order.server.Order> getOrdersByCustomerLastName(java.lang.String lastName) { 
        LOG.info("Executing operation getOrdersByCustomerLastName");
        System.out.println(lastName);
        try {
            java.util.List<ttu.idu0080.order.server.Order> _return = new java.util.ArrayList<ttu.idu0080.order.server.Order>();
            ttu.idu0080.order.server.Order _returnVal1 = new ttu.idu0080.order.server.Order();
            ttu.idu0080.order.server.Customer _returnVal1Customer = new ttu.idu0080.order.server.Customer();
            java.util.List<ttu.idu0080.order.server.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.Address>();
            _returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
            _returnVal1Customer.setCustomer(803242696);
            _returnVal1Customer.setFirstName("FirstName1813578945");
            _returnVal1Customer.setLastName("LastName-505781273");
            _returnVal1.setCustomer(_returnVal1Customer);
            _returnVal1.setOrderId(426467052);
            java.util.List<ttu.idu0080.order.server.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.order.server.OrderProduct>();
            ttu.idu0080.order.server.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.order.server.OrderProduct();
            _returnVal1OrderProductsVal1.setOrderProduct(1852581718);
            _returnVal1OrderProductsVal1.setPrice(0.2108649f);
            _returnVal1OrderProductsVal1.setPriceTotal(0.5158231f);
            _returnVal1OrderProductsVal1.setProductCount(-1917801869);
            _returnVal1OrderProductsVal1.setProductName("ProductName451081442");
            _returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
            _returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
            _returnVal1.setPriceTotal(0.9543486f);
            ttu.idu0080.order.server.Seller _returnVal1Seller = new ttu.idu0080.order.server.Seller();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            _returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
            _returnVal1Seller.setEnterprise(-21941906);
            _returnVal1Seller.setName("Name1439334813");
            _returnVal1.setSeller(_returnVal1Seller);
            ttu.idu0080.order.server.Address _returnVal1ShippingAddress = new ttu.idu0080.order.server.Address();
            _returnVal1ShippingAddress.setAddress(1484123744);
            _returnVal1ShippingAddress.setCountry("Country2034140786");
            _returnVal1ShippingAddress.setCounty("County241448401");
            _returnVal1ShippingAddress.setStreetAddress("StreetAddress-1452091210");
            _returnVal1ShippingAddress.setTownVillage("TownVillage1664718988");
            _returnVal1ShippingAddress.setZipcode("Zipcode-530980579");
            _returnVal1.setShippingAddress(_returnVal1ShippingAddress);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
