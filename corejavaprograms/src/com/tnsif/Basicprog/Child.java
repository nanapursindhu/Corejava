package com.tnsif.Basicprog;

public class Child  extends Father{
	public void eating() {
		System.out.println("burger");
	}
	public static void main(String[] args) {
		Child c= new Child();
		c.eating();
	}
	
}
