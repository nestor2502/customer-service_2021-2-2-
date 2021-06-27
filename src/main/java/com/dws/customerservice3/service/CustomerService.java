package com.dws.customerservice3.service;

import java.util.List;

import com.dws.customerservice3.dto.Customer;
import com.dws.customerservice3.dto.RespuestaApi;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public Customer getCustomer(int id);
	
	public RespuestaApi createCustomer(Customer costumer);
	
	public RespuestaApi updateCustomer(Customer costumer, int id);
	
	public RespuestaApi deleteCustomer(int id);
}
