package com.dws.customerservice3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dws.customerservice3.dto.Customer;
import com.dws.customerservice3.dto.RespuestaApi;
import com.dws.customerservice3.repository.CustomerRepository;

@Service
public class CostumerServiceImp implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.getCustomers();
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerRepository.getCustomer(id);
	}

	@Override
	public RespuestaApi createCustomer(Customer costumer) {
		// TODO Auto-generated method stub
		return customerRepository.createCustomer(costumer);
	}

	@Override
	public RespuestaApi updateCustomer(Customer costumer, int id) {
		// TODO Auto-generated method stub
		return customerRepository.updateCustomer(costumer, id);
	}

	@Override
	public RespuestaApi deleteCustomer(int id) {
		// TODO Auto-generated method stub
		return customerRepository.deleteCustomer(id);
	}

}
