package ttu.idu0080.order.server.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the eshop_order database table.
 * 
 */
@Entity
@Table(name="eshop_order")
@NamedQueries({
	@NamedQuery(name="EshopOrder.findAll", query="SELECT e FROM EshopOrder e"),
	@NamedQuery(name="EshopOrder.findById", query="SELECT e FROM EshopOrder e WHERE e.eshopOrder = :order_id")
	})
public class EshopOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eshop_order")
	private long eshopOrder;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_fk")
    private Customer customer;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="shipping_address_fk")
    private Address shippingAddress;
	
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="seller_fk")
    private Enterprise seller;

	@Column(name="confirmation_date")
	private Timestamp confirmationDate;

	@Column(name="customer_note")
	private String customerNote;

	@Column(name="price_total")
	private BigDecimal priceTotal;

	public EshopOrder() {
	}

	public long getEshopOrder() {
		return this.eshopOrder;
	}

	public void setEshopOrder(long eshopOrder) {
		this.eshopOrder = eshopOrder;
	}

	public Timestamp getConfirmationDate() {
		return this.confirmationDate;
	}

	public void setConfirmationDate(Timestamp confirmationDate) {
		this.confirmationDate = confirmationDate;
	}

	public Customer getCustomerFk() {
		return this.customer;
	}

	public void setCustomerFk(Customer customerFk) {
		this.customer = customer;
	}

	public String getCustomerNote() {
		return this.customerNote;
	}

	public void setCustomerNote(String customerNote) {
		this.customerNote = customerNote;
	}

	public BigDecimal getPriceTotal() {
		return this.priceTotal;
	}

	public void setPriceTotal(BigDecimal priceTotal) {
		this.priceTotal = priceTotal;
	}

	public Enterprise getSeller() {
		return this.seller;
	}

	public void setSellerFk(Enterprise seller) {
		this.seller = seller;
	}

	public Address getShippingAddressFk() {
		return this.shippingAddress;
	}

	public void setShippingAddressFk(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}