package com.telusko.restdemo;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;
//import javax.enterprise.inject.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("customers")
public class CustomerResources {
	
	
	CustomerRepository repo = new CustomerRepository(); 
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Customer> getCustomers() {
		

		return repo.getCustomers();
	
	}
	
	
	@GET
	@Path("customer/{name}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Customer getCustomer(@PathParam("name") String name){
		
		return repo.getCustomer(name);
		
	}
	
	
	@POST
	@Path("customer")
	public Customer CreateCustomer(Customer c1) {
		System.out.println(c1);
		
		repo.create(c1);
		
		return c1;
	}

}
