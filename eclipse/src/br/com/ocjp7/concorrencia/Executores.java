package br.com.ocjp7.concorrencia;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class Executores {

	public static void main(String[] args) {
		
//		Callable<Integer> my = new MyCallable();
//		
//		ExecutorService  executorService = Executors.newCachedThreadPool();
//		Future<Integer> ft= executorService.submit(my);
//		try {
//			ft.get();//bloquei a até termine.
//		} catch (InterruptedException | ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//bloquei ate que termine.
//		
		
		long nextLong = ThreadLocalRandom.current().nextLong(4L);
		System.out.println(" valores :" + nextLong);
		
	    //usa uma instância de Runtime.availableProcessors;
		ForkJoinPool fjp = new ForkJoinPool();
		//sobrescreve o numero de thread a ser executada;
		ForkJoinPool fj2 = new ForkJoinPool(5);
	}

}


class MyCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		return null;
	}
	
}
