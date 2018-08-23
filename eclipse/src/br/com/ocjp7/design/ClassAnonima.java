package br.com.ocjp7.design;

public class ClassAnonima {

	public static void main(String[] args) {

		Draw dw = new Draw() {
			@Override
			public void print() {
               System.out.println(" Dw impl ");				
			}
		};
		dw.print();
		
		new WriteDraw().printDraw( new Draw() {
			
			@Override
			public void print() {
				System.out.println(" printDraw ");	
				
			}
		});
	}

}
class WriteDraw{
	
	void printDraw(Draw dw){
		dw.print();
	}
}

interface Draw{
	void print();
}