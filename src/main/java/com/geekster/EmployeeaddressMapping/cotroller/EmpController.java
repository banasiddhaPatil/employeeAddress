package com.geekster.EmployeeaddressMapping.cotroller;

import com.geekster.EmployeeaddressMapping.model.Address;
import com.geekster.EmployeeaddressMapping.model.Employe;
import com.geekster.EmployeeaddressMapping.service.AddService;
import com.geekster.EmployeeaddressMapping.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;
    @Autowired
    @PostMapping("newEmployee")
    public void EmpName(@RequestBody Employe Emp){
        empService.EmpName(Emp);
    }
    @Autowired
    @GetMapping("employees")
    public Iterable<Employe>employees(){
        return empService.employees();
    }
    @Autowired
    @GetMapping("employee/{id}")
    public Optional<Employe> empById(@PathVariable Long id){
        return empService.empById(id);
    }
    @Autowired
    @DeleteMapping("removeEmp/{id}")
    public String remEmp(@PathVariable Long id){
        return empService.remEmp(id);
    }
    @Autowired
    @PutMapping("updateEmployee/{id}/{lName}")
    public String updEmp(@PathVariable Long id,@PathVariable String lName,@PathVariable String fName){
        return empService.updEmp(id,lName,fName);
    }
}
