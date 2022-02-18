package com.xworkz.mobiles.dto;

import java.io.Serializable;

public class MobilesDTO implements Serializable{
	
	 private String BrandName;
	 private int Price;
	 private String color;
	 private int Storage;
	 
	 public  MobilesDTO() {
		 
	 }

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getStorage() {
		return Storage;
	}

	public void setStorage(int storage) {
		Storage = storage;
	}
	 
}

