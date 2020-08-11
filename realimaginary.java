/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class realimaginary {
      public static void main(String[] args) {
            complex s=new complex();
            int a1,a2,b1,b2;
            System.out.println("enter the value of a1,a2,b1,b2:");
            Scanner obj=new Scanner(System.in);
            a1=obj.nextInt();
            a2=obj.nextInt();
            b1=obj.nextInt();
            b2=obj.nextInt();
            s.add( a1, a2, b1, b2);
            s.sub(a1,a2,b1,b2);
            s.mul(a1,a2,b1,b2);
            s.div(a1,a2,b1,b2);
            
            
    }
}
            
class complex { int i;
    void add(int a1 , int a2 , int b1  ,int b2  )
    {
       int c=a1+a2;
       int d=b1+b2;
       System.out.println("Addition"+c+"+i"+d);
    }
    void sub(int a1, int a2, int b1, int b2)
    {
        int c=a1-a2;
        int d=b1-b2;
        System.out.println("Subtraction"+c+"+("+d+"i)");
    }
    void mul(int a1, int a2, int b1,int b2)
    {
    
        int c=(a1*a2)-(b1*b2);
        int d=(b1*a2)+(b2*a1);
        System.out.println("Multiplication"+c+"+"+d+"i");
        
     }
    void div(int a1,int a2, int b1,int b2)
    {
        double c=(a1*a2)+(b1*b2);
        double d=(b1*a2)-(a1*b2);
        double m=(a2*a2)+(b2*b2);
        //int c
        System.out.println("Division"+c/m+"+"+d/m+"i");
        
     }
   
 }
    
            
            
          
    

