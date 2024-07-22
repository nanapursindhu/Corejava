package com.tnsif.arraylistdemo;

import java.util.LinkedList;

public class Linkedlistdemo {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("ra");
	l.add(2);
	l.add("hjgs");
	l.add(8.9);
	System.out.println("after invoking add()"+l);
	
	l.add(1, "apple");
	System.out.println(l);
	LinkedList l1=new LinkedList();
	l1.add(l);
	l1.add("ds");
	System.out.println(l1);
	l1.addFirst("d");
	l1.addLast("sindhu");
	System.out.println(l1);
	l1.remove(1);
	System.out.println(l1);
}
}
