package br.com.ocjp7.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DequeTesta {

	public static void main(String[] args) {
     new d().def();  
	}

}


class d{
	
   	void def(){
	   
   		Deque<Double> grades = new ArrayDeque<>();
	    grades.addAll(Arrays.asList(new Double[] {1.8, 2.1, 3.8, 4.0, 2.1}));
	    
	     System.out.println( grades );
	  //  System.out.print( grades.pop());
	    System.out.print( grades.poll());
	    //System.out.print( grades.peek());
	    //System.out.print( grades.remove());
	    //System.out.print(grades.pollLast());
	    //System.out.print(grades.poll());
	}
}
