package br.com.ocjp7.theads;

public class ThreadMain1 {

	public static void main(String[] args) {

		/**
		Thread rel1 =  new Thread(new Relatorio(2000L, "Gerando PDF"), "N_1");
		Thread rel2 =  new Thread(new Relatorio(2000L, "Gerando Excel"), "N_2");
		Thread rel3 =  new Thread(new Relatorio(3000L, "Gerando CSV "), "n_3");
		
		try {
			rel1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		rel1.start();
		rel2.start();
		rel3.start();
		*/
		
		new Thread( new Simple("N1", "JAVA")).start();;
		 new Thread( new Simple("N1", "c")).start();;
		 new Thread( new Simple("N1", "c++")).start();;
		 new Thread( new Simple("N1", "js")).start();;
  
	}

}

class Simple implements Runnable{

	private String str;
	private String n;
	

	public Simple(String str , String name) {
		this.str = str;
		this.n = name;
	}


	@Override
	public void run() {
	  System.out.println( " Nome : " + n + " #"+str);
    }
	
	
}

class Relatorio implements Runnable{
   
	private long tempo;
	private String msg;
	
	
	
	public Relatorio(long tempo, String msg) {
		this.tempo = tempo;
		this.msg = msg;
	}



	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println( i + " : " + msg );
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}