package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class Example3_LinkedList 
{
  public static void main(String[]args)
  {
	    LinkedList ll=new LinkedList();
  ll.add("rahul");
  ll.add(65.5f);
  ll.add('A');
  ll.add(101);
  ll.add(null);
  ll.add(null);
  
  System.out.println(ll);
  System.out.println(ll.size());
  
  System.out.println(ll.contains(101));
  System.out.println(ll.get(2));
  
  System.out.println(ll);
  ll.add(3,500);
  System.out.println(ll);
  
  ll.remove(3);
  System.out.println(ll);
  System.out.println("....print all data of linkedlist using iterator..");
  Iterator itr=ll.iterator();
  while(itr.hasNext())
  {
	  System.out.println(itr.next());
  }
  
  System.out.println("...print all data of linkedlist using Listiterator..");
 ListIterator litr= ll.listIterator();
 while(litr.hasNext())
 {
	 System.out.println(litr.next());
 }
  System.out.println("..print all data of linkedlist using for loop..");
  
  for(int i=0; i<=ll.size()-1;i++)
  {
	  System.out.println(ll.get(i));
  }
  System.out.println("...print all data of linkedlist using foer each loop..");
  for(Object s1:ll)
  {
	  System.out.println(s1);
  }
  
  
  
  
  
  
  
  
  
  
  
  }
	
	
	
	
	
	
	
	
	
}
