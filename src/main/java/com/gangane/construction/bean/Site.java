package com.gangane.construction.bean;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="site")
public class Site implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2321191003311723899L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="site_name")
	private String siteName;
	
	@Column(name="address_id")
	private Integer addressId;

	@Column(name="owner_name")
	private String ownerName;
	
	@Column(name="owner_phone")
	private String ownerPhone;

	@Column(name="builder_name")
	private String builderName;
	
	@Column(name="builder_phone")
	private Integer builderPhone;
	
	@Column(name="engineer_name")
	private String engineerName;
	
	@Column(name="engineer_phone")
	private String engineerPhone;
	
	@Column(name="supervisor_name")
	private String supervisorName;
	
	@Column(name="supervisor_phone")
	private String supervisorPhone;
	
	@Column(name="site_web_site")
	private String siteWebsite;
	
	@Column(name="status")
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	public String getBuilderName() {
		return builderName;
	}

	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}

	public Integer getBuilderPhone() {
		return builderPhone;
	}

	public void setBuilderPhone(Integer builderPhone) {
		this.builderPhone = builderPhone;
	}

	public String getEngineerName() {
		return engineerName;
	}

	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}

	public String getEngineerPhone() {
		return engineerPhone;
	}

	public void setEngineerPhone(String engineerPhone) {
		this.engineerPhone = engineerPhone;
	}

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

	public String getSupervisorPhone() {
		return supervisorPhone;
	}

	public void setSupervisorPhone(String supervisorPhone) {
		this.supervisorPhone = supervisorPhone;
	}

	public String getSiteWebsite() {
		return siteWebsite;
	}

	public void setSiteWebsite(String siteWebsite) {
		this.siteWebsite = siteWebsite;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	

}
