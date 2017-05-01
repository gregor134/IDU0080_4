package ttu.idu0080.order.server.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the order_product database table.
 * 
 */
@Entity
@Table(name="order_product")
@NamedQueries({
	@NamedQuery(name="OrderProduct.findAll", query="SELECT o FROM OrderProduct o"),
	@NamedQuery(name="OrderProduct.findByEshopOrder", query="SELECT o FROM OrderProduct o WHERE o.eshopOrder = :eshopOrder")
})
public class OrderProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_product")
	private long orderProduct;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_fk")
    private Product product;
	
	@Column(name = "eshop_order_fk")
	private BigDecimal eshopOrder;
	
	private Timestamp created;

	@Column(name="created_by")
	private BigDecimal createdBy;

	private BigDecimal price;

	@Column(name="price_total")
	private BigDecimal priceTotal;

	@Column(name="product_count")
	private Integer productCount;

	@Column(name="product_name")
	private String productName;

	public OrderProduct() {
	}

	public long getOrderProduct() {
		return this.orderProduct;
	}

	public void setOrderProduct(long orderProduct) {
		this.orderProduct = orderProduct;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public BigDecimal getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public BigDecimal getEshopOrder() {
		return this.eshopOrder;
	}

	public void setEshopOrder(BigDecimal eshopOrder) {
		this.eshopOrder = eshopOrder;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPriceTotal() {
		return this.priceTotal;
	}

	public void setPriceTotal(BigDecimal priceTotal) {
		this.priceTotal = priceTotal;
	}

	public Integer getProductCount() {
		return this.productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}