package com.tms.principles.s;

import java.util.Date;

public class Employee {
    private int age;
    private String name;
    private int salary;
    private Date workTo;
    private String position;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getWorkTo() {
        return workTo;
    }

    public void setWorkTo(Date workTo) {
        this.workTo = workTo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
