package com.tnsif.encapsulation;

import java.util.Scanner;

public class Personexe {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	String name=sc.nextLine();
	System.out.println("enter your income");
	int income=sc.nextInt();
	Person pp=new Person();
	pp.setName(name);
	pp.setIncome(income);
	Calculationtax t= new Calculationtax();
	t.taxcalculation(pp);
	System.out.println("after modification");
	System.out.println(pp);
}
}
