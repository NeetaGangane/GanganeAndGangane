package com.gangane.construction.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gangane.construction.bean.LabourPayment;
import com.gangane.construction.services.PaymentService;
import com.gangane.construction.util.Utility;

@RestController
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@RequestMapping(value="/makeApayment",method= {RequestMethod.POST})
	@ResponseBody
	public void paySalaryToLabour(@RequestBody LabourPayment labourPayment) {
		Integer loggedInUser =1;
		paymentService.savePaymentDetails(labourPayment, loggedInUser);		
	}
	
	
	@RequestMapping(value="/getPaymentHistory",method= {RequestMethod.POST})
	@ResponseBody
	public List<LabourPayment>  readPaymentHistoryOfLabour(HttpServletRequest request) {
		
		JSONObject jObject;
		try {
			jObject = Utility.extractJsonFromRequest(request);
			Integer labourId = jObject.getInt("labourid");
			
			return paymentService.readLabourPaymentHistoryByLabourId(labourId);	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
			
	}

}
