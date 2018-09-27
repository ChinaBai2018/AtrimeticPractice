package com.ksd.entity;

public class Phone {
	private String phoneBrand;
	private String phoneModel;
	private String phonePrice;
	
	
	public Phone(String phoneBrand, String phoneModel, String phonePrice) {
		this.phoneBrand = phoneBrand;
		this.phoneModel = phoneModel;
		this.phonePrice = phonePrice;
	}
	
	public String getPhoneBrand() {
		return phoneBrand;
	}
	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}
	public String getPhoneModel() {
		return phoneModel;
	}
	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}
	public String getPhonePrice() {
		return phonePrice;
	}
	public void setPhonePrice(String phonePrice) {
		this.phonePrice = phonePrice;
	}
	
	public String toString(){
		return "Phone  "+"["+"phoneBrand="+this.phoneBrand+",phoneModel="+this.phoneModel+",phonePrice="+this.phonePrice+"]";
	}
}
