package com.tnsif.constructors;

public class Conexample {
Conexample(){
	System.out.println("default constructor");
}
Conexample(int i){
	System.out.println("welcome");
}
Conexample(int i,int j){
	System.out.println("hello world");
}
Conexample(int i,String n){
	System.out.println("different type");
}
public static void main(String[] args) {
	Conexample c= new Conexample();
	Conexample c1=new Conexample(4);
	Conexample c2=new Conexample(88,9);
	Conexample c3=new Conexample(6,"oNE");
}
}
