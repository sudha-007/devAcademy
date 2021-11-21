package com.cerner.devAcademy.CodeCampOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.sun.tools.javac.util.List;



/**
 * Hello world!
 * @author Anuj Singh
 *
 */
public class App 
{
	static final Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {	
    	logger.info("--Inside Main--");
    	BasicConfigurator.configure();
        PairFinder object = new PairFinder();
        HashSet<Integer> answer = new HashSet<Integer>();
        answer = null;
        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(12,36,22,19,63));
        int sum = 31;
        
        answer = object.pairs(arr, sum);
        System.out.println(answer);
        logger.info(answer);
        
    }
}
