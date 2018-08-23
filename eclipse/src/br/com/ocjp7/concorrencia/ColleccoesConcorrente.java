package br.com.ocjp7.concorrencia;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;

public class ColleccoesConcorrente {

	public static void main(String[] args) {
		
		//usar coleções do pacote java.util.concorrente tem muitass vantagens

		
		  //BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(1);
		  //bq.add(45);
		 // bq.add(44);//error limit maxio de 1
		  
		ExecutroThread e1 = new ExecutroThread("Executo 1 ");
		ExecutroThread e2 = new ExecutroThread("Executo 2 ");
		ExecutroThread e3 = new ExecutroThread("Executo 3 ");
	
		//new Thread(e1).start();
		//new Thread(e2).start();
		//new Thread(e3).start();
		
		ExecutorService exe1 = Executors.newCachedThreadPool();
		ExecutorService exe2 = Executors.newFixedThreadPool(1);
		ExecutorService exe3 = Executors.newSingleThreadExecutor();
		
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
		
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.availableProcessors());
		
		 new java.util.concurrent.Callable<Integer> (){
			@Override
			public Integer call() throws Exception {
				int count = ThreadLocalRandom.current().nextInt(1, 11);
				for (int i = 1; i <= count; i++) {
					System.out.println("Running - " + i);
				}
				return count;
			}
		  };
	}

}


class ExecutroThread implements Runnable{
   	
	private String palavra;
   	
	public ExecutroThread(String palavra) {
       this.palavra = palavra;
	}
	
	
	@Override
	public void run() {
		try {
		   for (int i = 0; i < 5; i++) {
			  System.out.println(" Imprimindo a palavra : " + this.palavra );
			  Thread.sleep(2000L);
		   }
		} catch (InterruptedException e) {
			e.printStackTrace();
	    }
		
	}
}




