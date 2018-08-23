package br.com.ocjp7.design;

public class DesignClass {

  public static void main(String[] args) {

	   ABCD a1= new ABCD();
	  ( (ABCD)a1 ).p();
	   ABCD a2 = new A2();
	  
}
	
}

class ABCD{
	void p(){}
}
class A1 extends ABCD{}
class A2 extends ABCD {}