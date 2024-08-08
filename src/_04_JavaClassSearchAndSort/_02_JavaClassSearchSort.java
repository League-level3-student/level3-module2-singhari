package _04_JavaClassSearchAndSort;

import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
    	 for (int i = 0; i < arr.length; i++) {
             
             // This for loop puts one value in the correct position
             for (int k = 0; k < arr.length - 1; k++) {
                 
                 // If the current element is bigger than the next...
                 if( arr[k] > arr[ k+1 ] ) {
                     
                     // Swap elements at k and k+1
                     int temp = arr[k];
                     arr[k] = arr[ k+1 ];
                     arr[ k+1 ] = temp;
                 }
             }
         }
    	
    	
        return null;
    }
    
    public static List<Double> listSort(List<Double> list){
    	Double[] arr = (Double[]) list.toArray();
   	 for (int i = 0; i < arr.length; i++) {
             
             // This for loop puts one value in the correct position
             for (int k = 0; k < arr.length - 1; k++) {
                 
                 // If the current element is bigger than the next...
                 if( arr[k] > arr[ k+1 ] ) {
                     
                     // Swap elements at k and k+1
                     double temp = arr[k];
                     arr[k] = arr[ k+1 ];
                     arr[ k+1 ] = temp;
                 }
             }
         }
    	
    	
    	
        return null;
    }

    public static Boolean arraySearch(char[] arr, char key) {
        boolean present = false;
        for(int i = 0; i< arr.length; i++) {
        	if(arr[i] == key) {
        		present = true;
        	}
        }
        
        
        
        return present;
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
    	 boolean present = false;
    	 for(int i = 0; i< list.size(); i++) {
    		 if(list.get(i) == key)
    			 present = true;
    	 }
    	 
    	 
    	 
        return present;
    }
}
