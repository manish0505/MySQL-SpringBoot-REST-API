package com.cs.MySQLRestApi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Mytest {
	@Autowired
	StudentRepository repo;
	@Test
	public void testCreateStudent() {
		Student s=new Student(11L,"ABC");
		repo.save(s);
	} 
	
}
