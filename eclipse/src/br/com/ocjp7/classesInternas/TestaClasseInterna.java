package br.com.ocjp7.classesInternas;

public class TestaClasseInterna {

	public static void main(String[] args) {
        
      TestaClasseInterna testaClasseInterna = new TestaClasseInterna();
      MyClase ms = testaClasseInterna.new MyClase();
	  
      MyClase ms2 = new TestaClasseInterna().new MyClase();
	
	}
   
	  //private , protectd, Package - acesso soa mesmo pacote
	  public class MyClase{
		  //private, protectd, package - acesso so mesmo pacote.
		  public MyClase() {
			System.out.println(" Hello word !!");
			System.out.println(" Classe Interna:"+ this.getClass().getName());
			System.out.println(" Classe Externa :" +TestaClasseInterna.this.getClass().getName());
		  }
	  }
}
