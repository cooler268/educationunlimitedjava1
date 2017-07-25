/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.operations;

/**
 *
 * @author Education Unlimited
 */
public class MathOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int p,q,r,s,t,u;
          double a,b,c;
          String first, second, together;
 
          p = 8;
          q = 25;
         System.out.println( "p is " + p + ", q is " + q );
 
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
        
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         System.out.println();
         
         p = 10;
         r = 8;
         System.out.println( "p is " + p + ", r is " + r );
         
         q = p - r;
         System.out.println( "p-r is " + q );
         t = p + r;
         System.out.println( "p+r is " + t);
         p+=4;
         r-=6;
         u = p*r/2;
         System.out.println( "p*r is " + u);
         s = p/2;
         System.out.println( "p/2 is " + s);
         a = p*r/6;
         System.out.println( "p*r/6 is " + a);
         
         
         first = "peanut butter";
         second = " and jelly";
         together = first + second;
         System.out.println( together );
     }
}
    
    

