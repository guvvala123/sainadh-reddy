package sainadh;

public class Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		        
		        try 
		        {
		            array[7] = 7;
		        }
		        catch (ArrayIndexOutOfBoundsException e) 
		        {
		            System.out.println("Array index is out of bounds!"); 
		        }
		        finally 
		        {
		            System.out.println("The array is of size " + array.length);
		        }
		    }
		}



