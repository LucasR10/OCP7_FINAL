package br.com.ocjp7.concorrencia;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Locks {

	//
	public static void main(String[] args) {

		Lock l1 = new ReentrantLock();
		Lock l2 = new ReentrantLock();
		
		boolean aq1 = l1.tryLock();
		boolean aq2 = l2.tryLock();
		
	 try {
		    Condition codicao =l1.newCondition();
		    
		    System.out.println("awaitUninterruptibly() :"  );
		   if(aq1 && aq2 ){
			 System.out.println("Trabalhando..");	
		   }
		 } finally {
			if(aq2) l2.unlock();
			if(aq1) l1.unlock();
			System.out.println("Liberando o Lock !!");
		 }
	 
	 
	   /** ReentrantReadWriteLock: não é realmente um lock; ele implementa
	    * a interface ReadWriteLock. O que ReentrantReadWriteLock faz é produzir duas
	    * instâncias de Lock especializadas, uma para um lock de leitura e outra para o
	    * lok de escrita.
	    *  **/
	 
	 
	 ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	 
	 Lock read = readWriteLock.readLock();
	 Lock write = readWriteLock.writeLock();
	 
	}

}
