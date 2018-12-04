package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "PRODUCT")
public class Product2 {
    private long id;
    private String name;
    private String description;
    private float price;
 
    private String category_id;
    public Product2() {
    }
 
    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue
    public long getId() {
        return id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	

	public Product2(String name, String description, float price, String category_id) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.category_id = category_id;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public void setId(long id) {
		this.id = id;
	}

    
 
}
