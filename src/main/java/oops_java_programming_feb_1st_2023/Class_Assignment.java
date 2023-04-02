package oops_java_programming_feb_1st_2023;

public class Class_Assignment {

	public int addition(int x, int y) {
		System.out.println(x + y);
		return x+y;
	}

	public int subtraction(int x, int y) {
		int sub=x-y;
		System.out.println(sub);
		return sub;
	}

	public int multiplication(int x, int y) {
		int mult = (x * y);
		System.out.println(mult);
		return mult;
	}

	public int division(int x, int y) {
		int div = x/y;
		System.out.println(div);
		return div;
	}

	public static void main(String[] Args) {

		int a = 2;
		int b = 3;
		
		Class_Assignment ca = new Class_Assignment();
		
		ca.addition(a, b);
		int c=	ca.addition(a, b);

		ca.subtraction(a, b);
		ca.multiplication(c, b);
		ca.division(a, b);
		

	}
}