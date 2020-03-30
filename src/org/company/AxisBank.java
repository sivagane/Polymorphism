package org.company;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("Deposit account is for long term savings. More amount should be deposited to open the account. Interst will be paid to the customers at regular intervals.");
}
public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.saving();
	a.fixed();
	a.deposit();
	
}
}
