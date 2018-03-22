package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	/*
	 * @Autowired 
	 * private CustomerRepository customerRepository;
	 */
	private CustomerRepository customerRepository;

	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Using constructor injection");
		this.customerRepository = customerRepository;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	/*
	 * @Autowired public void setCustomerRepository(CustomerRepository
	 * customerRepository) { System.out.println("Using Setter Injection");
	 * this.customerRepository = customerRepository; }
	 */
}
