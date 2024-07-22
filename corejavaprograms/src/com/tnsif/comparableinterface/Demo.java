package com.tnsif.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
public static void main(String[] args) {
	ArrayList<Student> s=new ArrayList<Student>();
	
	Student s1=new Student(102,"sindhu","cse");
	s.add(s1);
	Student s2=new Student(103,"dattha","cse");
	s.add(s2);
	Student s3=new Student(104,"abhi","cse");
	s.add(s3);
	System.out.println("before sorting "+s);
	Collections.sort(s);
	System.out.println("after sorting"+s);

}
}
