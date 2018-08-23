package br.com.ocjp7.string;

import java.util.StringTokenizer;

public class StringTokenizerTeste {

	public static void main(String[] args) {
		
		/** Constructor : 
		 *  StringTokenizer(String str), 
		 *  StringTokenizer(String str, String delim), 
		 *  StringTokenizer(String str, String delim, boolean returnDelims)
		 *  */
		
		/**     Tipo       +  M�todo e Descri��o
		 * --------------------------------------------------------------------------------------------------------------------------------------------------
				int	              countTokens() - Calcula o n�mero de vezes que o nextTokenm�todo deste tokenizer pode ser chamado antes de gerar uma exce��o.
				boolean	          hasMoreElements() -  Retorna o mesmo valor que o hasMoreTokens m�todo.
				boolean	          hasMoreTokens() -  Testa se h� mais tokens dispon�veis a partir dessa string do tokenizer.
				Object	          nextElement() - Retorna o mesmo valor que o nextTokenm�todo, exceto que seu valor de retorno declarado � em Object de String.
				String	          nextToken() -  Retorna o pr�ximo token desse tokenizer de string.
				String	          nextToken(String delim) - Retorna o pr�ximo token nesta string do tokenizer da string.
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
