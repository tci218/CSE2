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
        //print original array
         for(int j=0;j<array.length;j++){
           System.out.print(array[j]+" ");
       }
       
       System.out.println("");
        
        
        //ask user what value of index they would like to move
        System.out.println("What index would you like to move?");
        //try catch to check to see that index is within range of array
        try{
            move = scan.nextInt();
            //try and initialize a test variable which is set as array index user input
            int test = array[move];
        }catch(Exception e){
            System.out.println("1");
        }
        
        
        
       //create temporary array
       int[] temparray = new int [size];
       
      
       
       int save =array[move];
       for(int i=move;i<array.length-1;i++){
           array[i]=array[i+1];
       }
       array[array.length-1]=save;
       
/*
//for loop to fill temp array
       for(int i=0;i<move;i++){
           temparray[i]=array[i];
       }
//if else statements to check what bounds to use in for loops and to fill array
       if(array.length-move+1==array.length){
       for(int i=move;i<array.length-move;i++){
           if(i==array.length-1){
               temparray[i-1]=array[i];
           }else{
           temparray[i]=array[i+1];
           }
       }
       }else{
             for(int i=move;i<array.length-move+1;i++){
                 if(i==array.length-1){
                     temparray[i-1]=array[i];
                 }else{
           temparray[i]=array[i+1]; 
                 }
       }
       }
       */
       
       
       
       
       temparray[temparray.length-1]=array[move];
       
       
       
       for(int j=0;j<array.length;j++){
           System.out.print(array[j]+" ");
       }
       
       
       
       
       
       
        }catch(Exception e){
            //let user know input was invalid
            System.err.print(e);
        }
     
       
        
        
        
        }
        
    }
    


