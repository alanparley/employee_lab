package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {

		Employee alan = new Employee("Alan Parley", 43, 678123, "alanparley@hotmail.com");
		employeeRepository.save(alan);
		Employee paul = new Employee("Paul Donegan", 40, 289374, "paul@paul.com");
		employeeRepository.save(paul);

	}

}
