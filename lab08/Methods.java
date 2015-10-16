//Trent Insull
//CSE002-310
//This program calculates the mean and median for ten numbers
//the user inputs and then returns them using methods

//import scanner class
import java.util.Scanner;

import java.util.Arrays;

//declare main class
public class Methods{
    //declare method to calculate mean
    public static double mean(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j){
        //calculate mean
        return (a+b+c+d+e+f+g+h+i+j)/10;
    }
    //declare method to calculate median
    public static double median(double e, double f){
        //System.out.print(e+" "+f);
        //calculate median
       double median = (e+f)/2;
       return median;
      
    }
    //declare print method
    public static void print(double a, double b){
        //print out mean and median
        System.out.println("Mean is "+ a+" and median is "+b);

    }
    //declare main method
    public static void main(String[] args){
        //scan for inputs
        Scanner scan = new Scanner(System.in);
        //ask user for 10 numbers
        System.out.println("Enter 10 numbers");
        //scan for user input
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();
        double d = scan.nextInt();
        double e = scan.nextInt();
        double f = scan.nextInt();
        double g = scan.nextInt();
        double h = scan.nextInt();
        double i = scan.nextInt();
        double j = scan.nextInt();
        
        
        //set mean and median variables
        double mean1 = mean(a,b,c,d,e,f,g,h,i,j);
        double median1 = median(e,f);
        
        //call print method to print out final values
        print(mean1, median1);
    }
    
}