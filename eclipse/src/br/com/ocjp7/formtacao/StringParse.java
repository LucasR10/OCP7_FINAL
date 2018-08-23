package br.com.ocjp7.formtacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParse {

	public static void main(String[] args) {

		java.util.regex.Pattern regex ;
		java.util.regex.Matcher matcher ;
		java.util.Scanner scaneer ;
		
		String padrao = "ba";
		String fonteD = "abaaba";
		
		regex = Pattern.compile(padrao);
		Matcher mc = regex.matcher(fonteD);
		
		
		
		while ( mc.find() ) {// retorn a posição
           System.out.println( mc.start() + " find value !" );			
		}
		
		Pattern p1 = Pattern.compile("[0-2]"); 
		Matcher mN1 = p1.matcher("1 a 122 34 b");
		
		while ( mN1.find() ) {
			System.err.println( mN1.start() +" " + mN1.group() );
		}
		
		Pattern p = Pattern.compile("\\d+"); 
		Matcher mN = p.matcher("1 a12 234b");
		
		while ( mN.find() ) {
			System.err.println( mN.start() +" " + mN.group() );
		}
		
		System.err.println("----------------------------------------" );
		
		regex("123AAddds", "\\d");
		
		regex("123AAddds", "[0-1]");
		
		
		
		
	}

	
	
	static void regex(String dados, String regexC) {
		
		Pattern regex = Pattern.compile(regexC);
		Matcher retorno = regex.matcher(dados);
		
		
		while ( retorno.find() ) {
			
			System.out.println(" end() " + retorno.end()  );
			System.out.println(" start() " + retorno.start()  );
			System.out.println(" group() " + retorno.group()  );
			System.out.println(" regionStart() " + retorno.regionStart()  );
			System.out.println(" retorno.pattern() " + retorno.pattern()  );
			System.out.println(" retorno.matches() " + retorno.matches()  );
			
			//System.err.println( dados.charAt(retorno.start()));
		}
		
	}
	
	
	
	/**
	 * 0[xX]([0-9a-fA-F]
	 * Encontr um conjunto de carracter no qual o primeiro caracter seja "0" o segundo caracter seja "x" ou  "X" e
	 *  o terceiro seja um digito entre "0" e "9" ou uma letra de "a" ate "f" ou letra de maiuscula de "A" ate "F".
	 * 
	 * */
	
	
	
	
	
	
	
}
