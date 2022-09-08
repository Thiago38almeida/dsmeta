package com.devsuperior.dsmeta.entities;

import java.time.LocalDate; // import da biblioteca date

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// declaração de classe
@Entity
@Table (name= "tb_sales") // declara a table do bando de dados
public class sales {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id; //long = dados inteiros com long escola
	 private String SellerName; //string = texto
	 private Integer visited;
	 private Integer deals;
	 private Double amount; // double = dados com numeros quebrados
	 private LocalDate date;

	// methods de acesso da classe
	public sales() {
		 
	 }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getSellerName() {
		return SellerName;
	}


	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}


	public Integer getVisited() {
		return visited;
	}


	public void setVisited(Integer visited) {
		this.visited = visited;
	}


	public Integer getDeals() {
		return deals;
	}


	public void setDeals(Integer deals) {
		this.deals = deals;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}
}
