package com.form.RegisterForm.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	@Id
	private String fullName;
	private Integer age;
	private Long mobileNo;
	
	
	public User(String fullName, Integer age, Long mobileNo) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.mobileNo = mobileNo;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}


	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
	
	
	

}
