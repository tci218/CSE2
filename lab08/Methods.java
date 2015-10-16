//Trent Insull
//CSE002-310
//This program calculates the mean and median for ten numbers
//the user inputs and then returns them using methods

//import scanner class
import java.util.Scanner;

//declare main class
public class Methods{
    //declare method to calculate mean
    public static double Mean(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){
        //calculate mean
        return (a+b+c+d+e+f+g+h+i+j)/10;
    }
    //declare method to calculate median
    public static double Median(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){
        //calculate median
        return (e+f)/2;   
    }
    public static void print(double a, double b){
        System.out.println("Mean is "+ a+" and median is "+b);

    }
    //declare main method
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        int g = scan.nextInt();
        int h = scan.nextInt();
        int i = scan.nextInt();
        int j = scan.nextInt();
        
        double mean = Mean(a,b,c,d,e,f,g,h,i,j);
        double median = Median(a,b,c,d,e,f,g,h,i,j);
        
        
        print(mean, median);
    }
    
}