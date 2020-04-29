package com.gangane.construction.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.gangane.construction.bean.Site;

public interface SiteRepository extends CrudRepository<Site, Integer> {
	
	@Query("from Site s where s.status <> :deletedStatus")
	public List<Site> findAllNonDeletedSite(@Param("deletedStatus") String deletedStatus);

}
