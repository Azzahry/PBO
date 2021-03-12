
package tugasobjectoriented;

import java.util.Scanner;

public class GallonToLiter {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int gallon = 0;
       
       System.out.print("Enter the gallons : ");
       gallon = input.nextInt();
       double liters = gallon * 3.785;
       System.out.println("Liters : " +liters);
    }
    
}
