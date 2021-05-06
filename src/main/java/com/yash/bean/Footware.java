/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yash.bean;
/**
 *
 * @author nilam
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Footware {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE )
	private Integer id;
	
	@NotEmpty(message = "Please provide a name")
	private String name;
	
	@NotEmpty(message = "Please provide a description")
	private String description;

        @NotEmpty(message = "Please provide a price")
	private Integer price;


        public Footware() {
		super();
	}
	public Footware(Integer id, String name, String description, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
                this.price=price;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
}
