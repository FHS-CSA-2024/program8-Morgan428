package main.java;
import java.util.Scanner;
//import stuff here

//Your code here

public class Program7{
    //Define your final variables here
    // **HINT: Maybe the conversion rates?????**
    public static void main(String[] args){
        //Make you own test code here
        Program7 tester = new Program7();
        
        double myTestVal = 0.0;
        
        myTestVal = tester.convertMoney(0,0,0);
        
        System.out.println(myTestVal);
    }
    
    public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        // The user will input the following three
        Scanner s = new Scanner(System.in);
        //
        System.out.println("Enter Schrute-bucks");
        int sBuck = s.nextInt();
        //
        System.out.println("Enter Klevins");
        int kle = s.nextInt();
        //
        System.out.println("Enter Stanley-nickels");
        int sNic = s.nextInt();
        //
        double sNicTemp = 0; // temporaly holding the value of new Stanley-nickels before they get turned into a int int insted of a double
        final double sNicCon = 2.4; // for converting old Stanley-nickels to new Stanley-nickels
        if (kle == 0){
            sNicTemp = sNic * sNicCon;
            sNic = (int)sNicTemp; // remove "."'s
        }
        else {
            int sNicOLd = kle * 12;
            sNicTemp = (sNicOLd + sNic) / sNicCon;
            sNicTemp = Math.round(sNicTemp);
            sNic = (int)sNicTemp; // remove "."'s
        }
        if (sNic >= 100){
            sBuck = sNic / 100 + sBuck;
            sNic = sNic % 100;
        }
        else {
        sNic = sNic / 10;
        }
        System.out.println(sBuck + "." + sNic);
        return 0;
    }
    
    
}
