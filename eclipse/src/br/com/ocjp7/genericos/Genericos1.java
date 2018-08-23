package br.com.ocjp7.genericos;

public class Genericos1 {

	
	public static void main(String[] args) {
	 
		Pair1<Integer, String, Genericos1 > val = new OrderedPair1();
		
	}
	
}

 interface Pair1<K, V ,I> {
    public K getKey();
    public V getValue();
    public I newInstance() throws InstantiationException, IllegalAccessException;
}

class OrderedPair1<K, V , I> implements Pair1<K, V , I> {

    private K key;
    private V value;
    
    private I instance;
    
    public OrderedPair1() {
    }

    public OrderedPair1(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }

	
	@Override @SuppressWarnings("unchecked")
	public I newInstance() throws InstantiationException, IllegalAccessException {
		return (I) instance.getClass().newInstance();
	}
}
