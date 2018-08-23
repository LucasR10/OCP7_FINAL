package br.com.ocjp7.theads.contador;

public class ContadorMinutos implements Runnable {
	
	public static final long UM_MINUTO = 60000L;
	public static final long  UM_SEGUNDO = 1000L;
	
     private int tempoDigitadoPeloUsuario ;
     private int tempoAcumulado;
     

	public ContadorMinutos(int tempoDigitadoPeloUsuario) {
		this.tempoDigitadoPeloUsuario = tempoDigitadoPeloUsuario;
	}


	@Override
	public void run() {
		try {
			System.out.println(" Teempo + " +  tempoAcumulado);
			while ( tempoAcumulado > tempoAcumulado) {
		
				Thread.sleep( UM_SEGUNDO );
				this.tempoAcumulado = + 1;
				System.out.println(" Teempo + " +  tempoAcumulado);
			}
		} catch ( InterruptedException e ) {
			e.printStackTrace();
		}
	}

	public int getTempoAcumulado() {
		return tempoAcumulado;
	}
	
}
