package com.core.company.capgemini;

import java.util.*;
import java.util.stream.Collectors;


public class SecondHighestSalaryExample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Amit", 50000),
            new Employee("Priya", 60000),
            new Employee("Raj", 70000),
            new Employee("Suman", 55000),
            new Employee("Sumanth", 65000),
            new Employee("Kiran", 65000)
        );

        List<Employee> salaryList = employees.stream().filter(employee->employee.getSalary() >= 65000).collect(Collectors.toList());
        salaryList.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));

        List<Employee> nameSortingList = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        nameSortingList.forEach(e-> System.out.println(e.getName() + "----" + e.getSalary()));

        System.out.println(employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .map(Employee::getName)
                .findFirst()
                .orElse("No employee found"));

        List<String> secondHighestSalaryEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getSalary)
                .distinct()
                .skip(1)
                .findFirst()
                .map(secondHighest -> employees.stream()
                        .filter(e -> e.getSalary() == secondHighest)
                        .map(Employee::getName)
                        .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
        System.out.println("List Of Employees: " + secondHighestSalaryEmployees.toString());

    }



}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}