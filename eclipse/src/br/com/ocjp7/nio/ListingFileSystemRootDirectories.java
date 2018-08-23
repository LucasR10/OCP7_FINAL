package br.com.ocjp7.nio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListingFileSystemRootDirectories {


	public static void main(String[] args) throws IOException {
		Path  path =  Paths.get("C:\\desenv");
		
		//listando os diretores fafaults
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		
		for (Path name: dirs) {
		    System.err.println(name);
		}
		// lista diretoris com nome []*
		DirectoryStream<Path> ds =Files.newDirectoryStream( path , "[prs]*" ); 
		
		for(Path p : ds )
			 System.out.println(p.getFileName()); 

		//ocutar um arquivo
		
		Files.setAttribute(path, "file-sistem:prp", true, LinkOption.NOFOLLOW_LINKS);
	}


}
