package test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import main.java.com.arithmetic.Arithmetic;



public class junitTest {
	
	@Test
	public void TC1(){
		//Test case for additon of two double numbers
		Arithmetic amath = new Arithmetic();
		double value = amath.add(10.0, 20.0);
		assertEquals(30, value,0);
	}
	
	@Test
	public void TC2(){
		//Test case for additon of two int numbers
		Arithmetic amath = new Arithmetic();
		double value = amath.add(10, 20);
		assertEquals(30, value,0);
	}
	
	@Test
	public void TC3(){
		//Test case for additon of two non numbers
		Arithmetic amath = new Arithmetic();
		double value = amath.add(-1, -2);
		assertEquals(-3, value,0);
	}
}
