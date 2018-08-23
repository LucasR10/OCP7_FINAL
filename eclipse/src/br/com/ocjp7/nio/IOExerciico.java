package br.com.ocjp7.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;

public class IOExerciico {

	public static void main(String[] args) throws IOException {
		String a = "C:\\desenv\\io\\new1\\new3\\temp\\A.txt";//
		String b = "C:\\desenv\\io\\new1\\new3\\temp\\B.txt";
		
		///Path pp1 = Paths.get("C:\\desenv\\io\\new1");        
		//Path pp2 = Paths.get("\\B.txt");       
		//Path pp3 = pp1.relativize(pp2);       
		//System.out.println(pp3);
         
	    //Path p1 = Paths.get(a);
       // Path p2 = Paths.get(b);
        
        //try {Files.move(p1, p2)} não funciona
        
        //O seguinte fraquimento de codigo movera o arquivo  A.txt se B.txt existe.
        /** Files.move(p1, p2);//este vai lancar uma excepion se o arquivo existir : java.nio.file.FileAlreadyExistsException
        Files.move(p1, p2, StandardCopyOption.REPLACE_EXISTING);//se ele ja existe renomeia para novo arquivo **/
        
        //file system
        PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:**.{htm,xml,txt}");
        boolean econtrar = pm.matches(Paths.get("C:\\desenv\\io\\new1\\new3"));
       System.out.println(econtrar);
      // StandardOpenOption v = StandardOpenOption.APPEND;
       //FileVisitResult.
       
       
       /** subpastas        */ 
        Path p = Paths.get("C:\\desenv\\io\\new1"); 
       
       
        System.out.println(p.subpath(1, 2));
        
         DirectoryStream<Path> ds = Files.newDirectoryStream(p, "*.txt,*.jpeg");
	     Iterator<Path> i = ds.iterator();
	     
	     for (Path path : ds) {
			System.out.println( path.getFileName() );
		  }
	          
	}

}
