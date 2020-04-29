package com.gangane.construction.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gangane.construction.bean.Address;
import com.gangane.construction.bean.Labour;
import com.gangane.construction.repositories.AddressRepository;
import com.gangane.construction.repositories.LabourRepository;

@Service
public class LabourService {
	
	@Autowired
	AddressRepository addressRepository;
	
	
	@Autowired
	LabourRepository labourRepository;
		
	@Transactional
	public void registerNewLaour(Labour labour,Address address) {
		
		address =	addressRepository.save(address);
		labour.setAddressId(address.getId());
		labourRepository.save(labour);
		
	}

}
