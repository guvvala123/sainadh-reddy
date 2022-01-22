package sainadh;
	public class MyClass 
		{
		    private static Dog LOCK = new Dog();
		    public static void main(String args[]) throws InterruptedException
		    {
		        Thread.sleep(1000);
		        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
		        synchronized (LOCK) 
		        {
		            LOCK.wait(1000);
		            System.out.println("Dog '" + LOCK + "' is woken after" + " waiting for 1 second");
		        }
		    }
		}


	