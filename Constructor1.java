package sainadh;
            class Student {
			int id;
			String name;

			Student(int i,String n) {
			id=i;
			name=n;
			}

			void display() {
			System.out.println(id+" "+name);
			}
		}
		public class Constructor1 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub   
		
		            Student s1=new Student(60,"sairam");
					Student s2=new Student(100,"phani");
					s1.display();
					s2.display();
				}
		}


	
