package br.com.ocjp7.classesInternas;

public class ClassesDentroDeMetoso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	void put(){
		int x;
		class MyMethod{
			//não pode acessar varivale do metodo que seja declarada antes.
			final int x = 0; //ok funciona se final 
			void putAll(){
				System.out.println(" Execute Pu All " + x );
			}
			
		}
		
	}
}
