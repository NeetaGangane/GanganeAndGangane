package com.gangane.construction.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gangane.construction.bean.Address;
import com.gangane.construction.bean.Site;
import com.gangane.construction.repositories.AddressRepository;
import com.gangane.construction.repositories.SiteRepository;

@Service
public class SiteService {
	
	@Autowired
	AddressRepository addressRepository;
	
	
	@Autowired
	SiteRepository siteRepository;
		
	@Transactional
	public void registerNewSite(Site site,Address address) {
		
		address =	addressRepository.save(address);
		site.setAddressId(address.getId());
		siteRepository.save(site);
		
	}

}
