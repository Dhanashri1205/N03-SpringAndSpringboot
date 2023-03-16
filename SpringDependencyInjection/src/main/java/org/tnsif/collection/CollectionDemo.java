package org.tnsif.collection;

import java.util.List;
import java.util.Set;

//Program to demonstrate on DI in the form of collection
public class CollectionDemo {
	
	private List<String> contactNo;
	private Set<String> books;
	
	//DI using setters
	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	
	public void display()
	{
		System.out.println("List of contact numbers...");
		for(String s: contactNo)
		{
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Set of books...");
		for(String s1: books)
		{
			System.out.println(s1);
		}
	}
	
	

}
