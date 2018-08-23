package br.com.ocjp7.kaplanlearn.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Teste {

	private static final String C_DESENV_ALURAPIC = "C:\\desenv\\alurapic";

	public static void main(String[] args) {
	
		Path ps = Paths.get(C_DESENV_ALURAPIC);
		int space = 1;
		for(Path p : ps) {
			System.out.println("Sapce : "+ space +" Path " + p );
			space += 2;
		}
		
		System.out.println("diretorio atula : " + Paths.get("./d") ); 
	
	}
	
	
}
