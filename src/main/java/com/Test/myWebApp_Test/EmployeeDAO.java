package com.Test.myWebApp_Test;

import org.springframework.stereotype.Repository;


 
@Repository
public class EmployeeDAO
{
     static Employees list = new Employees();
     
    static
    {
        list.getEmployeeList().add(new Employee(1, "Samlee", "Mohanty", "samleemohanty97@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Subha", "Satapathy", "papunpikun@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Sudipa", "Behera", "sudipabehera24@gmail.com"));
        list.getEmployeeList().add(new Employee(4, "Hemant", "Tiwari", "amanhemant01@gmail.com"));
    }
     
    public Employees getAllEmployees()
    {
        return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
