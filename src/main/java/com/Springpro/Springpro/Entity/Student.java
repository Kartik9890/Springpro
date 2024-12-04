package com.Springpro.Springpro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Student_DB")
@NoArgsConstructor
public class Student {

	@Id	
	@Column(name = "ID")
	@GeneratedValue
	private int id;
	
	
	@Column(name = "ST_MARK")
	private int mark;
	
	@Column(name = "NAME")
	private String name; 
	
	@Column(name = "TOKEN")
	private String token; 
}
