package sainadh;

public class MyThread {

	public void run() {
		System.out.println("concurrent thread started running..");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread a = new  MyThread();
  		a.run();

	}

		}