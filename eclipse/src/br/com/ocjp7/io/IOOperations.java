package br.com.ocjp7.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IOOperations {
    
	private static final String caminho = "C:\\desenv\\io\\new1\\texto.txt";

	//TODO:
	public static void main(String[] args) throws IOException {
		
		File arquuivo = new File(caminho);
        arquuivo.createNewFile();
        System.out.println("getAbsolutePath :" + arquuivo.getAbsolutePath() );
        System.out.println("Directory :" + arquuivo.isDirectory() );
        
        FileReader fileReader = new FileReader(arquuivo);
        
        System.out.println(fileReader.read());
        
        BufferedReader bf  = new BufferedReader(fileReader);
        while ( bf.readLine() !=  null) {
        	//bf.
        	System.out.println( bf.readLine() );
        }
			
        
        Path px =Paths.get("C:\\desenv\\io\\new1\\a.txt");
        Path py  =Paths.get("C:\\desenv\\io\\new1\\new2\\a1.txt");
		//Files.move(px, py, StandardCopyOption.ATOMIC_MOVE);
        System.out.println(px.getName(0));
	}

}
