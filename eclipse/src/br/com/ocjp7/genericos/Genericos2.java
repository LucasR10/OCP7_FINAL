package br.com.ocjp7.genericos;

public class Genericos2 {

	
	public static void main(String[] args) {
		

	}

}


class Generico<E>{
	
	private E e;
	
	public Generico() throws InstantiationException, IllegalAccessException {
		//this.e = new E();não compila
		this.e = (E) e.getClass().newInstance();///add cast
	}
}