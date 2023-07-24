package com.example.mapping.repo;

import com.example.mapping.model.Employe;
import com.example.mapping.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IEmpRepo extends CrudRepository<Employe,Long> {

}
