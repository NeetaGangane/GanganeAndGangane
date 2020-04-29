package com.gangane.construction.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6747000299590850257L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
		
	@Column(name="addres_line1")
	private String addresLine1;
	
	@Column(name="addres_line2")
	private String addresLine2;
	
	@Column(name="land_mark")
	private String landMark;
	
	@Column(name="pin")
	private String Pin;
	
	@Column(name="state")
	private String state;
	
	@Column(name="district")
	private String district;
	
	@Column(name="address_id")
	private Integer addressId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddresLine1() {
		return addresLine1;
	}

	public void setAddresLine1(String addresLine1) {
		this.addresLine1 = addresLine1;
	}

	public String getAddresLine2() {
		return addresLine2;
	}

	public void setAddresLine2(String addresLine2) {
		this.addresLine2 = addresLine2;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getPin() {
		return Pin;
	}

	public void setPin(String pin) {
		Pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	
	
	
	
	
}
