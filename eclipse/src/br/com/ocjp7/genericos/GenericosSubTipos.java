//package br.com.ocjp7.genericos;
//
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class GenericosSubTipos {
//
//	public static void main(String[] args) {
//	
//		List<A1> as = new ArrayList<>();
//        as.add( new A1() ); 
//        as.add( new A1() ); 
//        as.add( new A1() ); 
//        as.add( new A1() ); 
//        
//        // Bsucar<A90> b = new Bsucar<>();
//        
//         List<?> lista1 = new ArrayList<A90>();//ok pode
//         List<? extends A90> lista2 = new ArrayList<A1>();//ok pode subtipo de A
//        /** 
//         List<?> lista3 = new ArrayList<? extends A>(); - não compila
//         List< extneds A> lista4 = new ArrayList<Integer>(); integer não subtipo de A
//         **/
//         
//         List<? super A1 > lista5 = new ArrayList<A90>();//ok, A está acima de A1 calsses acima podem
//         //List<? super A > lista6 = new ArrayList<A1>();//ok, A1 está abaixo de A ´so calsse acima de a podem : object, etc.
//         
//         
//         UsandoSubTiposComSuper<Integer, A90> comSuper = new UsandoSubTiposComSuper<>();
//         List<HashMap> l23 = null;
//         //comSuper.metodoGenericComRestricaoDeTipos(e);
//	}
//
//}
//
//class UsandoSubTiposComSuper<T ,E >{//? extends T não pdoe aqui? super A
//	
//	
//	//o tipo deve ser declarado antes. do ipo de retorno: <T> void
//	<T> void  metodoGenerico(T e){}
//	
//	//só recebera tipos derivados de list
//	<T extends List> void  metodoGenericComRestricaoDeTipos(T e){}//metodo com tipo de retorno limitado.
//	
//	void add(List< ? super Number> l){// ? extends T não pode 
//		}
//	
//	void addAll(List< ? extends Number> l){// ? extends T não pode 
//	}
//	
//}
//
//
//class Bsucar <T extends Serializable>{
//	
//	public  void buscar(List<T> l) {
//		System.out.println( l );
//	}
//}
//
//class  { String nome; }
//class A1 extends A90{ String nome; }
//class A2 extends A90 { String nome; }