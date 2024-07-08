package com.tnsif.constructors;
import java.util.Scanner;
public class Customerdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your cid");
		int cid=sc.nextInt();
		System.out.println("enter your address");
		String address=sc.next();
		Customer c=new Customer();
		c.setCname(name);
		c.setCid(cid);
		c.setCaddress(address);
	System.out.println(c);
	boolean out =c instanceof Customer;
System.out.println(out);
}
}
