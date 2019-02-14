package jUnitProject;

public class Main {

	public static void main(String[] args) {
		System.out.println("Check the numbers below:");
		
		Calculator2 calc = new Calculator2();
		System.out.println(calc.add(30, 20));
		System.out.println(calc.subtract(10, 20));
		System.out.println(calc.multiply(16, 20));
		System.out.println(calc.devide(52, 3));

	}	
}

class Calculator2 {
	
	public int add(int a, int b) {
		int r = a + b;
		return r;
	}
	
	public int subtract(int a, int b) {
		int r = a - b;
		return r;
	}
	
	public double devide(double a, double b) {
		double r = a / b;
		return r;
	}
	
	public int multiply(int a, int b) {
		int r = a * b;
		return r;
	}

}