package org.company;

public class Ktm implements Bike {
public void cost() {
	System.out.println("The cost of the Ktm Bike is 2 Lakh.");
}
public void speed() {
	System.out.println("The speed of the Ktm Bike is 250kmp.");
}
public static void main(String[] args) {
	Ktm k = new Ktm();
	k.cost();
	k.speed();
}
}
