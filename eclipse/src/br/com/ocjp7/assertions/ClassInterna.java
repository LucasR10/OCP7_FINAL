package br.com.ocjp7.assertions;

public class ClassInterna {
	private final static int  V2 =  10;
	void doo(){}
	public static void main(String[] args) {
		
       ClassInterna d= new ClassInterna.Interna();
       d.doo();
	}

	
	public static class  Interna extends ClassInterna{
		private static final int  V =  10;
		
		public Interna() {
			System.out.println("Valores : " + super.V2 );//caso a calsse herda pode fazer isso;
		}
		
		public class Interna1{
			private static final int  V1 =  10;
			public Interna1() {
				System.out.println( V2);
				doo();
			}
		}
	}
}
