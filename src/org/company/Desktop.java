package org.company;

public class Desktop implements Hardware  {
public void desktopModel() {
	System.out.println("The Desktop Model is Dell Inspiron.");
}
public void hardwareResources() {
	System.out.println("The Hardware Resources are Monitor, Keyboard, Mouse and CPU");
}
public void softwareResources0() {
	System.out.println("The Software Resources are Java, Eclipse and Selenium");
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopModel();
	d.hardwareResources();
	d.softwareResources0();
}
}
