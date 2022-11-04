package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vectorlist
{
    public  static  void main (String[]args)
    {
    Vector V=new Vector();
    
    V.add("rahul");
    V.add(101);
    V.add('A');
    V.add(null);
    V.add("rahul");
    V.add(null);	
    
    System.out.println(V.size());
    
    System.out.println(V);
    
    System.out.println(V.contains(101));
    System.out.println(V.isEmpty());
    System.out.println(V.get(3));
    
    
    System.out.println(V);
    //add info in between arraylist--> right shift operation
    V.add(4,"mahesh");
    System.out.println(V);
    // remove/delete info  in  between  arraylist -->left  shift operation
    
       V.remove(4);
       System.out.println(V);
       
       //update/modify info from arraylist 
          V.set(3,75.5f);
          System.out.println(V);
          
        System.out.println("..print VI  data  from arraylist   using iterator..");
        
        Iterator itr=V.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        
        System.out.println("..print VI  data  from arraylist   using Listiterator..");
         
     ListIterator litr =V.listIterator()
    while(litr.hasNext())
    {
    	System.out.println(litr.next());
    
    }
    System.out.println("..print VI data from arraylist using for each loop..");
     
     for(Object s1:V)
     {
    	 System.out.println(s1);
     }
     System.out.println("..print  VI data from Arraylist by  using for loop..");
     
     for(int i=0; i<=V.size()-1;i++);
     {
    	 System.out.println(V.get(i));
     } 
    	 System.out.println("..print  Vi  data  from  arraylist using  Enumeration..");
    	 
    	 Enumeration  enu = V.elements
    	 
    	 
    	 
    	 
     }
     
     
     
     
     
     
    
    
    
    
    
    
    
    
    
    	
    	
    	
    	
    }









