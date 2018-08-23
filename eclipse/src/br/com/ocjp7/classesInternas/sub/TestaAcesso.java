package br.com.ocjp7.classesInternas.sub;

import br.com.ocjp7.classesInternas.TestaClasseInterna;
import br.com.ocjp7.classesInternas.TestaClasseInterna.MyClase;

public class TestaAcesso {
	/**
	 * Para acessar uma clase interna em outro pacote e necessario 
	 * que essa clase esteja com modificador de acessor public para
	 * classe e construtor: public MyClass{ MyClass(){} } 
	 * Tem que fazer importanção completa para a calsse.
	 * */
	
	public static void main(String[] args) {
	
        TestaClasseInterna referencia = new TestaClasseInterna();
        MyClase mc = referencia.new MyClase();      
        
        new TestaClasseInterna().new MyClase(); //OU
     
        
	}

}
