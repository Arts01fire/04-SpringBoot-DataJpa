package com.yogesh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="contact")
public class Contact {
	
	@Id
	@Column(name="Contact_Id")
	private Integer ContactId;
	@Column(name="Contact_Name")
	private String ContactName;
	@Column(name="Contact_Number")
	private Integer ContactNumber;

}
