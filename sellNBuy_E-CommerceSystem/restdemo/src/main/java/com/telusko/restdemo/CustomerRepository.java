package com.telusko.restdemo;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
	
	List<Customer> customers;
	
	public CustomerRepository() {
		
		customers= new ArrayList();
		
		Customer c1= new Customer();
		c1.setName("Samadhi");
		c1.setAddress("Kandy");
		c1.setMobile("0773262651");

		Customer c2= new Customer();
		c2.setName("SamadhiM");
		c2.setAddress("Kandy");
		c2.setMobile("0773262651");
		
		customers.add(c1);
		customers.add(c2);
		
		
	}
	
public List<Customer> getCustomers(){
	return customers;
}


public Customer getCustomer(String name){

		//Customer c1=null;

		for(Customer c : customers){

				if(c.getName()==name)
					return c;
				}

		return null;
		
}

public void create(Customer c1) {
	// TODO Auto-generated method stub
	customers.add(c1);
	
}
















	
}
