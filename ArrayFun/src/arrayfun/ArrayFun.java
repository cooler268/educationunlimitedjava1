package arrayfun;

public class ArrayFun {

    public static void main(String[] args) {
        int[] array1 = new int [10];
        
        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 5;
        array1[3] = 7;
        array1[4] = 9;
        array1[5] = 11;
        array1[6] = 13;
        array1[7] = 15;
        array1[8] = 17;
        array1[9] = 19;
        
        System.out.println("The element at index " + 0 + "is " + array1[0]);
        System.out.println("The element at index " + 1 + "is " + array1[1]);
        System.out.println("The element at index " + 2 + "is " + array1[2]);
        System.out.println("The element at index " + 3 + "is " + array1[3]);
        System.out.println("The element at index " + 4 + "is " + array1[4]);
        System.out.println("The element at index " + 5 + "is " + array1[5]);
        System.out.println("The element at index " + 6 + "is " + array1[6]);
        System.out.println("The element at index " + 7 + "is " + array1[7]);
        System.out.println("The element at index " + 8 + "is " + array1[8]);
        System.out.println("The element at index " + 9 + "is " + array1[9]);
        
        double[] array2 = new double [10];
        
        int index = 0;
        while (index<15) {
           array2[index] = 1.25;
           System.out.print("The element at index " + index + " is " + array2[index]);
           
           
        }
    }
    
}
