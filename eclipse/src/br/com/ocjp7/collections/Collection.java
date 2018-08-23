package br.com.ocjp7.collections;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;



public class Collection {
	
 
	//Collection -> List -> LinkedList | ArrayList | Vector
	
	//Collection -> set -> HashSet -> LinkedHashSet -> TreeSet
	
	 // Map -> Hashtable  Properties extends Hashtable , HashMap
    
	 
	 public static void main(String[] args) {
		
		
		 Listas.lista();
		 Setes.setes();
	}
}



class  Listas{
	
	
	public static void lista() {
		
		
		    List lista = new ArrayList();
		    lista.add("Canoel");
		    lista.add("Doaquim");
		    lista.add("Faria");
		    lista.add("Manoel1");
		    lista.add("Joaquim2");
		    lista.add("Aaria5");
		    lista.add("Panoel");
		    lista.add("Zoaquim");
		    lista.add("Aaria");
		    
		    
		    List l2 = new LinkedList<>();
		    l2.addAll(lista);
		    System.out.println(lista);
		     Collections.sort(lista);
		     System.out.println(lista);
		    System.out.println(l2);
		    
		    List l3 = new Vector();
		    lista.subList(0, 3).clear();
		    System.out.println( lista.subList(0, 3));
	}
	
}	
	
class Setes{
	

	public static void setes() {
		 Set m1 = new HashSet();
		    m1.add("Manoel");
		    m1.add("Manoel");
		    m1.add("Joaquim");
		    m1.add("Maria");
		    
		    System.out.println(m1);
		    
		 Set m2 = new LinkedHashSet();
		 Set m3 = new TreeSet();
	}
		
}
	class Mapas{
		
		public static void  mapas(){
			Map<String, String> m = new Hashtable<>();
			m.put("J", "José");
			m.put("M", "Miguel");
		    m.put("B", "Bruno");
			m.put("F", "Fernando");
			m.put("A", "Alex");
			
		   
		}
}
		

	
