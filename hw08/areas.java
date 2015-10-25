//Trent Insull
//CSE02-310
//This program computes the area of a circle, trapezoid, and rectangle and asks users for measurements
//of sides or radius in order to compute the values. Gives user the option to exit program
//at any time


//import scanner
import java.util.Scanner;

//declare class
public class areas{
    
    //declare circle area method
    public static void area(int r){
        //compute circle area
    //System.out.println(r*r);
       double area = (3.14159265359)*(r*r);
       //print out circle area
       System.out.println("The area of the circle is "+area);
    }
    
    //declare rectungular area method
    public static void area(int l, int w){
        //computer rectangle area
        double area = l*w;
        //print out rectangular area
        System.out.println("The area of the rectangle is "+area);
    }
    
    //declare trapezoid area method
    public static void area (int h, int b1, int b2){
        //computer trapezoid area
        double area = h*((b1+b2)/2);
        //print out trapezoid area
        System.out.println("the area of the trapezoid is "+area);
    }
    
    
    
    //declare main method
    public static void main(String[] args){
        //initialize scanner
        Scanner scan = new Scanner(System.in);
        
        //ask user for input
        System.out.println("What shape would you like to calculate the area for? enter 1 for circle, 2 for rectangle and 3 for trapezoid");
        //check what user input was
        int shape = scan.nextInt();
        //run through if statements to determine what shape user wants to compute area for
        if(shape == 1){
            //ask user for radius
            System.out.println("What is the radius of the circle? Enter 0 to exit program");
            //scan for input
            int r =scan.nextInt();
            //if statement to check if user wants to exit program
            if (r==0){
                
            }else{
            //call method
            area(r);
            }
        }else if(shape ==2){
            //ask user for length and width of rectangle
            System.out.println("What is the length and width of the rectangle? Enter 0 to exit program");
            //scan for inputs
            int l = scan.nextInt();
            int w = scan.nextInt();
            //if statement to check if user wants to exit program
            if (l==0||w==0){
                
            }else{
            //call method
            area(l,w);
            }
        }else if(shape == 3){
            //ask user for height and base 1 and base 2 of trapezoid
            System.out.println("What is the height, base 1, and base 2 of the trapezoid? Enter 0 to exit program");
            //scan for inputs
            int h = scan.nextInt();
            int b1 = scan.nextInt();
            int b2 = scan.nextInt();
            //if statement to check if user wants to exit program
            if (h==0||b1==0||b2==0){
                
            }else{
            //call method
            area(h,b1,b2);
        }
        
    }
    
}
}