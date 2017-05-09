package main.java.com.arithmetic;
import java.util.Scanner;
//import arithmetic.Arithmetic;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arithmetic Library");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number a");
		double a = keyboard.nextDouble();
		System.out.println("Enter number b");
		double b = keyboard.nextDouble();
		
		Arithmetic amath = new Arithmetic();
		amath.add(a, b);
		amath.dispayResult();
	}
}
