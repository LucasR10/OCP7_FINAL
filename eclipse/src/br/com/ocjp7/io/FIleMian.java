package br.com.ocjp7.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Writer;

public class FIleMian {

	public static void main(String[] args) throws IOException {
		

		 File diretorio  = new File("C:\\desenv\\io");
		 diretorio.mkdir();
		 System.out.println(" exitengDir :" + diretorio.isDirectory() );
		 
		 File arquivo  = new File(diretorio,"io.txt");
		 arquivo.createNewFile();
		 
		 arquivo.isFile();
		 System.out.println(" file :" + diretorio.isFile() );
		 
		 System.out.println(" Delete :" +  diretorio.delete() );
		
		 FileDescriptor fileDescriptor = new FileDescriptor();
		 
		 //Leitura
		 FileReader fileReader = new FileReader(arquivo);//File
		 FileReader fileReader2 = new FileReader( fileDescriptor );//FileDescriptor
		 FileReader fileReader3 = new FileReader("string");// String
		 
		 BufferedReader br1 = new BufferedReader(fileReader);//fileReader
		 BufferedReader br2 = new BufferedReader(fileReader, 10 );//fileReder , int
		 
		 
	    //Escrita
		 File fileLeitura  = new File("caminho");
		 
		 FileWriter fileWriter1 = new FileWriter(fileDescriptor);//FileDescriptor
		 FileWriter fileWriter2 = new FileWriter(fileLeitura);//File
		 FileWriter fileWriter3 = new FileWriter(fileLeitura, true);
		 FileWriter fileWriter4 = new FileWriter("caminho", true);
		 FileWriter fileWriter5 = new FileWriter("caminho");
		 
		 BufferedWriter bufferedWriter = new BufferedWriter( fileWriter1 );//FileWriter
		 BufferedWriter bufferedWriter2 = new BufferedWriter( fileWriter1, 20 );//FileWriter , int
	
		 Writer out = null; 
		 PrintWriter printWriter = new PrintWriter(out);
	     printWriter.println();
	     printWriter.write("valor");
	     
		 RandomAccessFile accessFile = new RandomAccessFile(arquivo, "write");
		 
		 
	}

}
