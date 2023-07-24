package com.example.mapping.service;

import com.example.mapping.model.Address;
import com.example.mapping.repo.IAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AddService {
    @Autowired
    IAddRepo iAddRepo;

    public void address(Address address) {
        iAddRepo.save(address);
    }

    public Iterable<Address> add() {
        return iAddRepo.findAll();
    }

    public Optional<Address> AddById(Long id) {
        return iAddRepo.findById(id);
    }

    public String remAdd(Long id) {
        iAddRepo.deleteById(id);
        return "Removed";
    }
    @Transactional
    public String updAdd(Long id, String street, String city, String code,String state) {
         boolean isPresent=iAddRepo.existsById(id);
         if(isPresent){
             Optional<Address> address=iAddRepo.findById(id);
             Address add=address.get();
             add.setCity(city);
             add.setStreet(street);
             add.setState(state);
             add.setZipCode(code);
             return "address updated for id "+id ;
         }
         else{
             return "Invalid address id "+id;
         }
    }
}
