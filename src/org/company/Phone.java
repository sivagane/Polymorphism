package org.company;

public class Phone {
public void phoneInfo( int i, long l) {
	System.out.println("First Method is Correct");
}
public void phoneInfo(long l, int i) {
	System.out.println("Second Method is Correct");
}
public static void main(String[] args) {
	Phone p = new Phone();
	p.phoneInfo(9994764128l, 2341853);
}
}
