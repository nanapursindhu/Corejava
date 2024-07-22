package com.tnsif.Basicprog;

public class Anested implements Fruits.Myfruits {

	@Override
public  void print() {
		System.out.println("inner interface");
	}
	public static void main(String[] args) {
		Anested a=new Anested();
		a.print();
		System.out.println(Anested.id);
	}
}
