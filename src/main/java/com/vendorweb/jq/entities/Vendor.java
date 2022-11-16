package com.vendorweb.jq.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {

	@Id
	private int id;
	private String code;
	private String name;
	private String type;
	@Column(name = "vphone")
	private String phone;
	@Column(name = "vemail")
	private String email;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + "]";
	}

	

}
