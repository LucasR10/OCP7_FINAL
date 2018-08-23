package br.com.ocjp7.formtacao;

import java.util.Scanner;

public class ScannerTeste {

	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
//		 String str ;
//		 do {
//			 
//			 str =  sc.findInLine("difite um valoee" );
//			 System.out.println("Linha :" + str);
//		 }while( str  != null );
		 
		  String result  = String.format("%b", "");// boolean.
		  System.out.println("Resultado - " + result );
		  
		  String result1  = String.format("%c", 23);// char.
		  System.out.println("Resultado - " + result );
		  
		  String result2  = String.format("%d", 23244242);// d
		  System.out.println("Resultado - " + result );
		  
		  String result3  = String.format("%f", 23232323F);// flutuante
		  System.out.println("Resultado - " + result );
		  
		  String strig  = String.format("%s-", "asasa");// flutuante
		  System.out.println("Resultado - " + result );
		  ScannerTeste sct = new ScannerTeste();
		  
		  Nova s = new ScannerTeste().new Nova();
		  ScannerTeste.Nova1 n = new ScannerTeste.Nova1(); 
		 
	}
	 
	  class Nova{
		  
	  }
	  
static class Nova1{
		  
	  }
	
}
