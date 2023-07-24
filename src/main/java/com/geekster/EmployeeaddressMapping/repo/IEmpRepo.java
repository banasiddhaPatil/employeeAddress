package com.geekster.EmployeeaddressMapping.repo;

import com.geekster.EmployeeaddressMapping.model.Employe;
import com.geekster.EmployeeaddressMapping.cotroller.EmpController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IEmpRepo extends CrudRepository<Employe,Long> {

}
