package com.gangane.construction.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gangane.construction.bean.Labour;


@Repository
public interface LabourRepository extends CrudRepository<Labour, Integer> {

}
