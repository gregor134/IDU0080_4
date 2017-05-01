package ttu.idu0080.order.server.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long product;

	private Timestamp created;

	@Column(name="created_by")
	private BigDecimal createdBy;

	private String description;

	@Column(name="eshop_price")
	private BigDecimal eshopPrice;

	@Column(name="max_customer_discount")
	private BigDecimal maxCustomerDiscount;

	private String name;

	@Column(name="product_catalog_fk")
	private BigDecimal productCatalogFk;

	@Column(name="product_code")
	private String productCode;

	private Timestamp updated;

	@Column(name="updated_by")
	private BigDecimal updatedBy;

	public Product() {
	}

	public long getProduct() {
		return this.product;
	}

	public void setProduct(long product) {
		this.product = product;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getEshopPrice() {
		return this.eshopPrice;
	}

	public void setEshopPrice(BigDecimal eshopPrice) {
		this.eshopPrice = eshopPrice;
	}

	public BigDecimal getMaxCustomerDiscount() {
		return this.maxCustomerDiscount;
	}

	public void setMaxCustomerDiscount(BigDecimal maxCustomerDiscount) {
		this.maxCustomerDiscount = maxCustomerDiscount;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getProductCatalogFk() {
		return this.productCatalogFk;
	}

	public void setProductCatalogFk(BigDecimal productCatalogFk) {
		this.productCatalogFk = productCatalogFk;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public BigDecimal getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

}