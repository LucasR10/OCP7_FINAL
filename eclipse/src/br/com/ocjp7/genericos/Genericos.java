package br.com.ocjp7.genericos;

import java.util.ArrayList;
import java.util.List;

import br.com.ocjp7.genericos.Animal.Util;


public class Genericos {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		
		DAO<Animal, Integer >  dao = new DAO<>();//
		dao.get(20);
		
		Animal a = new Animal();
		a.setNome("toto");
		a.setTipo("Vira Lata");
		dao.print( a  );
		
		
		Animal a1 = dao.novoObjeto(a);
		
		for (int i = 0; i < 10; i++) {
			dao.add( new Animal() );
		}
		
		System.out.println("Size : " + dao.saze );
		
		//Usando o perador diamante;
		Pair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		System.out.println(p1);
		
		Pair<Double, Double>  p2 = new OrderedPair<>(10D, 10D);
		System.out.println(p2);
		
		
		OrderedPair<String, Box<Integer> > p = new OrderedPair<>("primes", new Box<>(10));
		p.getKey();
		
		System.out.println(p );
		
		//Pair<Integer, String> p11 = new Pair<>(1, "apple");
		//Pair<Integer, String> p22 = new Pair<>(2, "pear");
		
		//boolean same = Util.compare(p1, p2);
		
		//System.out.println(same );
		
		
	}
}

class	 A { /* ... */ }
interface B {/* ... */}
interface C {/* ... */}

class D <T extends  A> {}

 class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n)  { this.n = n; }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }

 }

class Box<V>{
   
   private V value;
   
   public Box(V v) {
	   this.value = v;
   }
   
   public V getValue() {
		return value;
	}
}
class DAO<T,K>{
	public int saze = 0 ; 
	List<T> lista = new ArrayList<>();
	
	public void save (T obj) {
		System.out.println( obj.toString() );
		System.out.println("Salvando os Dados!");
	}
	public void print ( T obj) {
		System.out.println( obj.toString() );
		System.out.println("Buscando os dados!");
	}
	
	public void get (K key) {
		System.out.println( key );
		System.out.println("get dados!");
	}
	
	public T novoObjeto ( T o) throws InstantiationException, IllegalAccessException {
		return  (T) o.getClass().newInstance();
	}
	
	public List<T> add (T e) {
		lista.add(e);
		saze = lista.size();
		return lista;
	}
	
}

interface Pair <K, V> {
    public K getKey ();
    public V getValue ();
}

class OrderedPair<K, V> implements Pair<K, V> {

	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Key :"+ this.key + " Value : "+ this.value + " Type KEY :" + key.getClass() + " Type V :"+ this.value.getClass() ;
	}
}

class Animal{
	
	private String nome;
	private String tipo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Nome :"+ this.nome + ", Tipo :"+ this.tipo;
	}
	
	
static class Util {
	    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
	        return p1.getKey().equals(p2.getKey()) &&
	               p1.getValue().equals( p2.getValue() );
	    }
	}
	
}