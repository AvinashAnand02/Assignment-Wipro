package com.example.customer_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.customer_service.model.Customer;
import com.example.customer_service.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		
		
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	public Customer getCustomerById(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).get();
	}

	public void deleteCustomer(Long id) {
		// TODO Auto-generated method stub
		
		customerRepository.deleteById(id);
		
	}
	public Customer updateCustomer(Long id, Customer customer) {
	    // Find the existing customer in DB
	    Customer existing = customerRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));

	    // Update fields
	    existing.setName(customer.getName());
	    existing.setEmail(customer.getEmail());
	    existing.setPassword(customer.getPassword());

	    // Save updated customer back to DB
	    return customerRepository.save(existing);
	}

	
	

}
