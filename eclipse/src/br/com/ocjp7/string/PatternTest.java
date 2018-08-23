package br.com.ocjp7.string;

import java.util.regex.Pattern;

public class PatternTest {
	
	
	public static void main(String[] args) {
		
		String texto = "In general a regex search runs from left to right and once a sources  character 1";
		// Pattern p = Pattern.compile("[0-9]" );
		 
		 Pattern p = Pattern.compile("[0-9]");
		 
		 System.out.println(p.matches("[0-9]", texto));
		 


	}

}
