package br.com.ocjp7.collections;



import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class AllMapas {

	
	public static void main(String[] args) {
		//TesteHashMap.get();
		//TreeMapTeste.get();
		DaqueT.get();
	}
	
}

class DaqueT{
	
	public static  void get() {
		
		Deque<Integer> d = new ArrayDeque<>();
		d.push(1);         
		d.push(2);         
		d.push(3);
		System.out.println(d.remove());        
		System.out.println(d.remove());       
		System.out.println(d.remove());
		
        NavigableMap<String, String> mymap = new TreeMap<String, String>();       
        mymap.put("a", "apple"); 
        mymap.put("b", "boy");
        mymap.put("c", "cat");     
        mymap.put("aa", "apple1");
        mymap.put("bb", "boy1"); 
        mymap.put("cc", "cat1");      
        mymap.pollLastEntry(); //LINE 1      
        mymap.pollFirstEntry(); //LINE 2                
     
		
	}
}

class TreeMapTeste{
	
	public static  void get() {
		TreeMap<String, Long> val = new TreeMap<>() ;
		val.put("a", 5l);
		val.put("B", 43l);
		val.put("C", 3l);
		val.put("F", 500L);
		val.put("z", 1L);
		
		System.out.println( val);
		
		System.out.println( val.ceilingEntry("a") );
		System.out.println( val.higherKey("C"));
		System.out.println( val.tailMap("a", false) );
		System.out.println( val.lowerKey("b"));
		
		
	}
	
}


class TesteHashMap{

	public static  void get() {
		
		HashMap<String, Integer> m1 = new HashMap<>();
		
		m1.put("A", 10);
		m1.put("B", 40);
		m1.put("C", 30);
		m1.put(null, 20);
		
		System.out.println( m1 );
		
		
		boolean b1 = m1.containsKey("A");//
		System.out.println( b1 );
		
		boolean b2 = m1.containsValue(30);
		System.out.println( b2 );
		
		Integer v = m1.get(null);
		System.out.println( v );//get via chave
		
		for ( String key : m1.keySet() ) {//
			System.out.println( m1.get(key) );
		}
		
		for ( Map.Entry<String, Integer> o: m1.entrySet() ) {//
			System.out.println("key :" + o.getKey() + "value" + o.getValue() );
		}
		
		for (Integer c : m1.values() ) {
			System.out.println( c );
		}
		
		System.out.println( m1.values() );
	}
		
	
}