package com.tnsif.encapsulation;

public class Calculationtax {
public void taxcalculation(Person p) {
	if(p.getIncome()<=1600) {
		p.setTax(0);
	}
	else if(p.getIncome()>1600 && p.getIncome()<30000) {
		p.setTax(5);
	}
	else {
		p.setTax(10);
	}
}
}
