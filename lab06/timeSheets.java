//Trent Insull
//10/2/2015
//CSE02-310
//This program asks user for their payrate per hour in cents, how many hours
//each worker worked and then computes the total pay

//import scanner
import java.util.Scanner;

//declare class
public class timeSheets{
    //declare main method
    public static void main(String[] args){
         //intiliaze scanner
        Scanner scan = new Scanner(System.in);
        //ask user for how many employees they have
        System.out.println("Please enter how many employees are on your payroll");
        //scan for number of employees
        int i = scan.nextInt();
        //initialize total hours variable
        int total = 0;
        //initialize total pay variable
        int totalPay = 0;
        
        
        //start while loop
        while(i>0){
            //ask for payrate in cents per hour
        System.out.println("Please enter this employees payrate in cents per hour");
        //scan for payrate
        int payRate = scan.nextInt();
        //ask for hours worked each day and scan for that value
        System.out.println("Please enter hours worked by this employee on Monday");
        int mh  = scan.nextInt();
         System.out.println("Please enter hours worked by this employee on Tuesday");
        int th  = scan.nextInt();
         System.out.println("Please enter hours worked by this employee on Wednesday");
        int wh  = scan.nextInt();
         System.out.println("Please enter hours worked by this employee on Thursday");
        int thh  = scan.nextInt();
         System.out.println("Please enter hours worked by this employee on Friday");
        int fh  = scan.nextInt();
        //add up hours worked by this employee
        total = mh+th+wh+thh+fh;
        //calculate this employees pay
        int pay = total*payRate;
        //add this employees pay to total pay
        totalPay = totalPay+pay;
        //subtract one from employees left to calculate pay for
        i--;
        }
        //convert total pay into dollars from cents
        double finalPay = totalPay/100;
        System.out.println("Final pay for all employees is "+finalPay);
        
    }
}