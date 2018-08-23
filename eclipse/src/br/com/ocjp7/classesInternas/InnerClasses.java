package br.com.ocjp7.classesInternas;

public class InnerClasses {
	public String x;
	
	public static void main(String[] args) {
     //instanciando fora da classe
		
		InnerClasses instanciaExterna = new InnerClasses();
		MyInner myInner2 = instanciaExterna.new MyInner();
		// 1opc
		InnerClasses.MyInner myInner = new InnerClasses().new MyInner();
		
	}
	//Intancia normalmente dentro da class que esta declarada.
	void instanciandoClasseInterna(){ 
		MyInner m = new MyInner(); 
	}
	
	class MyInner{
		public void seeOuter(){
			System.out.println(" Outer x is " + x);
		}
}


}


class ClasseInternaRegular{
	
}
