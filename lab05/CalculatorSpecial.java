//Trent Insull
//9/25/2015
//CSE002-310
//The purpose of this program is to create a calculator which will ask the user for two integer
//inputs and an operator and then it will return the result. The calculator will then
//ask the user for input until they reply 'n' or "N" and the program will stop.


//import scanner
import java.util.Scanner;

//declare class
public class CalculatorSpecial{
    //declare main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        //intiliaze variable to check whether user has entered n or N
        boolean check = true;
        
        //begin while loop to check whether user has entered n or N yet
        while(check == true){
        
        
        //ask user for integers a and b
        System.out.print("Enter your first integer ");
        int a = myScanner.nextInt();
        System.out.print("Enter your second integer ");
        int b = myScanner.nextInt();
        //ask user for operator
        System.out.print("Enter the operator you would like to use ");
        String operator = myScanner.next();
        double result;
        
        //start switch statement
        switch(operator){
            //checks for operator
            //performs calculation for given operator
            //prints out result
            //checks for next case
            case "*":
                result = a*b;
                System.out.println("a*b= "+result);
                break;
            case "-":
                result = a-b;
                System.out.println("a-b= "+result);
                break;
            case "+":
                result = a+b;
                System.out.println("a+b= "+result);
                break;
            case "/":
                result = a/b;
                System.out.println("a/b= "+result);
                break;
            default:
                System.out.println("Illegal operator");
                break;
                
        }
        
        //ask user if they wish to stop
        System.out.print("Type n or N to stop ");
        //sets variable to user input
        String n = myScanner.next();
        //check to see if user types in n or N, if so exit program
        if(n.equals("n") || n.equals("N")){
            check = false;
        }
       
    }
}
}