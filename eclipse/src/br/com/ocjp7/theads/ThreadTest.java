package br.com.ocjp7.theads;



public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
	
		Thread t1 =  new Thread( new GeraPDF(15) );
		Thread t2 =  new Thread( new GeraPDF(200) );
		t2.setPriority(Thread.MAX_PRIORITY);
		
		int MP = Thread.MAX_PRIORITY; //10
		int MP2 = Thread.MIN_PRIORITY;//1
		int MP3 = Thread.NORM_PRIORITY;//5
		
        t1.start();
        t2.start();
        
        Thread t11 =  new Thread( new Thread() );//valido mais não recomendado
        
        Thread forRun =  new Thread(  new ForRumable() );
        forRun.start();
       // forRun.start(); não pode chamr duas vezes.
        System.out.println(" id "+ forRun.getId());
        
	}

}

class ForRumable implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Imprimindo + i");
		}
		
	}
	
}


class GeraPDF  implements Runnable {
	
	private int  tempo;
	public GeraPDF(int t) {
		this.tempo = t;
	}
	
    public void run () {
    	for (int i = 0; i < tempo; i++) {
    		 System.out.println("Gerando .....PDF " + i );
    		 try {
				Thread.sleep( tempo * 200  );
				String name = Thread.currentThread().getName();
				System.out.println(name);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
       
    }
}


