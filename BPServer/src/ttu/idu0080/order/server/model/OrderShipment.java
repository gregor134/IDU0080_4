package ttu.idu0080.order.server.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the order_shipment database table.
 * 
 */
@Entity
@Table(name="order_shipment")
@NamedQueries({
	@NamedQuery(name="OrderShipment.findAll", query="SELECT o FROM OrderShipment o"),
	@NamedQuery(name="OrderShipment.findByIdAndRyhmName", query="SELECT o FROM OrderShipment o WHERE o.orderShipment = :shipment_id AND o.ryhmName LIKE :shipment_ryhmName")
	})
public class OrderShipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_shipment")
	private long orderShipment;

	@Temporal(TemporalType.DATE)
	@Column(name="approx_delivery_date")
	private Date approxDeliveryDate;

	@Column(name="courier_name")
	private String courierName;

	private Timestamp created;

	@Column(name="order_fk")
	private BigDecimal orderFk;

	@Column(name="ryhm_name")
	private String ryhmName;

	@Column(name="shipping_price")
	private BigDecimal shippingPrice;

	@Column(name="tracking_number")
	private String trackingNumber;

	public OrderShipment() {
	}

	public long getOrderShipment() {
		return this.orderShipment;
	}

	public void setOrderShipment(long orderShipment) {
		this.orderShipment = orderShipment;
	}

	public Date getApproxDeliveryDate() {
		return this.approxDeliveryDate;
	}

	public void setApproxDeliveryDate(Date approxDeliveryDate) {
		this.approxDeliveryDate = approxDeliveryDate;
	}

	public String getCourierName() {
		return this.courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public BigDecimal getOrderFk() {
		return this.orderFk;
	}

	public void setOrderFk(BigDecimal orderFk) {
		this.orderFk = orderFk;
	}

	public String getRyhmName() {
		return this.ryhmName;
	}

	public void setRyhmName(String ryhmName) {
		this.ryhmName = ryhmName;
	}

	public BigDecimal getShippingPrice() {
		return this.shippingPrice;
	}

	public void setShippingPrice(BigDecimal shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

}