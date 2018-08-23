package br.com.ocjp7.formtacao;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormatacaoDataString {

	public static void main(String[] args) throws ParseException {
		
		DataFormata  df = new DataFormata();
		//df.add();
		//df.addNamber();
		//df.subData();
		
		Date data  = new Date(100000000000L);
		
		data.toString();
		System.out.println("Data :" + data.toString() );
		
		DateFormat fmt = DateFormat.getDateInstance();
		//String rt = fmt.format( data.toString() );
		//System.out.println("Data :" + rt );
		
		Locale it = new Locale("it", "IT");
		Locale pt = new Locale("pt");
		Locale ptBR = new Locale("pt", "BR");
		Locale hi = new Locale("hi", "IN");
		Locale ja = new Locale("ja");
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2018, 01, 01); 
		
		Date data1 =  c1.getTime();
		DateFormat dfIt = DateFormat.getDateInstance(DateFormat.FULL, it );
		System.out.println("IT :" + dfIt.format(data1) );
		
		
		DateFormat ptD = DateFormat.getDateInstance(DateFormat.FULL, pt );
		System.out.println("PT :" + ptD.format(data1) );
		
		DateFormat pt_BR = DateFormat.getDateInstance(DateFormat.FULL, ptBR );
		System.out.println("pt_B :" + pt_BR.format(data1) );
		
		
		DateFormat hiD = DateFormat.getDateInstance(DateFormat.FULL, hi );
		System.out.println("hiD :" + hiD.format(data1) );
		
		
		DateFormat jaD = DateFormat.getDateInstance(DateFormat.FULL, ja );
		System.out.println("JAD :" + jaD.format(data1) );
	}

}

class DataFormata {
	
	Calendar c = Calendar.getInstance();
	Calendar c2 = Calendar.getInstance(  Locale.getDefault() );
	
	
	void subData() {
		c.add( Calendar.HOUR, -1);
		System.out.println( c.getTime() );
		
		c.add( Calendar.YEAR, -2);
		System.out.println( c.getTime() );
		
		c.add( Calendar.DAY_OF_WEEK, -2);
		System.out.println( c.getTime() );
	}
	
	void add() {
		
	Date data = new Date();
	System.out.println("Data :" + data.toString() );
	
	c.add(2, 20);
	DateFormat df = DateFormat.getDateInstance( DateFormat.SHORT );
	df.format( c.getTime() );
	System.out.println("Formatação :" + df.format( c.getTime() ) );
	c.roll(5,20 );
	System.out.println("Formatação :" + df.format( c.getTime() ) );
	}
	
	void addNamber() {
		NumberFormat.getInstance( new Locale("pt", "BR") );
		NumberFormat.getCurrencyInstance();
		NumberFormat.getCurrencyInstance( new Locale("us", "US"));
		NumberFormat nf = NumberFormat.getInstance();
		nf.format(12323L);
	}
	
}