package br.com.ocjp7.genericos;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Forks {

	public static void main(String[] args) {

		int v =ThreadLocalRandom.current().nextInt(5);
		System.out.println(v);
		
		ForkJoinPool forkJoinPool = new ForkJoinPool();	
		
		//executando um task com retorno.
		int val = forkJoinPool.invoke( new RecursiveTaskExemple() );
		System.out.println(val);
		
		//executando um action sem retorno.
		 RecursiveActionExemple pal = new RecursiveActionExemple();
		 pal.palpite = 3;
		forkJoinPool.invoke(pal);
		
		//pegadinhas feitas com CopyOnWriteList
		//só add, remove faz com que um novoa rray seja criado.
		CopyOnWriteArrayList<Integer> cpy  = new CopyOnWriteArrayList<>();
		cpy.add(11);//um novo array é criado.
		cpy.remove(11);//um novo array é criado.
		
			cpy.add(1);
			cpy.add(4);
			cpy.add(7);
			Iterator<Integer> iteracao = cpy.iterator();
			cpy.add(8);//o iterator é obtido ante so 6 ser adicionado.
			cpy.remove(7);//funciona da mesma maneira.
			while ( iteracao.hasNext() ) {
				System.out.println( iteracao.next() );
				
			}
			
			AtomicInteger i = new AtomicInteger();
			i.incrementAndGet();//incrementa automaticamente o valor
			i.getAndAdd(12);//incrementa automaticamente o valor
	}

}

class RecursiveTaskExemple extends  RecursiveTask<Integer>{
	private static final long serialVersionUID = 1L;

	@Override
	protected Integer compute() {
		return 50;
	}
	
	
}


class RecursiveActionExemple extends  RecursiveAction{

	private static final long serialVersionUID = 1L;
	int palpite;

	@Override
	protected void compute() {
	    
		 int val = ThreadLocalRandom.current().nextInt(1, 11);
		
	     if( palpite == val ){
	    	 System.out.println("Palpite :" + palpite + " Sorteio :" + val);
		}else{
			System.out.println("Palpite :" + palpite + " Sorteio :" + val);
		}
		
	     
	}
}

