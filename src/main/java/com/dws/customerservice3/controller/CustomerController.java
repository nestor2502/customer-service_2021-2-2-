package com.dws.customerservice3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dws.customerservice3.dto.Customer;
import com.dws.customerservice3.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping
	public ResponseEntity<Object> getCustomers(){
		return new ResponseEntity<>(customerService.getCustomers(), HttpStatus.OK );
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getCustomer(@PathVariable("id") int id){
		return new ResponseEntity<>(customerService.getCustomer(id), HttpStatus.OK );
	}
	
	@PostMapping
	public ResponseEntity<Object> createCustomer(@RequestBody Customer customer){
		return new ResponseEntity<>(customerService.createCustomer(customer), HttpStatus.CREATED );
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer){
		return new ResponseEntity<>(customerService.updateCustomer(customer, id), HttpStatus.OK );
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteCustomer(@PathVariable("id") int id){
		return new ResponseEntity<>(customerService.deleteCustomer(id), HttpStatus.OK );
	}
	
	
}
