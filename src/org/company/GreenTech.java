package org.company;

public class GreenTech {
public void greensOmr(int i, String s, String st, String ar, String dt, long l) {
	System.out.println("First Order of Arguments is Correct");
}
public void greensOmr(String s, int i, long l, String st, String ar, String dt) {
	System.out.println("Second Order of Arguments is Correct");
}
public void greensOmr1(int i, String s, String st, String dt) {
	System.out.println("First Number of Arguments is Correct");
}
public void greensOmr1(int i, String s, String st, String ar, String dt, long l) {
	System.out.println("Second Number of Arguments is Correct");
}
public void greensOmr2(int i, String s, double d, String ar, String dt, long l) {
	System.out.println("First Datatypes is Correct");
}
public void greensOmr2(int i, String s, String st, String ar, String dt, long l) {
	System.out.println("Second Datatypes is Correct");
}
public static void main(String[] args) {
	GreenTech g = new GreenTech();
	g.greensOmr(19, "BalamuruganGarden", "ArunPlaza","Thorapakkem","Kancheepuram",9754621890l);
	g.greensOmr1(19, "BalamuruganGarden", "ArunPlaza","Thorapakkem","Kancheepuram",9754621890l);
	g.greensOmr2(19, "BalamuruganGarden", "ArunPlaza","Thorapakkem","Kancheepuram",9754621890l);
}
}


