package com.tnsif.throwexample;

import java.io.IOException;

public class Demo {
public static void main(String[] args) {
	Throwsdemo d=new Throwsdemo();
	try {
		d.display();
	}
	catch(IOException e) {
		System.out.println("found exception"+e.getMessage());
	}
}
}
