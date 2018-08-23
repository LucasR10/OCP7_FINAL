package br.com.ocjp7.theads;

public class Thread2 {

	public static void main(String[] args) throws InterruptedException {
		
        PingPong p1 = new PingPong(1000L, "Ping..");
        PingPong p2 = new PingPong(3000L, "Pong..");
        
        Thread td1 = new Thread(p1, "ping");
        
        Thread td2 = new Thread(p2, "pong");
       
        td1.setDaemon(true); 
        td1.start();
        td2.start();
        
        print( td1 );
        print( td2 );        
     
}

	private static void print(Thread td1) {
		System.out.println(" isDaemon - " +  td1.isDaemon() );
        System.out.println(" getState() - " +  td1.getState() );
        System.out.println(" getPriority() - " + td1.getPriority() );
        System.out.println(" isAlive() - " +  td1.isAlive() );
	}

}

class PingPong implements Runnable{
	
	private Long tempo;
	private String msg;
	
	public PingPong(Long tempo ,String msg) {
		this.tempo = tempo;
		this.msg = msg;
	}



	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Mensagem :"+ msg +" index - "+ i + " Thread " + Thread.currentThread().getName() );
			try {
				Thread.sleep( this.tempo );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(" Terminou : " + Thread.currentThread().getName());
	}
	
	
}
