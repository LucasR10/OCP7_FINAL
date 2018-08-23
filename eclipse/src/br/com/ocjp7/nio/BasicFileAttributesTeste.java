package br.com.ocjp7.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;

public class BasicFileAttributesTeste {

	public static void main(String[] args) throws IOException {
		
		Path  path =  Paths.get("C:\\desenv\\io.txt");
		Path  path1 =  Paths.get("C:\\desenv\\io\\new1\\new2");
		Path res = Files.createFile( path  );
		System.err.println("index - "+ path1.getName(1).toString( ));
		System.err.println("index - "+ path1.subpath(0,2).toString() );
		
		//buscando subPastas
		Path  sub =  Paths.get("C:\\desenv\\io\\new1\\new2");
		//System.err.println("sub " + sub.subpath(0, 3));
		
		// Solaris syntax
		//Path path = Paths.get("/home/joe/foo");

		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());
		
		System.out.println("---------------------------------------------");
		BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);
		
	
		System.out.println("creationTime: " + bfa.creationTime());
		System.out.println("lastAccessTime: " + bfa.lastAccessTime());
		System.out.println("lastModifiedTime: " + bfa.lastModifiedTime());

		System.out.println("isDirectory: " + bfa.isDirectory());
		System.out.println("isOther: " + bfa.isOther());
		System.out.println("isRegularFile: " + bfa.isRegularFile());
		System.out.println("isSymbolicLink: " + bfa.isSymbolicLink());
		System.out.println("size: " + bfa.size());
		 
		System.out.println("---------------------------------------------");
		
	    try {
	        DosFileAttributes Dosattr =
	            Files.readAttributes(path, DosFileAttributes.class);
	        System.out.println("isReadOnly is " + Dosattr.isReadOnly());
	        System.out.println("isHidden is " + Dosattr.isHidden());
	        System.out.println("isArchive is " + Dosattr.isArchive());
	        System.out.println("isSystem is " + Dosattr.isSystem());
	    } catch (UnsupportedOperationException x) {
	        System.err.println("DOS file" +
	            " attributes not supported:" + x);
	    }
	
	    
		//deletar no final
	    Files.delete(path);
	    Files.delete(path1);
	    
	    //Dos atribute
	    
	}
	
}
