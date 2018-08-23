package br.com.ocjp7.collections;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Lista {

	public static void main(String[] args) {
	
		List<Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(1);
		l1.add(3);
		l1.add(4);
		l1.add(2);
		List<Integer> dist = new ArrayList<>();
		dist.add(1);
		dist.add(2);
		dist.add(31);
		
		
		System.out.println( dist.get(1));
		
		
		System.out.println(l1);
		Collections.sort(l1);
		
		Collections.sort(l1 , new Ordenador());
		
		System.out.println(l1);//ordenado
		int i = Collections.binarySearch(l1, 2);
		System.out.println(i);
		
		//barlha as coleções
		Collections.shuffle(l1);
		System.out.println(l1);
		
		//Collections.copy(dist, l1);
		System.out.println(dist);
		
		Collections.reverse(l1);
		System.out.println(l1);
		
		boolean res = Collections.disjoint(dist, l1);
		System.out.println(res);
		
		System.out.println(Collections.max(l1));// maior valor
		
		System.out.println( Collections.disjoint(dist, l1) );//re torna true se a slista não tem valores iguas
		
		Collections.fill(l1, 25);;
		System.out.println(l1);
		
		//
	    Deque<Integer> d = new ArrayDeque<>();
	        d.add(1);
	        d.addFirst(2);
	        d.pop();
	        d.offerFirst(3);
	        System.out.println(d);
	        d.getFirst();
	        
	        ///
	        NavigableMap<String, String> mymap = new TreeMap<String, String>(); 
	        
	        mymap.put("a", "apple"); 
	        mymap.put("b", "boy"); 
	        mymap.put("c", "cat");      
	        mymap.put("aa", "apple1");
	        mymap.put("bb", "boy1"); 
	        mymap.put("cc", "cat1");   
	        
	        mymap.pollLastEntry();     
	        mymap.pollFirstEntry();  
	        
	        ///
	        NavigableMap<String, String> tailmap = mymap.tailMap("bb", false); 
    
	        System.out.println(tailmap.pollFirstEntry());
	        System.out.println(mymap.size()); //LINE 5
	}
	
}

class Ordenador implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
	
}




