package com.mvnparameter.dto;

import java.util.Date;

public class Employee {


	private Integer idemploye;
	private String name;
	private String lastname;
	private String documenttype;
	private Date birthdate;
	private Date companydate;
	private Double salary;
	private String post;
	public Integer getIdemploye() {
		return idemploye;
	}
	public void setIdemploye(Integer idemploye) {
		this.idemploye = idemploye;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDocumenttype() {
		return documenttype;
	}
	public void setDocumenttype(String documenttype) {
		this.documenttype = documenttype;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Date getCompanydate() {
		return companydate;
	}
	public void setCompanydate(Date companydate) {
		this.companydate = companydate;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}

	
}
