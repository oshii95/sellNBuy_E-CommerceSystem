package com.sellnbuy.payment;


import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("pay")
public class payResource 
	{
	
	payRepository repo = new payRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<pay> getpay()
	{
		System.out.println("getpay called...");
		
			
		return repo.getpay();
		
	}
	@GET
	@Path("Pay/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public pay getpay(@PathParam("id")int id)
	
	{
		return repo.getpay(id);
	}
	
	
	@POST
	@Path("pay")
	public pay createpay(pay p1)
	{
		System.out.println(p1);
		repo.create(p1);
		return p1;
	}

}
