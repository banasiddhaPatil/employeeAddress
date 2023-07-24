package com.example.mapping.repo;

import com.example.mapping.model.Address;
import com.example.mapping.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddRepo extends CrudRepository<Address,Long> {

}
