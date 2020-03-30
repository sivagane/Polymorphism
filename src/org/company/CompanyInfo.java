package org.company;

public class CompanyInfo {
public void companyName(String s, double d) {
	System.out.println("Method is correct"  );
}
public void companyName(String s) {
	System.out.println("Second Method is correct" );
}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName("HCL");
}
}
