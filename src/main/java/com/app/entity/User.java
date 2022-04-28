package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Column(name="Status")
	 private String Status;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int User_ID;
	
	@Column(name="Email_ID")
	private String Email_ID;
	
	@Column(name="College_Roll_Number")
	private int College_Roll_Number;
	
	@Column(name="numbers")
	private int[] numbers;
	
	@Column(name="alphabets")
	private char[] alphabets;
	
	
	public User() {
		
		
	}
	
//	---------------------------------------------------------------------------------------------------
	
public User(String status, int user_ID, String email_ID, int college_Roll_Number, int[] numbers, char[] alphabets) {
		super();
		Status = status;
		User_ID = user_ID;
		Email_ID = email_ID;
		College_Roll_Number = college_Roll_Number;
		this.numbers = numbers;
		this.alphabets = alphabets;
	}
//	----------------------------------------
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}
	public String getEmail_ID() {
		return Email_ID;
	}
	public void setEmail_ID(String email_ID) {
		Email_ID = email_ID;
	}
	public int getCollege_Roll_Number() {
		return College_Roll_Number;
	}
	public void setCollege_Roll_Number(int college_Roll_Number) {
		College_Roll_Number = college_Roll_Number;
	}
	public int[] getNumbers() {
		return numbers;
	}
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	public char[] getAlphabets() {
		return alphabets;
	}
	public void setAlphabets(char[] alphabets) {
		this.alphabets = alphabets;
	}
	
	

}
