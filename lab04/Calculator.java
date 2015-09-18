//Trent Insull
//9/18/2015
//CSE02-310
//The purpose of this program is to create a calculator which will ask the user for two integer
//inputs and an operator and then it will return the result

//import scanner
import java.util.Scanner;

//declare class
public class Calculator{
    //declare main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
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
        
    }
}