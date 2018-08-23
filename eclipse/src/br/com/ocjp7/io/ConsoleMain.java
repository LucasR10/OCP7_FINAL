package br.com.ocjp7.io;

import java.io.Console;

public class ConsoleMain {

	public static void main(String[] args) {
		
		Console c =   System.console();
		//c.format("%s","000");
		
		String valor = c.readLine( "Digite um valor !");//poll de string
		System.out.println(valor);
		
		c.readPassword("");//read passwor [] array de 
	}

}
