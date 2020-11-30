package com.codeclan.example.employeeservice.models;

import javax.persistence.*;

@Entity
@Table(name ="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "age")
    private int age;

    @Column (name = "employee_number")
    private int employee_number;

    @Column (name = "email")
    private String email;

    public Employee(String name, int age, int employee_number, String email) {
        this.name = name;
        this.age = age;
        this.employee_number = employee_number;
        this.email = email;
    }

    public Employee(){}

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployee_number() {
        return employee_number;
    }

    public void setEmployee_number(int employee_number) {
        this.employee_number = employee_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
