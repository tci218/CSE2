//Trent Insull
//CSE002-310
//Lab12
//this program shifts values at a specific index to the end of the array

//import scanner
import java.util.Scanner;

//initialize class 
public class move_array{
    //intialize main method
    public static void main(String[] args){
         //initialize scanner
        Scanner scan = new Scanner(System.in);
        
        int[] array;
        int move=4;
        
        
        //ask user for size of array
        System.out.println("What size would you like the array to be?");
        //scan for user input size
        int size = scan.nextInt();
        //try catch to make sure user input of array size >0
        try{
            //check to make sure size is non negative and nonzero
            int check =(int) (Math.sqrt(9/size));
            
             //create array
        array = new int [size];
        
        //fill array with random values using for loop
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        
        
        //ask user what value of index they would like to move
        System.out.println("What index would you like to move?");
        //try catch to check to see that index is within range of array
        try{
            move = scan.nextInt();
            //try and initialize a test variable which is set as array index user input
            int test = array[move+1];
        }catch(Exception e){
            System.err.print(e);
        }
        
        
        
       //create temporary array
       int[] temparray = new int [size];
       
       //for loop to fill temp array
       for(int i=0;i<move-1;i++){
           temparray[i]=array[i];
       }
       for(int i=move;i<array.length-move-1;i++){
           temparray[i]=array[i+1];
       }
       temparray[temparray.length]=array[0];
       
       
       
       for(int j=0;j<array.length;j++){
           System.out.print(temparray[j]+" ");
       }
       
       
       
       
       
       
        }catch(Exception e){
            //let user know input was invalid
            System.err.print(e);
        }
     
       
        
        
        
        }
        
    }
    
