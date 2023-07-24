package com.example.mapping.service;

import com.example.mapping.model.Employe;
import com.example.mapping.repo.IEmpRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    IEmpRepo iEmpRepo;

    public void EmpName(Employe emp) {
        iEmpRepo.save(emp);
    }

    public Iterable<Employe> employees() {
        return iEmpRepo.findAll();
    }

    public Optional<Employe> empById(Long id) {
        return iEmpRepo.findById(id);
    }

    public String remEmp(Long id) {
        iEmpRepo.deleteById(id);
        return "Employee is Removed";
    }
    @Transactional
    public String updEmp(Long id, String lName, String fName) {

        boolean isPresent=iEmpRepo.existsById(id);
        if(isPresent){
            Optional<Employe> employee =iEmpRepo.findById(id);
            Employe emp=employee.get();
            emp.setLastName(lName);
            emp.setFirstName(fName);
            iEmpRepo.save(emp);
            return "Employee has been updated";
        }
        else{
            return "Employee with this id " + id +" not present";
        }
    }
}
