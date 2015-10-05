//Trent Insull
//10/2/2015
//this program asks the user what size pyramid they want and
//then displays that size pyramid

//import scanner
import java.util.Scanner;

//declare class
public class pyramid{
    //declare main method
    public static void main(String[] args){
        //intialize scanner
        Scanner scan = new Scanner(System.in);
        //ask user how many layers they want in the pyramid
        System.out.println("How many layers should be in the pyramid?");
        //scan for how many layers user wants and store in variable
        int layers = scan.nextInt();
        
        
        //start while loop
        for(int i = 1; i <= layers; i++)
        {
            for(int s = layers-i; s > 0 ; s--){
               System.out.print(" ");
            }
            for(int j = i+(i-1); j > 0; j--)
            {
                System.out.print("*");
            
            }
            
            System.out.println("");
        }
        
    }
}