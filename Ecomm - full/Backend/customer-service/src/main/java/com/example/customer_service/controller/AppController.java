package com.example.customer_service.controller;

import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer_service.model.Customer;
import com.example.customer_service.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "*")
public class AppController {
	
	@Autowired
    private CustomerService customerService;

    // Create new customer
    @PostMapping
    public void saveCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
    }

    // Get all customers
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    // Get customer by ID
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    // Delete customer by ID
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCust(@PathVariable Long id, @RequestBody Customer customer){
    	customerService.updateCustomer(id, customer);
    	return ResponseEntity.ok().build();
    	
    }
    
}
