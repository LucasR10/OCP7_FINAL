package br.com.ocjp7.assertions;

import java.util.ArrayList;

public class AssertTest {
 // abilitar assetion : -ea in vm ou java -ea -da:com.geeksanonymous...

	 public static void main(String[] args) {
		
		 /* URL: https://stackoverflow.com/questions/11415160/how-to-enable-the-java-keyword-assert-in-eclipse-program-wise
		  * Dois tipos de assertion : simples, muito simples:
		  * Muito Simples: assert Expression
		  * Simples:  assert Expression1 : Expression2 ;
		  *    java -enableassertions
		   *        java -ea
					Enable assertions.
					
				java -disableassertions
					java -da
					Disable assertions (the default behavior).
					
					java -ea:com.foo.Bar - Enable assertions in class com.foo.Bar.
					java -ea:com.foo... - Enable assertions in package com.foo and any of its subpackages.
					java -ea -dsa Enable - assertions in general, but disable assertions in system classes.
					java -ea -da:com.foo... - Enable assertions in general, but disable assertion
		  * */
		 
		 
		 //muito simple
		 assert false : new ArrayList<>().add("");  //AssertionError.
		 System.out.println("....");
		 
		 //simples
		 assert 1 > 4 : " não é maior do que 1  ";
		 methodA(-1);
		 
		 // assert validas
		 int x = 1;
		 boolean b = true;
		 
		 assert(0 == 1);
		 assert(10 != 20);
		 assert true;
		 assert(x == 1) : x;
		 assert(x == 1) : 1;//ou um metodo
		// assert(x == 1) : new ValidAssert();
		 
		 //assert invalidas
		 //assert(x = 1); // não saõ booleanas
		// assert(x);
		 //assert 0;
		 //assert(x == 1) : ; // nehum desse retona um valor
		 //assert(x == 1) : noReturn();
		 //assert(x == 1) : ValidAssert va;
	}
	 
	 private static void methodA(int num) {
		 assert (num>=0); // throws an AssertionError
		 System.out.println("num -> " + num);
	 }
	 
	 private static void doStuff1(int x , int y) {
		 assert (y > x);
		 // more code assuming y is greater than x
	}
	 
	 private static void doStuff2( int x , int y ) {
		 assert (y > x): "y is " + y + " x is " + x;
		 // more code assuming y is greater than x
	}
}

