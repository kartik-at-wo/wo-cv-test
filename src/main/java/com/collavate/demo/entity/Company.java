package com.collavate.demo.entity;


import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="company")
public class Company {

	@Id
	 @GeneratedValue(generator = "Incremental")
    @GenericGenerator(
        name = "Incremental",
        strategy = "org.hibernate.id.IncrementGenerator"
    )
	private Long id;

	private String name;

	private String email;

	private long phone;
	
	@Column(name="isPermanent")
	private boolean isPermanent;
	
	private String branch;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public boolean getIsPermanent() {
		return isPermanent;
	}

	public void setIsPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", isPermanent="
				+ isPermanent + ", branch=" + branch + "]";
	}

}
