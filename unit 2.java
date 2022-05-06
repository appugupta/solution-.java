                                              Apurva Gupta
                                              2124mca1077
                                              ASSIGNMENT 2



Question 6-Write a Java program to create a class named Shape and create three sub classes Circle, Triangle and Square,
each class has two-member function named draw () and erase (). Implement this concepts using polymorphism


solution--

class Shape
 {
 void draw()
 {
 System.out.println("Shape draw()");
 }
 void erase()
{
 System.out.println (" Shape erase()");
 }
 }
class Circle extends Shape
 {
 void draw()
 {
 System.out.println ("Circle draw()");
 }
void erase()
 {
 System.out.println ("Circle erase()");
 }
}
class Triangle extends Shape
 {
 void draw()
 {
 System.out.println("Triangle erase()");
 }
}
class Square extends Shape
 {
 void draw()
 {
 System.out.println ("Square draw()");
 }
void erase()
 {
 System.out.println ("Square erase()");
 }
}
public class Shapes
 {
 public static Shape randshape()
 {
 switch((int)(Math.random()*3))
 {
 case 0: return new Circle();
 case 1: return new Square();
 case 2: return new Triangle();
 default : System.out.println("default");
 return new Shape();
 }
}
 public static void main (String arg[])
 {
 Shape s[] = new Shape[9];
 for(int i = 0;i< s.length; i++)
 s[i] = randshape();
 for(int i= 0;i < s.length; i++)
 s[i].draw();
 }
} 




Question7-- Write a Java program to give a simple example for abstract class


solution--

abstract class Shape{  
abstract void draw();  
}  
 
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  
class TestAbstraction1{  
public static void main(String args[]){  
Shape s=new Circle1();
s.draw();  
}  
}   





Question 8--- Write a Java program to give example for multiple inheritance in Java

Solution___

interface Car
{
    int  speed=60;
    public void distanceTravelled();
}
interface Bus
{
    int distance=100;
    public void speed();
}
public class Vehicle  implements Car,Bus
{
    int distanceTravelled;
    int averageSpeed;
    public void distanceTravelled()
    {
        distanceTravelled=speed*distance; 
        System.out.println("Total Distance Travelled is : "+distanceTravelled);
    }
    public void speed()
    {
        int averageSpeed=distanceTravelled/speed;
        System.out.println("Average Speed maintained is : "+averageSpeed);
    }
    public static void main(String args[])
    {
        Vehicle v1=new Vehicle();
        v1.distanceTravelled();
        v1.speed();
    }
}


Question 9--Write a Java program to create class Number with only one private instance variable as a double primitive type,
include the following methods isZero(), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong() in
this class and all above methods should return boolean primitive type like for isPositive() should return
“Positive = True”.

solution---

class Number 

{
 private double db1;
 private long lg;
 public Number ( )
 {
 db1 = 108.0d;
 lg = 249;
 }
public Number(double d, long l)
 {
 db1 = d;
 lg = 1;
 }
 public boolean isZero ( )
 {
 if (db1 == 0.0)
 return true;
 else
 return false;
 }
public boolean isPositive ( )
 {
 if(db1 > 0.0)
 return true;
 else
 return false;
 }
public boolean isNegative ( )
 {
 if (db1 < 0.0)
 return true ;
 else
 return false;
 }
public boolean isodd( )
 {
 if (db1 % 2 != 0.0)
 return true;
 else return false;
 }
public boolean isEven ( )
 {
 if (db1 % 2 == 0.0)
 return true ;
 else return false;
 }
public boolean isPrime ( )
 {
 int i, lastn;
 double a;
 boolean flag;
 a = Math.sqrt(lg);
 lastn = (int)a;
 flag = true;
 for (i=2; i<lastn; i++)
 {
 if (lg != i)
 {
 if( lg % i ==0)
 {
 flag = false;
 break;
 }
 }
 }
 if (flag)
 return true;
 else return false;
 }
public boolean isAmstrong ( )
 {
 if (db1 == 0.0)
 return true;
 else return false;
 } 
 
  public void dispBinary ( )
 {
System.out.println("ByteValue of lg :" + Long.toBinaryString(lg));
 }
public static void main (String args [ ])
 {
 Number mynum = new Number( );
 double d = 199;
 System.out.println(" The given numbers are 108.0d and 249");
 System.out.println ("isZero " + mynum.isZero() );
 System.out.println ("isPositive " + mynum. isPositive());
 System.out.println ("isNegative " + mynum.isNegative() );
 System.out.println ("isOdd " + mynum.isodd());
 System.out.println ("isEven " + mynum.isEven());
 System.out.println (" isPrime " +mynum.isPrime());
 System.out.println ("isAmstrong " + mynum.isAmstrong());
 
 }
} 
