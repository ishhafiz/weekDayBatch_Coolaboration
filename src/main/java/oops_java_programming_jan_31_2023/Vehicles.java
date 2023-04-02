package oops_java_programming_jan_31_2023;

public class Vehicles {

	public static void main(String[] args) {
		
		System.out.println("This is the main method");
		methodName();
		
		Vehicles vehicles = new Vehicles();
		vehicles.methodName1();
	}
	
	public static void methodName() {
		System.out.println("This is the static method");
	}
	
	public void methodName1() {
		System.out.println("This is the non-static method");
	}

}
