package br.com.ocjp7.nio;

import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

import br.com.ocjp7.nio.PathMatcherTest.CPU.Qd;

 class PathMatcherTest1 {

	public static void main(String[] args) {
		
		class Inner{ 
			void ola(){
			 System.out.println("OLá");
			}
          }
		   
		
		
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:" + "glob:*.pdf");
         System.out.println(" Arquivo : " + matcher.matches(Paths.get("C:\\desenv")));
	}

}
 public class PathMatcherTest { 
private PathMatcherTest () {} 
		class CPU { 
		   private void performWork () {System.out.println ("CPU funcionando!");} 
		   
		   class Qd{
			   
		   }
		} 
   public static void main (String [] args) { 
     Qd d = new PathMatcherTest().new CPU().new Qd();
     
  } 
}
