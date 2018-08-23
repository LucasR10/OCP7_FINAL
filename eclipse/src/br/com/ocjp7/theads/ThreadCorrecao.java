package br.com.ocjp7.theads;

public class ThreadCorrecao {

	public static void main(String[] args) {
		
		Thread th1 = new WaitThread3();
		th1.start();
		try {
			th1.join(1000);
		} catch (Exception ex) {
		}
		System.out.print("completed");
	
        
	}

}

class WaitThread3 extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.print("waiting..." + i);
	}

}