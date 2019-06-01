package com.performance.itemMVC.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

//import com.couchbase.client.java.repository.annotation.Field;
//import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Item {

	@Id
	private String id = UUID.randomUUID().toString();

//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}

	private String category;

	private String brand;

	private String description;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
