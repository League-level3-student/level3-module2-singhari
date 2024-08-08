package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1+" x "+num2+" = "+(num1*num2);
    }
    public static Boolean isPrime(int n) {
    	boolean prime = true;
    	for(int i = 2; i< n; i++) {
    		if(n%i ==0) {
    			prime = false;
    		}
    	}
    	
    	
    	
    	return prime;
    }
    
    public static Boolean isSquare(int n) {
    	boolean square = false;
    	String check = Math.pow(n, 0.5) + "";
    	if(check.endsWith(".0")) {
    		square = true;
    	}
    	
    	return square;
    }
    
    public static Boolean isCube(int n) {
    	boolean cube = false;
    	for(int i = 0; i <= n; i++) {
    		if(Math.pow(i, 3) == n) {
    			cube = true;
    		}
    	}
  	
    	return cube;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	int index = 0;
    	for(int i = 0; i<eggs.size(); i++) {
    		if(eggs.get(i).equals("cracked")) {
    			index = i;
    			i = eggs.size();
    		}
    	}
    	
        return index;
    }
    public static int countPearls(List<Boolean> oysters) {
    	int count = 0;
    	for(int i = 0; i<oysters.size(); i++) {
    		if(oysters.get(i)==true) {
    			count++;
    		}
    	}
    	
    	return count;
    }
    public static double findTallest(List<Double> peeps) {
    	double tallest = 0.0;
    	for(int i=0; i<peeps.size(); i++) {
    		if(peeps.get(i) > tallest) {
    			tallest = peeps.get(i);
    		}
    	}
    	
    	return tallest;
    }
    
}
