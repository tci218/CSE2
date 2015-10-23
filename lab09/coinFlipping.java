//Trent Insull
//10/23/2015
//CSE002-310
//purpose of this program is to simulate a random coin flipping in a method
//and another which does the same but also asks user for amount of times
//to flip the coin

//import scanner
import java.util.Scanner;
//import random number generator
import java.util.Random;

//declare class
public class coinFlipping{
    
    //declare first flip method
    public static void flip(){
        //get a random number, 0 or 1
        Random random = new Random();
        int flipped = random.nextInt(2);
        if (flipped==0){
            //if 0, return a tails
            System.out.println("tail "+flipped);
        }else if(flipped==1){
            //if 1, return a heads
            System.out.println("head "+flipped);
        }
    }
    
    
    //declare second flip method
    public static void flip(int n){
        //start counter to count heads and tails
        int counth = 0;
        int countt=0;
        //start for loop to run flips for n times
        for(int i=0;i<n;i++){
        //get a random number, 0 or 1
        Random random = new Random();
        int flipped = random.nextInt(2);
        if (flipped==0){
            //if 0, add to one to tails
            countt = countt+1;
        }else if(flipped==1){
            //if 1, add one to heads
            counth = counth+1;
        }
    }
    System.out.println("There were "+countt+" tails flipped and "+counth+" heads flipped");
    
    
    }
    
    
    
    
    
    //declare main method
    public static void main(String[] args){
        //run first flip method
        //flip();
        
        //ask user for input
        System.out.println("Eneter an integer between 0 and 100 for how many times you want to flip the coin");
        //initialize scanner
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //if n is greater then 100 end program
        if(n>100){
            //break;
        }else if (n == 0){
            //if n is 0 run first flip method
            flip();
        }else if(n<=100){
            //else if n is less then 100 but not 0 run second flip method
            flip(n);
        }
    }
    
}