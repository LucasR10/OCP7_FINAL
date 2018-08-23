package br.com.ocjp7.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Doque {

	
	public static void main(String[] args) {
		
		  Deque <Double> grades = new ArrayDeque <> (); 
		  grades.addAll ( Arrays.asList (new Double [] {1.8, 2.1, 3.8, 4.0, 2.1}) ); 
		
		  System.err.println(grades);
		  grades.push(100.00);//coloca em primeiro
		 
		  System.err.println(grades);
		  System.err.println( grades.peek() );//puxa o primeiro
		  System.out.println(grades);
		 
		  System.err.println( grades.pop() );
		  System.out.println(grades);
		  
		  System.err.println( grades.element() );
		  System.out.println(grades);
		  
		  grades.pollLast();
		  System.out.println(grades);
		  
		  grades.pollFirst();
		  System.out.println(grades);
		  
		  grades.poll();
		  System.out.println(grades);
	}
}
