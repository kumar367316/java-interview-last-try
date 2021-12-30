package com.core.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionApiTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Class clazz = Class.forName("com.core.reflection.Student");

		// List of Annotation in student class
		System.out.println();
		System.out.println("****Annotation are *****");
		Annotation[] annotationList = clazz.getAnnotations();
		for (Annotation annotation : annotationList) {
			System.out.println("annotations are:" + annotation);
		}

		// List of method in Student class
		System.out.println();
		System.out.println("****method are *****");
		Method[] methodList = clazz.getDeclaredMethods();
		for (Method method : methodList) {
			System.out.println("methods are:" + method);
		}

		// List of constructor in Student class
		System.out.println();
		System.out.println("****Constructor are *****");
		Constructor[] constructorList = clazz.getConstructors();
		for (Constructor constructor : constructorList)
			System.out.println("Constructor are:" + constructor);

		// List of fields in Student class
		System.out.println();
		System.out.println("****Constructor are *****");
		Field[] fieldList = clazz.getDeclaredFields();
		for (Field field : fieldList)
			System.out.println("Field are:" + field);
		
		System.out.println(clazz.isInterface());
		
		System.out.println(clazz.getPackage());
		
		System.out.println(clazz.isArray());

	}

}
