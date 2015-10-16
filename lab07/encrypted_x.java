//Trent Insull
//10/9/2015
//CSE002-310
//This program asks user for an input between 0 and 100 and create
//a square of that size and then hide the ltter X by surrounding it with *s

//import scanner
import java.util.Scanner;

//declare class
public class encrypted_x{
    //declare main method
    public static void main(String[] args){
        //ask user for input
        System.out.println("Please enter and integer between 0 and 100");
        //initialize scanner
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input<0 || input>100){
            System.out.println("Input is invalid");
            System.exit(-1);
        }else{
            for(int i = 0;i<input;i++){
                for (int j = 0;j<input;j++){
                    if(i==j){
                        System.out.print(" ");
                    }else if (i==(input-j)){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
        }
        
        
        
    }
}