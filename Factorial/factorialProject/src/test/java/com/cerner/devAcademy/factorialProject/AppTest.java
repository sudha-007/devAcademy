package com.cerner.devAcademy.factorialProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit test for simple App.
 * @author Anuj Singh
 */

public class AppTest 
{ 
    /**
     * Rigorous Test :-)
     */
    @Test
    public void happyFlowTest() {
    	Factorial object = new Factorial();
    	assertEquals(120, object.countFactorial(5));
    	assertEquals(3628800,object.countFactorial(10));
    	assertEquals(1, object.countFactorial(0));
    	assertEquals(1, object.countFactorial(1));

    }
    
    /**
     * @author Anuj Singh
     *Juni4
     *will be using expected property of @Test
     */
    
    @Test(expected = ArithmeticException.class)
    public void execptionCheck() {
    	Factorial object = new Factorial();
    	object.countFactorial(13);
    }
    
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    
    @Test
    public void execptionCheckWithRule() {
    	exceptionRule.expect(ArithmeticException.class);
    	exceptionRule.expectMessage("Entered no is not valid here");
    	Factorial object = new Factorial();
    	object.countFactorial(-20); 
    }
    
    @Test
	public void testingMainMethod() throws FileNotFoundException{
		App object = new App();
		String[] args = null;
		final InputStream original = System.in;
	    final FileInputStream fips = new FileInputStream(new File("C:/Users/Anuj Singh/Desktop/DevAcademy/Factorial/factorialProject/src/test/java/com/cerner/devAcademy/factorialProject/input.txt"));
	    System.setIn(fips);
	    object.main(args);
	    System.setIn(original);
	}
    
}
