package com.tms.principles.s;

public class Accounting {
    public void changeSalary(Employee employee, int salary) {
        int k = 1; //учитывает должность, стаж и тд
        employee.setSalary(salary + k);
    }
}
