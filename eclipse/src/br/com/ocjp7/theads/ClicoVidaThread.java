package br.com.ocjp7.theads;

import java.util.Arrays;
import java.util.List;

public class ClicoVidaThread {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
    
		Thread t = new Thread( new Executor() );// new 
		//t.start();//runnable depois running
	   // t.sleep(45L);//Waiting/blocked/sleeping
		Thread t2 = new Thread( new Executor() );// new
		//t2.start();
		
		Thread t4 = new Thread( new Conta(50, "Lucas")  );
		Thread t5 = new Thread( new Conta(150, "Rosa")  );
		t4.start();
		t5.start();
	}

}

class Conta implements Runnable{
  
	static List<Integer> total = Arrays.asList(10,20,301,40);
	
	private int saque;
	private String nome;
    public Conta(int saque , String nome) {
		this.saque = saque;
		this.nome = nome;
	}
	@Override
	public void run() {
		for (Integer integer : total) {
			
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}}

class Executor implements Runnable{
  static int incremento;
	@Override
	public void run() {
		while (incremento < 30) {
		   System.out.println(" Menutos : 00:" + incremento +"");
		   try {
			Thread.sleep( 1000);
			this.incremento++;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        }
	}
}


