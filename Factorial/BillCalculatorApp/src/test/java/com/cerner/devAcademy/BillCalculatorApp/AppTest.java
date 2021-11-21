package com.cerner.devAcademy.BillCalculatorApp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

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
    public void happyFlow() throws FileNotFoundException
    {
        App object = mock(App.class);
        String[] args = null;
		final InputStream original = System.in;
	    final FileInputStream fips = new FileInputStream(new File("C:/Users/Anuj Singh/Desktop/DevAcademy/Factorial/BillCalculatorApp/src/test/java/com/cerner/devAcademy/BillCalculatorApp/input.txt"));
	    System.setIn(fips);
	    assertTrue(2900.0 == object.main(args)); 
	    System.setIn(original);
	    System.exit(0);
        
    }
    
    @Test
    public void timeStampCheck() {
    	Customer object = mock(Customer.class);
    	when(object.timer()).thenReturn(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM")));
    	assertEquals(object.timer(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM")));
    }
}
