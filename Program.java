import java.util.Scanner;
//Class name should match file name (Pretend that the file is named Program8.java)
public class program8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first int: ");
        final int inA = scan.nextInt();
        System.out.println("Enter last int: ");
        final int inB = scan.nextInt();
        final int sum = inA + inB;
        final int dif = inA - inB;
        final int pro = inA * inB;
        final double ave = (inA + inB) / 2.0;
        final int dis = Math.abs(dif);
        final int max = (-(inA - inB) + inA + inB) / 2;
        final int min = ((inA - inB) + inA + inB) / 2;
        
        System.out.println("Original numbers are " + inA + " and " + inB);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + dif);
        System.out.println("Product = " + pro);
        System.out.println("Average = " + ave);
        System.out.println("Distance = "  + dis);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
//Paste console output below:
/*
Enter first int: 
13
Enter last int: 
20
Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Distance = 7
Max = 20
Min = 13
*/
