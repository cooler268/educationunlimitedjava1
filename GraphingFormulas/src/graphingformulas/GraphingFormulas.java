/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingformulas;
public class GraphingFormulas {

    
    public static void main(String[] args) {
	
		//this part will test the functions
		System.out.println(" (0,-3) to (-1,-7) has slope " + slope(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has slope " + slope(2,8,4,-4) );
                
		System.out.println(" (0,-3) to (-1,-7) has distance " + distance(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has distance " + distance(2,8,4,-4) );
 
	}
 
    
        public static double slope( int x1, int y1, int x2, int y2 )
	{
            double m = (y2-y1)/(x2-x1);
            return m;
	}
        
	public static double distance( int x1, int y1, int x2, int y2 )
	{
            double xx = x2-x1;
            double yy = y2-y1;
            double d = Math.sqrt(Math.pow(xx,2) + Math.pow(yy,2));
            return d;
	}
}