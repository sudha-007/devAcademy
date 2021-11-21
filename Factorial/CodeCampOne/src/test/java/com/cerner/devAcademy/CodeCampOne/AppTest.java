package com.cerner.devAcademy.CodeCampOne;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;

import com.sun.tools.javac.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	int sum = 31;
        PairFinder object = new PairFinder();
        HashSet<Integer> ans = new HashSet<Integer>();
        ans.add(12);
        ans.add(19);
        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(12,36,22,19,63));
        assertEquals(ans, object.pairs(arr, sum));
    }
    
    @Test
    public void happyFlowCheckTwo() {
    	int sum = 31;
        PairFinder object = new PairFinder();
        HashSet<Integer> ans = new HashSet<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(12,36,22,15,63));
        assertEquals(ans, object.pairs(arr, sum));
    }
}
