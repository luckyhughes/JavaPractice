package test.AutomationTest.tescases;
import org.testng.Assert;
import org.testng.annotations.Test;
import oopsExamples.arithmetic.Arithmetic;

public class Testng {

	
	@Test()
	public void TC1() {
		Arithmetic amath = new Arithmetic();
		double value = amath.add(10.0, 20.0);
		Assert.assertEquals(30.0, value);
	}

}
