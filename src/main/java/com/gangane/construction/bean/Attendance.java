package com.gangane.construction.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Attendance")
public class Attendance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8118759045960468774L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="LabourId")
	private int LabourId;
	
	
	@Column(name="InTime")
	private  Date InTime;
	
	
	@Column(name="OutTime")
	private  Date OutTime;
	
	
	@Column(name="AttendanceMarkBy")
	private  String AttendanceMarkBy;
	
	

}
