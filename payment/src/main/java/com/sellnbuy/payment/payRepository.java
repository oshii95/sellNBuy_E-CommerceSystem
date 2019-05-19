package com.sellnbuy.payment;



import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class payRepository {
	
	
	
	Connection con = null;
	public payRepository()
	{
		String url = "jdbc:mysql://localhost:3306/"
		con = DriverManager.getConnection(url)
	}
	
	public List<pay> getpay()
	{
		return Pays;
	}
	
	public pay getpay(int id)
	{
		pay p1 = null;
		
		for(pay p : Pays)
		{
			if(p.getId()==id)
				return p;
		}
		return new pay();
	}

	public void create(pay p1) {
		// TODO Auto-generated method stub
		Pays.add(p1);
		
	}
	

}
