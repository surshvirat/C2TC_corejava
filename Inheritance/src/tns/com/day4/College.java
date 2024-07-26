package tns.com.day4;

public class College {
	void display() {
		System.out.println("REC");
	}
}
class Department extends  College {
	void out() {
		System.out.println("CSE");

		
	}
	
}
class Year extends  Department {
	void print() {
		System.out.println("Final year");

	}
}
