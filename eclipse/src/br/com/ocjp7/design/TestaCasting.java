package br.com.ocjp7.design;

public class TestaCasting {

	public static void main(String[] args) {
		
      A ab  = new ABA();
      ( (ABA)ab ).pt();;
      
      
        ab = new AB();///ab
      ( (ABA)ab ).pt();;
      ab.toString();
		
	}

}

class ABA extends AB{}

class A{ void pt(){} }

class AB extends A{}

class AC extends A{}

class AD extends A{}