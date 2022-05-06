                                           Apurva Gupta
                                           2124mca1077
                                           Assignment 1

 Q1 Write a java program to insert 3 numbers from keyboard and findout greater number among 3 numbers.
 ANS  
      package insert3num;
import java.util.Scanner;
public class insert3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c, lar;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();  
lar = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  
System.out.println("The largest number is: "+lar); 
	}

}


Q2 Write a java program to find out the sum of command line argument.


package cmdline;

public class cmdline {

	public static void main(String[] args) {
		int c= Integer.parseInt(args[0]);
		int d= Integer.parseInt(args[1]);
		// TODO Auto-generated method stub
int s=c+d;
System.out.println("sum is"+s);
	}

}


Q3 Write a program to demostrate static variables,methods and blocks.

package static1;

public class staic1 { static int a = 3;
static int b;

static void meth(int x) {
  System.out.println("x = " + x);
  System.out.println("a = " + a);
  System.out.println("b = " + b);
}
static {
    System.out.println("Static block initialized.");
    b = a * 4;
  }

	public static void main(String[] args) {
		
		 meth(42);
	}

}


Q4

package room;
import java.util.Scanner;
public class room {
	Scanner s= new Scanner (System.in);
	int roomno,roomarea;
	String roomtype,acmachine;
	void setdata()
	{
		System.out.println("Enter the room no");
		roomno=s.nextInt();
		System.out.println("Enter the room type");
		roomtype=s.next();
		System.out.println("Enter the room area");
		roomarea=s.nextInt();
		System.out.println("is room has AC or NOT");
		acmachine=s.next();
	}
	void display()
	{System.out.println(" room no"+roomno);
	System.out.println(" room type"+roomtype);
	System.out.println(" room area"+roomarea);
	System.out.println("AC MACHINE"+acmachine);
		
	}
	public class rom{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
room s1=new room();
s1.setdata();
s1.display();
	}

}