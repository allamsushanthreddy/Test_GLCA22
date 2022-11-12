package com.gl.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "teacher")
public class Teacher {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column(name="f_name")
	private String f_name;
	@Column(name="l_name")
	private String l_name;
	
	public Teacher() {
		
	}

	public Teacher(String f_name, String l_name) {
		this.f_name = f_name;
		this.l_name = l_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + "]";
	}
}
