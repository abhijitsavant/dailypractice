package com.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
class Category2{
	private long id;
    private String name;
    
    private Set<Product2> products;
    
    public Category2() {
    }
 
    public Category2(String name) {
        this.name = name;
    }
 
    @Id
    @Column(name = "CATEGORY_ID")
    @GeneratedValue
    public long getId() {
        return id;
    }
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName="CATEGORY_ID",name="CATEGORY_ID")
    public Set<Product2> getProducts() {
        return products;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setProducts(Set<Product2> products) {
		this.products = products;
	}
    
    
}
