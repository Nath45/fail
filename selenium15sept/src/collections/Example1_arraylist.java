package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class Example1_arraylist 
{

	public static void main(String[]args)
	{
		//ArrayList al=new ArrayList();           //initial capacity =10
		
		 ArrayList al= new ArrayList(8);         //initial capacity=8
		
		 
		al.add("Rahul");
		al.add(101);
		al.add('A');
		al.add(65.5f);
		al.add("Rahul");
		al.add(null);
	    al.add(null);
	
	System.out.println(al.size());    //4
	System.out.println(al.isEmpty());  //false
	System.out.println(al.get(3));    //65.5
	System.out.println(al);
	 
	//add info in between ArrayList --> right shift operation 
	 al.add(4,"mahesh");
	 System.out.println(al);
	 
	//remove/delete info in between ArrayList--> Left shift operation 
	    al.remove(4);
	    System.out.println(al);
	    
	  //  update/modify info from ArrayList
	      al.set(3,75.5f);
	      System.out.println(al);
	      
	 System.out.println("....print all data from Arraylist using iterator...");
	 Iterator itr =al.iterator();
	 while(itr.hasNext())       //true--->false
 {
		 System.out.println(itr.next());
	 } 
		 
	System.out.println("..print all data from arrayist using Listiterator..");
	  
	ListIterator litr =al.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	 System.out.println("...print all data from arraylist using for loop...");
	 for(int i=0; i<=al.size()-1;i++)
	 {
		 System.out.println(al.get(i));
	 }
	 
	 System.out.println("..print all data from arraylist using for each loop..");
	 
	     for(Object s1:al)
	     {
	    	 System.out.print(s1);
	     }
	  }
	      	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

