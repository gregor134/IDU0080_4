package ttu.idu0080.order.server.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the enterprise database table.
 * 
 */
@Entity
@NamedQuery(name="Enterprise.findAll", query="SELECT e FROM Enterprise e")
public class Enterprise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long enterprise;

	private Timestamp created;

	@Column(name="created_by")
	private BigDecimal createdBy;

	@Column(name="full_name")
	private String fullName;

	@Column(name="is_courier")
	private String isCourier;

	@Column(name="is_seller")
	private String isSeller;

	private String name;

	@Column(name="percent_from_order")
	private BigDecimal percentFromOrder;

	private Timestamp updated;

	@Column(name="updated_by")
	private BigDecimal updatedBy;

	public Enterprise() {
	}

	public long getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(long enterprise) {
		this.enterprise = enterprise;
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

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIsCourier() {
		return this.isCourier;
	}

	public void setIsCourier(String isCourier) {
		this.isCourier = isCourier;
	}

	public String getIsSeller() {
		return this.isSeller;
	}

	public void setIsSeller(String isSeller) {
		this.isSeller = isSeller;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPercentFromOrder() {
		return this.percentFromOrder;
	}

	public void setPercentFromOrder(BigDecimal percentFromOrder) {
		this.percentFromOrder = percentFromOrder;
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