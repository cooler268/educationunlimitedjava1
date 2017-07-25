/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booleans;

/**
 *
 * @author Education Unlimited
 */
public class Booleans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int x,y;
        boolean a,b,c,d,e,f;
        x=7;
        y=9;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        
        //== means check equals
        //!= means not equals
        //> means greater than
        //< means less than
        //>= means greater than or equal to
        //<= means less than or equal to
        
        String s1 = "Good Morning";
        String s2 = "Hi there!";
        String s3 = "Howdy, partner!";
        
        "Good Morning".equals("Good Morning");
        "Hi there!".compareTo("Good Morning");
        "Good Morning".compareTo("Howdy, partner!");
        
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 && b2);
        System.out.println(b1 && b1);
        System.out.println(b1 || b1);
        System.out.println(b1 || b2);
        System.out.println(b2 && !b1);
        
        x=10;
        y=56;
        a=x==y;
        b=x>=y;
        c=x<=y;
        d=x>y;
        e=x<y;
        f=x!=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
    }
    
}
