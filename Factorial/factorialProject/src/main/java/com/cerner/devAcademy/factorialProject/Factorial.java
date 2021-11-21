package com.cerner.devAcademy.factorialProject;

import org.apache.log4j.Logger;

public class Factorial {
	static final Logger logger = Logger.getLogger(Factorial.class);
	public int countFactorial(int input) {
		int answer=1;
		
		if(input<0 || input>12) {
			answer = -1;
			logger.info("Invalid Input has been provided");
			logger.error("Exit Status: 1");
			throw new ArithmeticException("Entered no is not valid here");
		}
		else if(input == 0 || input == 1){
			assert true;
		}
		else {
			
			while(input>=1) {
				answer *= input;
				input--;
			}
			
		}
		
		return answer;
	}
}
