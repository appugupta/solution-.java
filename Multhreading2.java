package Threading;

 public class Thread1
 {
	 public static void main(String[] args)
	{
		 NameThread r=new  NameThread(); 
		Thread t1 = new Thread(r);
		t1. setName("fred");
		Thread t2 = new Thread(r);
		t2. setName("john");
		Thread t3 = new Thread(r);
		t3. setName("lucy");
		t1.start();
		t1.setPriority(10);
		t2.start();
		t3. start();
		//t. run();
	}
 }
	 class NameThread implements Runnable
	 {
	 public void run()
	 {
		 for (int x=1; x<=3; x++)
		 {
		 //System.out.println("apurva gupta");
		 System.out.println("Run by"+ Thread.currentThread().getName()+"x is"+x);
		 try
		 {
			 Thread.sleep(1000);
			 
		 }catch( InterruptedException e)
		 {
			 
		 }
		 
	 }
	
	 }
	 }
	   