package com.example.mapping.controller;

import com.example.mapping.model.Address;
import com.example.mapping.model.Employe;
import com.example.mapping.service.AddService;
import com.example.mapping.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;

    @PostMapping("newEmployee")
    public void EmpName(@RequestBody Employe Emp){
        empService.EmpName(Emp);
    }
    @GetMapping("employees")
    public Iterable<Employe>employees(){
        return empService.employees();
    }
    @GetMapping("employee/{id}")
    public Optional<Employe> empById(@PathVariable Long id){
        return empService.empById(id);
    }
    @DeleteMapping("removeEmp/{id}")
    public String remEmp(@PathVariable Long id){
        return empService.remEmp(id);
    }
    @PutMapping("updateEmployee/{id}/{lName}")
    public String updEmp(@PathVariable Long id,@PathVariable String lName,@PathVariable String fName){
        return empService.updEmp(id,lName,fName);
    }
}
