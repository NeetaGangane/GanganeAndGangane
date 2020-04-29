package com.gangane.construction.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gangane.construction.bean.Address;


@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {

}
