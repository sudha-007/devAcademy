package com.cerner.devAcademy.BillCalculatorApp;



import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;



/**
 * Hello world!
 *@author Anuj Singh
 */
public class App 
{
	static final Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args ){
    	
    	BasicConfigurator.configure();
    	Customer object = new Customer();
    	logger.info(object.calculateBill());
    	    
    }
}
