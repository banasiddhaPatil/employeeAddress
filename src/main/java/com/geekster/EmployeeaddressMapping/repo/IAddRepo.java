package com.geekster.EmployeeaddressMapping.repo;

import com.geekster.EmployeeaddressMapping.model.Address;
import com.geekster.EmployeeaddressMapping.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddRepo extends CrudRepository<Address,Long> {

}
