package br.com.ocjp7.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesTeste {

	private static final String SAIDADA = "C:\\desenv\\alurapic\\.gitignore";
	
	public static void main(String[] args) throws IOException {

	//files
    File arquivo = new File( SAIDADA );
    File arquivoNovo = new File("C:\\desenv\\alurapic\\");
    File json = new File("package.json");
    
    
    //entrada e saida de arquivos 	
	InputStream entrada = new FileInputStream( new File(SAIDADA));	
	OutputStream saida = new FileOutputStream( arquivoNovo );
	
	//para classe de scritas
	Writer fw =  new FileWriter(json);
	fw.write("teste file write");
	fw.append("append");
	
	
	Writer bff = new BufferedWriter( fw );
	bff.write("write o arquivo !");
	
	
	PrintWriter pw = new PrintWriter(saida);
	pw.println("println");
	
	//calss de leturas
	
	Reader rdd = new FileReader(json);
	rdd = new BufferedReader(rdd);
	
	//calsss file
	
	Files.copy(Paths.get(SAIDADA) , saida);
    System.out.println(Files.getOwner(Paths.get(SAIDADA)) );
	//Files.
	
  Files.copy(   Paths.get(SAIDADA), Paths.get("newf"));
    
	}

}
