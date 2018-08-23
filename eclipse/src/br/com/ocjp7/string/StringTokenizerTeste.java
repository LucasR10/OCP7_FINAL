package br.com.ocjp7.string;

import java.util.StringTokenizer;

public class StringTokenizerTeste {

	public static void main(String[] args) {
		
		/** Constructor : 
		 *  StringTokenizer(String str), 
		 *  StringTokenizer(String str, String delim), 
		 *  StringTokenizer(String str, String delim, boolean returnDelims)
		 *  */
		
		/**     Tipo       +  Método e Descrição
		 * --------------------------------------------------------------------------------------------------------------------------------------------------
				int	              countTokens() - Calcula o número de vezes que o nextTokenmétodo deste tokenizer pode ser chamado antes de gerar uma exceção.
				boolean	          hasMoreElements() -  Retorna o mesmo valor que o hasMoreTokens método.
				boolean	          hasMoreTokens() -  Testa se há mais tokens disponíveis a partir dessa string do tokenizer.
				Object	          nextElement() - Retorna o mesmo valor que o nextTokenmétodo, exceto que seu valor de retorno declarado é em Object de String.
				String	          nextToken() -  Retorna o próximo token desse tokenizer de string.
				String	          nextToken(String delim) - Retorna o próximo token nesta string do tokenizer da string.
		**/
		
		boolean returnDelim = false;
		String delimitador = " ";
		
		String texto = "In general, a regex search runs from: left to right, and once a source's  character ";
		StringTokenizer st0 = new StringTokenizer( texto );
		
		while( st0.hasMoreTokens()  ) 
			System.out.println("Valor :" + st0.nextToken(":") );
		
		while( st0.hasMoreTokens()  ) 
			System.out.println("Valor :" + st0.nextToken() );

		int countTokens = st0.countTokens();// retorna quabtidade de token; 
		System.out.println(" countTokens :" + countTokens );
		
		
		
		//while( st0.nextT ) System.out.println(" valor :" + st0.nextToken() );
		
		StringTokenizer st1 = new StringTokenizer(texto ,delimitador);
		StringTokenizer st2 = new StringTokenizer(texto ,delimitador , returnDelim);
		

	}

}
