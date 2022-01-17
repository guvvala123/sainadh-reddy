package sainadh;

		class defAccessSpecifier { 
		  void display() { 
		         System.out.println("Defalut access specifier is used"); 
		     } 
		} 

		public class accessSpecifiers1 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				//default
						System.out.println("Dafault Access Specifier");
						defAccessSpecifier obj = new defAccessSpecifier(); 		  
				        obj.display(); 


			}
		}


	
