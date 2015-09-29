//Trent Insull
//9/26/2015
//CSE002-310
// This program prompts user to input grades from 0 to 100 until
//the wish to end the loop at which point it returns the average of the grades

//import scanner
import java.util.Scanner;

//declare class
public class averageGrade{
    //declare main method
    public static void main(String[] args){
        //intiliaze scanner
        Scanner scan = new Scanner(System.in);
        
        
        //intiliaze variable to check whether user has entered 999
        boolean check = true;
        int grade;
        double total;
        double average;
        average = 0;
        total = 0;
        int i;
        i=0;
        
         //begin while loop to check whether user has entered 999 yet
        while(check == true){
            //ask user for grades
            System.out.print("Enter a grade between 0 and 100, when you finish entering grades type 999 ");
            //scan for grades
            grade = scan.nextInt();
            
            //check to see if grade is within acceptable range
            if (grade>-1 && grade<101){
                //add one to counter
                i++;
                //System.out.println(i);
                //if so, add grade to total
                total = total + grade;
                //System.out.println(total);
           
            }
            //check to see if user wishes to end loop
            if (grade==999){
                //if so compute and print out average
                average = total/i;
                System.out.println("The average of the grades is "+average);
                //set while loop checker to false
                 check = false;
            
            //check to see if grade is outside acceptable range
            }else  if(grade<0 || grade>100){
                //if so tell user grade entered is invalid
                 System.out.println("Invalid grade entered");
            }
            
          
            
        }
    }
}