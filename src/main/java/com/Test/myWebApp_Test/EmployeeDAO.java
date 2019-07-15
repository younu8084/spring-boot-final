package com.Test.myWebApp_Test;

import org.springframework.stereotype.Repository;


 
@Repository
public class EmployeeDAO
{
     static Employees list = new Employees();
     
    static
    {
        list.getEmployeeList().add(new Employee(1, "Subha", "Satapathy", "papunpikun@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
    }
     
    public Employees getAllEmployees()
    {
        return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}