package br.com.ocjp7.concorrencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MaxValueCollections {

	ArrayList listArray = new ArrayList<>();
	
	ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	
	
	public void add(Integer i){
		readWriteLock.writeLock().lock();
		try {
		  listArray.add("valores");	
		} finally {
		 this.readWriteLock.readLock().unlock();
		}
	}
	
	public int findMax(){
		this.readWriteLock.readLock().lock();
		try {
			return Collections.max( listArray );
		} finally {
			readWriteLock.writeLock().unlock();
		}
	}
	
	public static void main(String[] args) {
		

	}

}
