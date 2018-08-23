package br.com.ocjp7.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.CharBuffer;

public class IOMain {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\desenv\\texto.txt");
        file.createNewFile();//cria um novoa rquivo
		
        System.out.println("pathSeparator : " + File.pathSeparator );
		System.out.println("pathSeparatorChar : " + File.pathSeparatorChar );
		System.out.println("separator : " + File.separator );
		System.out.println("separatorChar : " + File.separatorChar );
		
		linha();
		
		System.out.println(" length() : " + file.length()  );
		System.out.println(" getAbsolutePath() : " + file.getAbsolutePath() );
		System.out.println(" getName() : " + file.getName() );
		System.out.println(" getCanonicalPath() : " + file.getCanonicalPath() );
		System.out.println(" lastModified() : " + file.lastModified() );
		System.out.println(" exists() : " + file.exists() );
		System.out.println(" getParent() : " + file.getParent() );
		System.out.println(" compareTo(file) : " + file.compareTo(file) );
		System.out.println(" listRoots() : " + file.listRoots().length);
		System.out.println(" toPath() : " + file.toPath() );
		
		linha();
		
		FileReader fr = new FileReader(file);
		char c [] = {'5','4'};
		fr.read( c  );
		System.out.println(" fr.read() : " + fr.read() );
		System.out.println(" fr.getEncoding() : " +fr.getEncoding() );
		System.out.println(" fr.ready(); : " + fr.ready() );
		
	
		
		Reader r = fr;//interface
		
	
		BufferedReader br = new BufferedReader( r );
		br.readLine();
	
		
		FileWriter fw = new FileWriter(file);
		fw.write("ola tes");
		fw.flush();
		fw.append('d');
		fw.close();
		
		BufferedWriter bwriter = new BufferedWriter(  fw );
		bwriter.write("---------------");
	
		bwriter.write("ola bufferWriter");
		bwriter.newLine();
		
		PrintWriter pwr = new PrintWriter(file);
		pwr.println("printando ");
		pwr.append("aaaaaaaaaa");
		
		
		Console console = System.console();
		//console.readLine();
		
		//console.readLine("digite um valor ?");
		
		//Fluxo de Entrada com Arquivo
		 FileInputStream fis = new FileInputStream(file);
	}
	
	public static  void linha() { System.out.println("-----------------------------------------------------"); }

}
