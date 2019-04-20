package com.mywork.test;

public class Products {
	String productNo;
	String productName;
	String color;
	String description;
	
	public Products(){
		
	}
	public Products(String prodNo,String prodName,String color,String desc){
		productNo=prodNo;
		productName=prodName;
		color=color;
		description=desc;
		
	}
	
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
