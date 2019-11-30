package org.overriding;

public class job extends Sample {
	@Override
	public void add(char initial, long phoneno, long accno) {
		System.out.println("initial letter of his name -"+initial);
		System.out.println("mobile no of employee-"+phoneno);
		System.out.println("bank account no-"+accno);
	
	}
	@Override
	public void add(String place, int pincode) {
		System.out.println("native of employee is "+ place+"\n"+"pincode of the city: "+pincode);
	
	}
	public static void main(String[] args) {
		job k = new job();
		k.add('s', 9965105007l, 1234578987l);
		k.add("ooty", 641407);
	}

}
