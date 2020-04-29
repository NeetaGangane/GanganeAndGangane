package com.gangane.construction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gangane.construction.bean.Address;
import com.gangane.construction.bean.Labour;
import com.gangane.construction.repositories.LabourRepository;
import com.gangane.construction.services.LabourService;
import com.gangane.construction.util.CommonResponse;

@RestController
public class LabourController {
	
	@Autowired
	LabourService labourService;
	

	@Autowired
	LabourRepository labourRepository;
		
	@RequestMapping(value="/readAllLabour", produces = "application/json",method = RequestMethod.GET)
	@ResponseBody
	public CommonResponse readAllLabour() {
		CommonResponse commonResponse =  new CommonResponse();
		
		Iterable<Labour> labourList =labourRepository.findAll();
		
		commonResponse.setData(labourList);
				
		return commonResponse;
	}
	
	
	@RequestMapping(value="/saveNewLabour", produces = "application/json",method = RequestMethod.POST)
	@ResponseBody
	public CommonResponse saveNewLabour(@RequestBody Labour labour,@RequestBody Address address) {
		CommonResponse commonResponse =  new CommonResponse();
		
		labourService.registerNewLaour(labour, address);
		commonResponse.setMessage("New Labour saved successfully");
				
		return commonResponse;
	}

}
