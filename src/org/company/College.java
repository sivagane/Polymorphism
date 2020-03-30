package org.company;

public class College {
public void ug() {
	System.out.println("UG is UnderGraduate Degree. bSc, b.Com, B.Tech, bA are Bachelor Degree.");
}
public void pg() {
	System.out.println("PG is PostGraduate Degree. mSc, m.Com, M.Tech, mA are Master's Degree.");
}
public static void main(String[] args) {
	College c = new College();
	c.ug();
	c.pg();
}
}
