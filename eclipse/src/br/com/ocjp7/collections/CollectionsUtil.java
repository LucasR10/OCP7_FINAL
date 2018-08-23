package br.com.ocjp7.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class CollectionsUtil {

	public static void main(String[] args) {
		
		//List
		
		List<String> novo = new ArrayList<>();
		novo.add("c1");
		novo.add("c2");
		novo.add("c3");
		novo.add("c4");
		
		List<String> frutas = new ArrayList<>();
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.add("Abacaxi");
        frutas.add("Manga");
        frutas.add("Peira");
		
        System.out.println();
        
        Collections.sort(frutas);
		System.out.println(frutas);
		
	    Collections.reverse(frutas);
	    System.out.println(frutas);
	    
	    Collections.fill(frutas,"Teste Fill");
	    System.out.println(frutas);
	    
	    int index = Collections.binarySearch(frutas ,"Uva");
	    System.out.println(index);
	    
	    Collections.addAll(frutas, "sdsd");
	    System.out.println(frutas);
	    
	    
	    ///
	    Vector<Integer> valores = new Vector<>();
	    valores.add(10);
	    valores.add(11);
	    valores.add(12);
	    valores.add(13);
	    valores.add(14);
	    System.out.println(valores);
	    
	    System.err.println( valores.firstElement() );
	    System.err.println( valores.lastElement() );
	    
	    List<Integer> lList = new LinkedList<>();
	    lList.add(10 + 2);
	    lList.add(11 + 3);
	    lList.add(12 + 5 );
	    lList.add(13 +  6);
	    lList.add(14 +  7);
	    
	  
	    
	    System.out.println(lList);
	    
	    System.out.println("--------------------------------------------------------------------------------");
	    //Sets
		Set<String> p = new HashSet<>();
		p.add("A");
		p.add("D");
		p.add("B"); 
		p.add("F");
		p.add("C");
		p.add("G");
		
		System.out.println(p);
		
	}

}
