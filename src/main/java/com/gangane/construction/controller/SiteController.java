package com.gangane.construction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gangane.construction.bean.Address;
import com.gangane.construction.bean.Site;
import com.gangane.construction.repositories.SiteRepository;
import com.gangane.construction.services.SiteService;
import com.gangane.construction.util.Constants;

@RestController
public class SiteController {
	
	@Autowired
	SiteRepository siteRepository;
	
	@Autowired
	SiteService siteService;

	
	/*
	 * reads all sites where status is not a deleted 
	 */
	@RequestMapping(value="/readAllSites", produces = "application/json",method = RequestMethod.GET)
	public Iterable<Site> readAllSites() {
		
		return  siteRepository.findAll();//NonDeletedSite(Constants.SITE_STATUS_DELETED);
	}
	
	@RequestMapping(value="/saveNewSite", produces = "application/json",method = RequestMethod.GET)
	public void registerNewSite(@RequestBody Site site,@RequestBody Address address) {		
		 siteService.registerNewSite(site,address);
	}
	
}
