package br.com.ocjp7.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LendoEscrevendoAtrbutos {

	static Path  path =  Paths.get("C:\\desenv\\alurapic\\novo\\io.txt");
	
	public static void main(String[] args) throws IOException {
	
	Date j = new GregorianCalendar(2014, Calendar.JANUARY, 1).getTime();
	
	FileTime f = FileTime.fromMillis ( j.getTime() );	
	 
	
	Files.createFile( path  );
    Files.setLastModifiedTime(path, f);
    
    System.out.println( Files.isReadable(path)  );
    System.out.println( Files.isWritable(path)  );
    System.out.println( Files.isReadable(path)  );
    
    BasicFileAttributeView bfv = Files.getFileAttributeView(path, BasicFileAttributeView.class);
    BasicFileAttributes bs = Files.readAttributes(path, BasicFileAttributes.class);
    
	System.out.println(  bfv.readAttributes().isSymbolicLink()  );
	
	System.out.println(  "bs.creationTime( )" + bs.creationTime()  );
	System.out.println(  "bs.size()  " + bs.size()  );
	System.out.println(  "bs.isDirectory()  " + bs.isDirectory()  );
	System.out.println(  "bs.creationTime()  " + bs.lastAccessTime()  );
     
	
	
    //deletar no final
    Files.delete(path);
    
    
	
	}
	
	
}
