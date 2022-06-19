package com.gangane.construction.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gangane.construction.bean.LabourPayment;
import com.gangane.construction.repositories.PaymentRepository;
import com.gangane.construction.util.Utility;


@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	
	/*
	 * read A short
	 * PaymentHistory return rows 5 or 10
	 */
	public List<LabourPayment> readLabourPaymentHistoryByLabourId(Integer labourId,int rowCount) {
		//return paymentRepository.findPaymentHistorylastNRecords(labourId, rowCount);
		return paymentRepository.findLabourPaymentByLabourId(labourId);
	}
	
	/*
	 * read
	 * PaymentHistory of current month starting 1st day
	 */
	public List<LabourPayment> readLabourPaymentHistoryByLabourId(Integer labourId) {
		return null;
		//return paymentRepository.findPaymentHistoryFromCriteriaDate(labourId, Utility.getFirsDateOfTheMonth());
	}
	
	/*
	 * read
	 * PaymentHistory of of given date period
	 */
	public List<LabourPayment> readLabourPaymentHistoryByLabourId(Date startDate,Date endDate,Integer labourId) {
		//return paymentRepository.findPaymentHistoryWithDateRange(labourId, startDate, endDate);
		return null;
	}
	
	public void savePaymentDetails(LabourPayment labourPayment,Integer loggedInUser){
		
		labourPayment.setPaymentDate(new Date());
		labourPayment.setPaymentBy(loggedInUser);
		
		paymentRepository.save(labourPayment);
	}

}
