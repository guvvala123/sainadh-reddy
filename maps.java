package sainadh;

import java.util.*;

public class maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// map
				
				//using Hashmap
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
				hm.put(150,"Ramesh");    
				hm.put(200,"suresh");    
				hm.put(500,"ramana");   
					       
				System.out.println("\nThe elements of Hashmap are ");  
				for(Map.Entry m:hm.entrySet()){    
				System.out.println(m.getKey()+" "+m.getValue()); 
				}
					       
					       
				//HashTable
				 Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
						      
				 ht.put(50,"sainadh");  
				 ht.put(100,"prudhvi");  
				 ht.put(650,"pavanteja");  
				 ht.put(666,"Jani");  

				 System.out.println("\nThe elements of HashTable are ");  
					for(Map.Entry n:ht.entrySet()){    
					System.out.println(n.getKey()+" "+n.getValue());    
					}
						      
				//TreeMap
						      
				TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
				map.put(90,"krishna");    
				map.put(100,"Ramsai");    
				map.put(110,"Maheshbabu");       
						      
				System.out.println("\nThe elements of TreeMap are ");  
				for(Map.Entry l:map.entrySet()){    
				System.out.println(l.getKey()+" "+l.getValue());    
				 }    


			}

		}


	


