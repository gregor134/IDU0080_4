package ttu.idu0080.order.server.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ent_address database table.
 * 
 */
@Entity
@Table(name="ent_address")
@NamedQueries({
	@NamedQuery(name="EntAddress.findAll", query="SELECT e FROM EntAddress e"),
	@NamedQuery(name="EntAddress.findByEnterprise", query="SELECT e FROM EntAddress e WHERE e.subjectFk = :enterprise")
})
public class EntAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ent_address")
	private long entAddress;

	@Column(name="address_type_fk")
	private BigDecimal addressTypeFk;

	private String country;

	private String county;

	@Column(name="street_address")
	private String streetAddress;

	@Column(name="subject_fk")
	private BigDecimal subjectFk;

	@Column(name="subject_type_fk")
	private BigDecimal subjectTypeFk;

	@Column(name="town_village")
	private String townVillage;

	private String zipcode;

	public EntAddress() {
	}

	public long getEntAddress() {
		return this.entAddress;
	}

	public void setEntAddress(long entAddress) {
		this.entAddress = entAddress;
	}

	public BigDecimal getAddressTypeFk() {
		return this.addressTypeFk;
	}

	public void setAddressTypeFk(BigDecimal addressTypeFk) {
		this.addressTypeFk = addressTypeFk;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getStreetAddress() {
		return this.streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public BigDecimal getSubjectFk() {
		return this.subjectFk;
	}

	public void setSubjectFk(BigDecimal subjectFk) {
		this.subjectFk = subjectFk;
	}

	public BigDecimal getSubjectTypeFk() {
		return this.subjectTypeFk;
	}

	public void setSubjectTypeFk(BigDecimal subjectTypeFk) {
		this.subjectTypeFk = subjectTypeFk;
	}

	public String getTownVillage() {
		return this.townVillage;
	}

	public void setTownVillage(String townVillage) {
		this.townVillage = townVillage;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}