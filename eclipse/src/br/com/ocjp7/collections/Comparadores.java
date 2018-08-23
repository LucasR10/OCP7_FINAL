package br.com.ocjp7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparadores {
  
  public static void main(String[] args) {
	 
	  Comparador c = new Comparador();
	  c.printComparetor();
	  
	  List<String> grades = new ArrayList<>();
	  grades.addAll(Arrays.asList(new String[]{"C", "A", "B", "A", "D"}));
	  Collections.rotate(grades,2);
	  System.out.println( grades );
  }
}
 class Comparador{
	 
	 void printCompareblo(){
		 
	 }

	public void printComparetor() {
		
		
	}
	 
 }
 
 
 
class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	 public int compareTo(Student s) {
	 return name.equals(s.name) ? 
	 Integer.valueOf(id).compareTo(s.id) : name.compareTo(s.name);

	 }
	 
}