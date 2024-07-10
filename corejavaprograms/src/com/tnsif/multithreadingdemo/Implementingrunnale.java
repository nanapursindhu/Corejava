package com.tnsif.multithreadingdemo;

public class Implementingrunnale implements Runnable {
public static void main(String[] args) {
	Implementingrunnale r=new Implementingrunnale();
	Thread t1=new Thread();
	t1.start();
}

@Override
public void run() {
	System.out.println("implementing runnable interface");

}	
}

