package com.tnsif.arraylistdemo;

import java.util.ArrayList;

public class Arraylist {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	System.out.println("size"+a1.size());
	a1.add(3);
	a1.add(9.0);
	a1.add("rashmi");
	a1.add('q');
	System.out.println("size"+a1.size());
	System.out.println(a1.contains(55));
	System.out.println(a1.isEmpty());
	System.out.println(a1.get(3));
	System.out.println(a1.remove(0));
}
}
