package com.cerner.devAcademy.CodeCampOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.apache.log4j.Logger;

public class PairFinder {
	
	static final Logger logger = Logger.getLogger(App.class);
	
	public HashSet<Integer> pairs(ArrayList<Integer> A, int sum) {
		
		logger.info("inside pairs");
		HashSet<Integer> set = new HashSet<Integer>(A);
		HashSet<Integer> answer = new HashSet<Integer>();		
		for(int i = 0; i<A.size();i++) {
			int temp = sum - A.get(i);
			if(set.contains(temp)) {
				logger.info("Pair: ("+ A.get(i) +"," + temp +" )");
				answer.add(A.get(i));
				answer.add(temp);
			}
		}
		return answer;
		
	}

}
