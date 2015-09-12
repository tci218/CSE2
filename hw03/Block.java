//Trent Insull
//9/12/2015
//CSE03-310
//This program asks the user for the length, width, and height of a block
//and returns the volume and surface area of the block.

//import scanner
import java.util.Scanner;

public class Block{
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the length of the block: ");
        double length = myScanner.nextDouble();
        System.out.print("Enter the width of the block: ");
        double width = myScanner.nextDouble();
        System.out.print("Enter the height of the block: ");
        double height = myScanner.nextDouble();
        double volume = length*width*height;
        double surfaceArea = (2*(length*width))+(2*(width*height))+(2*(length*height));
        System.out.println("The volume of the block of dimensions "+ length+ " x "+width+" x "+height+" is "+ volume+".");
        System.out.println("The surface area of the block is "+surfaceArea+".");
    }
}