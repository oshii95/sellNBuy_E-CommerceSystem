package com.howtodoinjava.demo.jnt;




import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("items")
public class ItemResource 
{
	
	ItemRepository repo = new ItemRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Item> getItems()
	{
		System.out.println("Method called");	
		return repo.getItem();
	}
	
	
	@GET
	@Path("item/{id}") 
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Item getItem(@PathParam("id") int id)
	{
		return repo.getItem(id);
	}
	
	
	@POST
	@Path("item")
	
	public Item createItem(Item a1) 
	{
		System.out.println(a1);
		repo.create(a1);
		return a1;
	}
	
	
	
}
