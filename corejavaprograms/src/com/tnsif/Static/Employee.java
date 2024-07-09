package com.tnsif.Static;
//static varaiables
public class Employee {
int eid;
String ename;
static String company="TNS";
Employee (int r,String n){
	eid=r;
	ename=n;
	
}
void display() {
	System.out.println(eid+" "+ename+" "+company);
}

}
