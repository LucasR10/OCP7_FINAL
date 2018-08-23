package br.com.ocjp7.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TrabalhandoComPath {

	
	
	public static void main(String[] args) throws IOException {
      String path = "C:\\desenv\\io\\new1\\new2\\sub1.txt";
      String copypath = "C:\\desenv\\io\\new1\\new2\\new3";
      Path caminho = Paths.get(path);
      //negatio da error; as sub pasta iniciam em 1; a raiz comeca em zero
      System.out.println("Pasta :" + caminho.subpath(0, 3));
      
      //criando arquivo
      if( Files.exists(caminho) ) Files.delete( caminho );
        Path arq = Files.createFile(caminho);
    
        Path p = Paths.get(copypath);
        Files.copy(caminho, p);
      }
   
     
      
      

}
