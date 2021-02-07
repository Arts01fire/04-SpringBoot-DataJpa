package com.yogesh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="machine")
public class Machine {
	
	@Id
	@Column(name="Machine_Id")
	private Integer MachineId;
	@Column(name="Machine_Name")
	private String MachineName;
	@Column(name="Machine_Number")
	private Integer MachineNumber;

}
