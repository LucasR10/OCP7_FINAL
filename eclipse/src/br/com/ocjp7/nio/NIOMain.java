package br.com.ocjp7.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOMain {

	public static void main(String[] args) {
		
		
		Path p;
		Path val = Paths.get("C:\\desenv\\io","io.txt").getRoot();
		//Files.write(val,"novo nome".getBytes(), Options.getValidOptions());
		
		System.out.println( val.getRoot() );
		System.out.println( val.getFileName() );
		System.out.println( val.getNameCount() );
		System.out.println( val.getParent() );
		System.out.println( val.getFileSystem().toString() );
		//System.out.println( val.subpath(0, 2) );
		
		Paths ps;
		
		
		

	}

}
