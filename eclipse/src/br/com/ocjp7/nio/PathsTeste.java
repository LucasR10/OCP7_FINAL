package br.com.ocjp7.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTeste {

	public static void main(String[] args) {
		
		Path p = Paths.get("C:\\desenv\\io\\new1");
        System.out.println( p.getName(1) );
        System.out.println( p.subpath(0,2) );
        System.out.println( p.relativize(p) ); 
	}

}
