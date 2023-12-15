package com.staffmanagment.Entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
public class Employee {
    @Id
    private Long id;
    private String name;
    private int joinYear;
    private float salary;

    public Employee() {

    }

    public Employee(String name, int joinYear, float salary) {
        this.name = name;
        this.joinYear = joinYear;
        this.salary = salary;
    }

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

    public int getJoinYear() {
        return joinYear;
    }

    public void setJoinYear(int joinYear) {
        this.joinYear = joinYear;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}