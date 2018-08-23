package br.com.ocjp7.theads;

public class Sincronizacao {

//	public static void main(String[] args) {
//		System.out.println("1");
//       synchronized (args) {
//		 System.out.println("2");
//	   }
//       try {
//		args.wait();
//	} catch (InterruptedException e) {
//	}
	
	
	}
	



class testaWit implements Runnable{
 
	@Override
	public void run() {
		
	}
	
}

class AplicandoSincronizacao{
	 Integer x;
	 
	 synchronized void get(){}//metodod ou blocos
	 
	 void sincronizandoBlocos(){
		 
		 synchronized (x) {
			
		 }
		 synchronized (this) {
			
		}
	 }
	 
	 //public  static synchronized - ok
	// synchronized public  static - ok
	 //public synchronized static - ok
	 
	 public  static synchronized int salario() throws ClassNotFoundException{
		 //ou asim
		 Class c = Class.forName("Sincronizacao");
		 synchronized (Sincronizacao.class) {//this metodo estico da erro
			 return 0;
		}
		///metoso estaticos tavam(lock) instância da claas. Metodos não estatico travam instancia do this.
		 
		 
     }
}





