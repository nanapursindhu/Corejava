package com.tnsif.Basicprog;

import java.util.Scanner;

public class Helloworld {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();	
			if(n%2==0) {
		System.out.println("number is even ");
	}
	else {
		System.out.println("number is odd");
	}
}
}
