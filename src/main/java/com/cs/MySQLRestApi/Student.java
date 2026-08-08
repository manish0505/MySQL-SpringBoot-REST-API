package com.cs.MySQLRestApi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name = "studenttable")
	public class Student {
		  @Id
		  
		  private Long student_id;
		  
		  private String student_name;
		    
			public Student() {
				super();
			}
			public Student(Long student_id, String student_name) {
				super();
				this.student_id = student_id;
				this.student_name = student_name;
			}
			public Long getStudent_id() {
				return student_id;
			}
			public void setStudent_id(Long student_id) {
				this.student_id = student_id;
			}
			public String getStudent_name() {
				return student_name;
			}
			public void setStudent_name(String student_name) {
				this.student_name = student_name;
			}

	}




