package sainadh;

import java.util.*;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		         //creating arraylist
				System.out.println("ArrayList");
				ArrayList<String> city=new ArrayList<String>();   
			      city.add("ongole");//
			      city.add("Markapuram");    	   
			      System.out.println(city); 

			      //creating vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> vec = new Vector();
			      vec.addElement(70); 
			      vec.addElement(90); 
			      System.out.println(vec);

			      //creating linkedlist
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("Mahesh babu");  
			      names.add("Goutham nanda");  	      
			      Iterator<String> itr=names.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  

			       //creating hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(112);  
			       set.add(140);  
			       set.add(220);
			       set.add(500);
			       System.out.println(set);

			       //creating linkedhashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(120);  
			       set2.add(190);  
			       set2.add(180);
			       set2.add(200);	       
			       System.out.println(set2);

			      }

			}

		}



