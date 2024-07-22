package com.tnsif.arraylistdemo;
//demo for generics
import java.util.ArrayList;
import java.util.Iterator;

public class Testgenerics {
	public static void main(String[] args) {
		
ArrayList <String> a1=new ArrayList<String>();
a1.add("rohit");
a1.add("guru");
a1.add("ramya");
//a1.add(6);
System.out.println("elements "+a1);

Iterator<String>itr=a1.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}
}
