package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	private String dbVendor;

	public void setDbVendor(String dbVendor) {
		this.dbVendor = dbVendor;
	}


	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		System.out.println(dbVendor);
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Juan");
		customer.setLastName("Balceda");
		
		customers.add(customer);
		
		return customers;
	}
}
