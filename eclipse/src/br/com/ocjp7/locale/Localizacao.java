package br.com.ocjp7.locale;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Locale.Builder;
import java.util.ResourceBundle;

public class Localizacao {

	public static void main(String[] args) {
		
		Locale l = new Locale("BR");
		new Locale.Builder().setLanguageTag("").setScript("");
		Locale.forLanguageTag("pt");
		ResourceBundle bd = ResourceBundle.getBundle("us");
		
		//ResourceBundle myResources =
			      //ResourceBundle.getBundle ("MyResources", null);
		
		 Locale.getDefault().getScript(); 
		
		  /** Constructors **/
 		 // 1- new Locale(langaue, cauntry);
		 // 2- new Locale(langaue, cauntry);
		 // 3- new Locale(langaue, cauntry, variante);
		
		 /** Uasando  Locale.Builder você pode construie um objeto Locale. */
		 Locale myLocale = new Locale.Builder().build(); //Retorna uma instancia de Locale criada aparti de de builder.
		 Builder b1 = new Locale.Builder(); //obtem Builder();
		 
		 Locale aLocale = new Builder().setLanguage("sr").setScript("Latn").setRegion("RS")/*Constroi o objeto*/.build();
		 
		 /** Factory Methods */
		 Locale.forLanguageTag("ar-aao").getLanguage(); // returns "aao"
	     Locale.forLanguageTag("en-abc-def-us").toString(); // returns "abc_US
	     
	     
	     
	     //Locale Constants
	      //Locale.US;
	     
	    // Cada um desses métodos tem duas variantes; um com um local explícito e outro sem; o último usa a localidade padrão:
	         NumberFormat.getInstance (myLocale) ;
	         NumberFormat.getCurrencyInstance (myLocale) ;
	         NumberFormat.getPercentInstance (myLocale);
	         //lingua/Pais
	        Locale lc = new Locale("pt","PT");//portugal
	        Locale lc2 = new Locale("pt","BR");//Brasil
	        
	        Calendar c = Calendar.getInstance();
	        c.set(2018, 01, 01, 14 , 20);
	        c.set(2018, 01, 01);
	     

	}

}
