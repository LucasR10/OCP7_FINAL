package br.com.ocjp7.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryComRecursos {

	public static void main(String[] args) {
		
         //testando o autoClosable
		  try( MyRecurso1 m1 = new MyRecurso1() ; MyRecurso2 m2 = new MyRecurso2()){
			  System.out.println("try");
			  //throw new Exception("");
		  }catch (Exception e) {
			  System.out.println("catch ");
		  }finally {
			  System.out.println("finally ");
		  }
		  
		
	}

}

class MyRecurso1 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("fechou o recurso 1");
		
	}
	
}

class MyRecurso2 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("dechou o recurso 2");
		
	}
	
}

class TryRecursos{
	
	public void lerAArquivo() {
		
		try(Reader r = new BufferedReader(new FileReader(new File("")))) {
			r.close();
		}catch(IOException e) {
			//r.close();
		}
		
		//valido para try com recursos;
		
		  try ( Reader r = new BufferedReader(new FileReader(new File(""))); Reader r1 = new BufferedReader(new FileReader(new File("")));  ) {
			  
		  }catch(IOException e) {
				//r.close();
			}
		
	}
	
}

