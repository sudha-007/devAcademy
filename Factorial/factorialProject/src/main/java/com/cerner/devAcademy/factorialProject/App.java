package com.cerner.devAcademy.factorialProject;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author Anuj Singh
 *
 */
public class App 
{
	static final Logger logger = Logger.getLogger(App.class);
	
	
    public static void main( String[] args ){	
    	Scanner input = new Scanner(System.in);
    	BasicConfigurator.configure();
    	Factorial object = new Factorial();
    	int answer = -1;
    	
        
        logger.info("Input Number:");
        int number=input.nextInt();
        answer = object.countFactorial(number);
        logger.info("operation Done!");
        logger.info(answer);
        input.close();
    }
}
