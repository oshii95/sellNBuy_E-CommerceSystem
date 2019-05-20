package com.telusko.restdemo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	
	private String name;
	private String address;
	private String mobile;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile=mobile;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
	}
	

}
