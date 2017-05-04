package ttu.idu0080.order.server.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the address database table.
 * 
 */
@Entity
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long address;

	@Column(name="address_type_fk")
	private Integer addressTypeFk;

	private String country;

	private String county;

	@Column(name="street_address")
	private String streetAddress;

	@Column(name="subject_fk")
	private Integer subjectFk;

	@Column(name="subject_type_fk")
	private Integer subjectTypeFk;

	@Column(name="town_village")
	private String townVillage;

	private String zipcode;

	public Address() {
	}

	public long getAddress() {
		return this.address;
	}

	public void setAddress(long address) {
		this.address = address;
	}

	public Integer getAddressTypeFk() {
		return this.addressTypeFk;
	}

	public void setAddressTypeFk(Integer addressTypeFk) {
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

	public Integer getSubjectFk() {
		return this.subjectFk;
	}

	public void setSubjectFk(Integer subjectFk) {
		this.subjectFk = subjectFk;
	}

	public Integer getSubjectTypeFk() {
		return this.subjectTypeFk;
	}

	public void setSubjectTypeFk(Integer subjectTypeFk) {
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