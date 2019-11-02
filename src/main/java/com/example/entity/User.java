package com.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ApiModel("User entity")
@Entity
@Table(name = "AUTH_USER")
public class User implements Serializable{
    @ApiModelProperty("User id")
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long  id;
    
    
    @ApiModelProperty("User  name")
    @Column(length = 32)
    private String userName;
    
    
    @ApiModelProperty("User  Password")
    @Column(length = 32)
    private String userPassword;
    
    
    @ApiModelProperty("User  currency")
    @Column(length = 32)
    private String currency;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}
    
    
    
    
}