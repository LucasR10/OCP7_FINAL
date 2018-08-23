package br.com.ocjp7.assertions;

public class Enum {

	public static void main(String[] args) {
		
          Alfabeto a = Alfabeto.A;
          	System.out.println( a.name() );
          	System.out.println( a.ordinal() );
          	System.out.println( Alfabeto.valueOf("C").getV() );
          	System.out.println( Alfabeto.values().toString() );
          	System.out.println( Alfabeto.C.toString() );
          	System.out.println( Alfabeto.C.toString() );
          	System.out.println( Alfabeto.C.equals(a) );
          	System.out.println( a.compareTo(Alfabeto.D) );
          	
         
	}

}

enum Alfabeto{
	
	A("a1"),B("b1"),C("c1"),D("d1"),F("f1"),G("g1");
	
	private String v ;
	
	private Alfabeto(String value) {
		this.v = value ;
	}
	
	
	public String getV() {
		return v;
	}
	
}