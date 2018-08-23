package br.com.ocjp7.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSeTEMapSet {

	public static void main(String[] args) {

		//TreeSet and TreeMaps introduzidas no java 6
		
		TreeSet<Integer> tres = new TreeSet<Integer>();
		tres.add(3);
		tres.add(2);
		tres.add(1);
		tres.add(6);
		//tres.add(69);
		tres.add(null);
		System.out.println( tres );
		System.out.println( tres.ceiling(2) );
		System.out.println( tres.higher(2) );
		System.out.println( tres.first() );
		
		
		TreeMap  tm= new TreeMap();
		//tm.put(null, null);
		int i = 20;
		tm.put("k", i);
		
		//ordem natual
		SortedMap <String, Double> grades = new TreeMap <> (); 
		grades.put ("B", 2.67); 
		grades.put ("A", 4.0); 
		grades.put ("F", 0.0); 
		grades.put ("C", 2.0); 
		grades.put ("C-", 2.0); 
		grades.put ("B", 3.33); 
		
		System.out.println( grades );
		
		List o = new ArrayList<Integer>();
		//genericos teste
		ArrayList<String> a;
	//	add( a ); não compila de jeito maniera
		
		//polimofismo e suportando com Arrays
		
		String ss [] = new String [11];
		addA(ss);//funcjona coma rrys mas, não funcioan comarrys list
		
		//lista exemplo de polimifsimo
		List<A> lista = new ArrayList<A>(); //Como o arrys inical foi delcarado com tipo  A mesmo adicionando sub tipos vai funcionar.
		lista.add( new A1() );
		lista.add( new A1() );
		
		exemploDeMetodoQueAceitaLista(lista);//ok aceita subitpos 
		
		List<A1> subtipo = new ArrayList<A1>();
		//add(subtipo);// não vai compilar por a lista esta esperando um tipo A e não sub tipos;
	}
	
	public static void add (List<A> obj ) {// não pode pasa uma arrayListDe String
	  obj.add( new A1() );	//pode perfeitamente
	}
	
	public static void addA( Object [] obj ) {// não pode pasa uma arrayListDe String
		  //obj.add( new String("") );	//pode
    }
	
	public static void exemploDeMetodoQueAceitaLista( List<A> obj ) {// não pode pasa uma arrayListDe String
		  //obj.add( new String("") );	//pode
  }

	
	
}

class A{}

class A1 extends A{}

class A2 extends A{}


