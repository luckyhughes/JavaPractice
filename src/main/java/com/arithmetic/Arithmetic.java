package main.java.com.arithmetic;

public class Arithmetic{
	
	double a,b,compute; //class variables
	
	public double add(double a, double b){
		this.a = a;
		this.b = b;
		compute = a+b;
		return compute;
	}
	
	public double subtraction(double a, double b){
		this.a = a;
		this.b = b;
		compute = a-b;
		return compute;
	}
	
	public void dispayResult(){
		System.out.println("Input is a: " +a + " and b:" + b);
		System.out.println("Output is :" + compute);
	}
}
