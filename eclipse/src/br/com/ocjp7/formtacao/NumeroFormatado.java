package br.com.ocjp7.formtacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumeroFormatado {

	public static void main(String[] args) {
		
		float f1 = 123.4567f;
		
		NumberFormat nf []  = new  NumberFormat [4] ;
		
	nf [0] = NumberFormat.getInstance();
	nf [1]  = NumberFormat.getInstance( new Locale("fr"));
    nf [2] = NumberFormat.getCurrencyInstance();
    nf [3] = NumberFormat.getCurrencyInstance( new Locale("fr"));
    
	    for (NumberFormat o : nf) {
			System.out.println( o.format(f1) + "Digites :" +  o.getMaximumIntegerDigits() );
			o.setMaximumFractionDigits(4);
			System.out.println( o.format(f1) + "Digites :" +  o.getMaximumIntegerDigits() );
		}

	}

}
