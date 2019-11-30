package org.overriding;

public class jobs extends overriding {
	public void add(String place,int pincode) {
		System.out.println("native of employee is "+ place+"\n"+"pincode of the city: "+pincode);
	}	

	public void add(char initial,long phoneno,long accno) {
		System.out.println("initial letter of his name -"+initial);

		}
	

public void add(int id) {
	System.out.println("employee id "+id);
}
public void sub(String name) {
	System.out.println("name of the employee is " + name);
}
public static void main(String[] args) {
	jobs i = new jobs();
i.add(1345);
i.add("coimbatore", 641407);
i.add('s', 995105007, 1234578912);
	
i.sub("soundar");



}
}