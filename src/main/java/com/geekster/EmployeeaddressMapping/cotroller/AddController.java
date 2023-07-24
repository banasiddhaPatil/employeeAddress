package com.geekster.EmployeeaddressMapping.cotroller;

import com.geekster.EmployeeaddressMapping.model.Address;
import com.geekster.EmployeeaddressMapping.model.Employe;
import com.geekster.EmployeeaddressMapping.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddController {
    @Autowired
    AddService addService;

    @PostMapping("newAddress")
    public void address(@RequestBody Address address){
        addService.address(address);
    }
    @GetMapping("addresses")
    public Iterable<Address>add(){
        return addService.add();
    }
    @GetMapping("addBy/{id}")
    public Optional<Address> AddById(@PathVariable Long id){
        return addService.AddById(id);
    }
    @DeleteMapping("removeEmp/{id}")
    public String remAdd(@PathVariable Long id){
        return addService.remAdd(id);
    }
    @PutMapping("updateAdd/{id}")
    public String updAdd(@PathVariable Long id,@PathVariable String Street,@PathVariable String city,@PathVariable String code,@PathVariable String state)
    {
        return addService.updAdd(id,Street,city,code,state);
    }
}
