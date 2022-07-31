package room1;

public class room1 {
	
		   static int x = 11;
		   static int y;
		   static void func(int z) {
		      System.out.println("x = " + x);
		      System.out.println("y = " + y);
		      System.out.println("z = " + z);
		   }
		   static {
		      System.out.println("Running static initialization block.");
		      y = x + 5;
		   }
		   public static void main(String args[]) {
		      func(8);
		   }
		}

