package com.tnsif.finallyblock;
//without matching block
public class Test2 {
public static void main(String[] args) {
	try {
		System.out.println(100/0);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("exception caught"+e.getMessage());
	} 
	finally {
System.out.println("the end"); 
}
	System.out.println("finally");
}
}
