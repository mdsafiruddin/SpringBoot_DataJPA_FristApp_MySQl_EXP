package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Product {
	
	@Id
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	
	
	public Product() {
		System.out.println("model class object");
	}
	

	public Product(Integer prodId, String prodCode, double d) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodCost = d;
	}





	public Integer getProdId() {
		return prodId;
	}


	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}


	public String getProdCode() {
		return prodCode;
	}


	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}


	public Double getProdCost() {
		return prodCost;
	}


	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}


	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + "]";
	}

	
	
}
