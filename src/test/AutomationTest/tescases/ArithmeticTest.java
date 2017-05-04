package test.AutomationTest.tescases;
import oopsExamples.arithmetic.Arithmetic; //import src folder arithmetic to test the functionality of that module/feature/methods

public class ArithmeticTest {
	
	public static void TC1(){
		
		//Test case for additon of two double numbers
		Arithmetic amath = new Arithmetic();
		double value = amath.add(10.0, 20.0);
		if(value==30.00){
			System.out.println("Pass");
		}
		else{
				System.out.println("Fail");
		}	
	}
}
