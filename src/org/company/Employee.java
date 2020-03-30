package org.company;



public class Employee {
public void empId(short s) {
	System.out.println("The Emplou=yee Id is" +s);
}
public void empId(long l) {
	System.out.println("The Employee Id is" +l);
}
public void empId(int i) {
	System.out.println("The Employee Id is" +i);
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empId(1234);
	e.empId(1234);
	e.empId(1234);
}
}
