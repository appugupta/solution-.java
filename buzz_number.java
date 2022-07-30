/import required classes and packages  
import Java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  
class BuzzNumberExample {   
    
    static boolean checkNumber(int number)   
    {   
        if(number % 10 == 7 || number % 7 == 0)  
            return true;    //returns true when the number is Buzz  
        else  
            return false;   //returns flase when the number is not Buzz  
    }   
    
    public static void main(String args[])   
    {     
        int n1, n2;  
          
        Scanner sc=new Scanner(System.in);  
          
        System.out.println("Enter first number");  
          
        n1 = sc.nextInt();  
          
        System.out.println("Enter second number");  
          
        n2 = sc.nextInt();  
          
        if (checkNumber(n1))   
            System.out.println(n1 + " is a Buzz number");   
        else  
            System.out.println(n1 + " is not a Buzz number");   
        if (checkNumber(n2))   
            System.out.println(n2 + " is a Buzz number");   
        else  
            System.out.println(n2 + " is not a Buzz number");   
    }   
}   
