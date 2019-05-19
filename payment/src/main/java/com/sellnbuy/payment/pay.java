package com.sellnbuy.payment;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class pay {
	private String name;
	private int id;
	private int qty;
	private String methord;
	private String no;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getMethord() {
		return methord;
	}
	public void setMethord(String methord) {
		this.methord = methord;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "pay [name=" + name + ", id=" + id + ", qty=" + qty + ", methord=" + methord + ", no=" + no + "]";
	}
	

}
