package org.overriding;

public class overriding  extends Sample{
	@Override
	public void add(int id) {
		System.out.println("employee id-"+id);	
	}
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

	
	public void sub(String name) {
		System.out.println("name of the employee is " + name);

		
	}
public static void main(String[] args) {
	overriding o = new overriding();
	o.add(123);
	o.add("soundar");
	o.add("ooty", 641407);
	o.add('s', 9965105007l, 123456789012l);
	
	
}
}
