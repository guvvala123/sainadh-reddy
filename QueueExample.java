package sainadh;
import java.util.*;

public class QueueExample {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Queue<String>locationsQueue = new LinkedList<>();
			
			locationsQueue.add("Kolkata");
			locationsQueue.add("Patna");
			locationsQueue.add("Delhi");
			locationsQueue.add("Gurgaon");
			locationsQueue.add("Noida");
			
			System.out.println("QueueExample is : " + locationsQueue);
			System.out.println("Head of QueueExample : " + locationsQueue.peek());
			
			locationsQueue.remove();
			
			System.out.println("After removing Head of QueueExample : " + locationsQueue);
			System.out.println("Size of QueueExample : " + locationsQueue.size());

		}

	}
