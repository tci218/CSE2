//Trent Insull
//10/30/2015
//CSE02-310
//this program asks the users for the size of the array, creates the array, fills loop with random numbers between
//0 and 100, prints out sum and average of the array and also prints out values greater then or equal to the average.


//import scanner
import java.util.Scanner;

//declare class
public class averageArrays{
    //declare main method
    public static void main(String[] args){
        //initialize scanner
        Scanner scan = new Scanner(System.in);
        //ask user how many values are to be in the array
        System.out.println("How many values are to be stored in the array?");
        //scan for user input
        int size = scan.nextInt();
        //create array of that size
        int[] array = new int [size];
        //System.out.println(array);
        //start for loop to fill up array
        for(int i=0;i<size;i++){
            //assign i'th value of array a random number between 0 and 100
            array[i]= (int)(Math.random()*100.00);
        }
        
        //start loop to print out all values
        for(int j=0;j<size;j++){
            //print out i'th value of array at that i
            System.out.println(array[j]);
        }
        System.out.println();
        
        //intilialize total counter
        int total = 0;
        //intialize average
        int average = 0;
        //start for loop to computer sum and average
        for(int i =0;i<size;i++){
            total +=array[i];
        }
        //compute average
        average = total/size;
        //print out average and sum
        System.out.println("The sum of the numbers in the array is "+total+" and the average is "+average);
        System.out.println();
        
        System.out.println("The values in the array greater than or equal to the average is:");
        //start for loop to print values greater than or equal to average
        for(int i = 0;i<size;i++){
            if(array[i]>=average){
                System.out.println(array[i]);
            }
        }
        
    }
}