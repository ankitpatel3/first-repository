package jUnitProject;

public class Main {

	public static void main(String[] args) {
		System.out.println("Check the numbers below:");
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(15, 20));
		System.out.println(calc.subtract(15, 20));
		System.out.println(calc.multiply(15, 20));
		System.out.println(calc.devide(20, 3));

	}

}
