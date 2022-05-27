package Threading;

 public class Thread1
 {
	 public static void main(String[] args)
	{
		NameThread nt = new NameThread();
		Thread t = new Thread(nt);
		t. setName("fred");
		t. start();
		//t. run();
	}
 }
	 class NameThread implements Runnable
	 {
	 public void run()
	 {
		 System.out.println("apurva gupta");
		 System.out.println("Run by"+ Thread.currentThread());
		 
	 }
	
	 }
