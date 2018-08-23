package br.com.ocjp7.design;

public class PolimofismoClass {

	public static void main(String[] args) {
		Classe_1 c1 =  new Classe_2();
		c1.print();
		System.out.println(" " + c1.valor);
	}

}

class Classe_1{
	
	int valor = 200;
	
	void print(){
		System.out.println("< - > " + valor);
	}
}

class Classe_2 extends Classe_1{
	
	int valor = 100;
	
	void print(){
		System.out.println("! - !" + valor);
	}
}




