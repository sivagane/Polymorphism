package org.company;

public class Arts {
public void bSc() {
	System.out.println("bSc is Bachelor of Science.");
}
public void bEd() {
	System.out.println("bEd is Bachelor of Education.");
}
public void bA() {
	System.out.println("bA is Bachelor of Arts.");
}
public void bBA() {
	System.out.println("bBA is Bachelor of Business Administration.");
}
public void ug() {
	System.out.println("UG is UnderGraduate Degree. bSc, bA, B.Tech,..etc.., are UnderGraduate Degrees.");
}
public void pg() {
	System.out.println("PG is PostGraduate Degree. mSc, mA, M.Tech,...etc.., are PostGraduate Degrees.");
}
public static void main(String[] args) {
	Arts a = new Arts();
	a.ug();
	a.pg();
}
}
