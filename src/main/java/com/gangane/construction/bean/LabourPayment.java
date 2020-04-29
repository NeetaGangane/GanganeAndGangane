package com.gangane.construction.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="labour_payment")
public class LabourPayment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2649777462058853318L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name="labour_id")
	private int labourId;
	
	@Column(name="payment_by")
	private int paymentBy;
	
	@Column(name="payment_date")
	private Date paymentDate;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="payment_mode")
	private int paymentMode;
	
	@Column(name="payment_type")
	private int paymentType;

	public int getLabourId() {
		return labourId;
	}

	public void setLabourId(int labourId) {
		this.labourId = labourId;
	}

	public int getPaymentBy() {
		return paymentBy;
	}

	public void setPaymentBy(int paymentBy) {
		this.paymentBy = paymentBy;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}

	public int getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
}
