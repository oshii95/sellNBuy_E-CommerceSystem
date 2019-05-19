package com.howtodoinjava.demo.jnt;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class ItemRepository 
{
	
	
	
	Connection con = null;
	
	public ItemRepository() 
	{
		String url = "jdbc;mysql;//localhost;3308/sell_bymobile";
        String username="root";
        String password="";
        
		try {
			
			Class.forName("con.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Item> getItem()
	{
		return items;
	}
	
	public Item getItem(int id)
	{
		
		
		for(Item a : items)
		{
			if(a.getId()==id)
				return a;
		}
		
		return new Item();
	}
	
	

	public void create(Item a1) {
		// TODO Auto-generated method stub
		items.add(a1);
	}

}
