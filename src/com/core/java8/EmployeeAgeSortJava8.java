package com.core.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeAgeSortJava8 {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1000,"smita", 28));
		persons.add(new Person(1002,"jhon", 29));
		persons.add(new Person(1001,"scott", 12));
		persons.add(new Person(1003,"amit", 22));
		persons.add(new Person(1005,"prince", 31));
		persons.add(new Person(1004,"jhon", 31));
		//persons.stream().filter(person).collect(Collections.sort(Person::getAge)).collections.asList());
		
		//Collections.sort(persons, Comparator.comparing(Person::getAge));
		
		List<Person> ageFilterPerson = persons.stream().filter(person->person.getAge()>28).collect(Collectors.toList());
		
		System.out.println("Get Only 28 above employee:"+ageFilterPerson);
		
		//employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		List<String> nameList = persons.stream().filter(person->person.getAge()>28).map(Person::getName).collect(Collectors.toList());
		System.out.println("Get Only name which employee is greater than 28:"+nameList);
		
		List<Person> jhonNameList = persons.stream().filter(person->person.getName().equals("jhon")).collect(Collectors.toList());
		System.out.println("jhon name list:"+jhonNameList);
		
		Map<Integer,String> mapOfPerson = persons.stream().collect(Collectors.toMap(p->p.getAadhaarId(), p->p.getName()));
		System.out.println("Map:"+mapOfPerson);
		
		mapOfPerson.forEach((key,val)->{
			System.out.println("Key:"+key + " "+ "Value:"+val);
		});
		
		Collections.sort(persons,Comparator.comparing(Person::getName).thenComparingInt(Person::getAge));
		System.out.println("Sorting :"+persons);
	}

}
