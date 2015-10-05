//Trent Insull
//CSE2-310
//10/5/2015
//This program computes the sum of the harmonic series where n=50000
//from left to right as well as right to left

//declare class
public class HarmonicSum{
    //declare main method
    public static void main(String[] args){
        //declare variables
        int n = 1;
        double total = 0;
        //start for loop
        if(n<=50000){
            total += (1/n);
            n++;
        }
        System.out.println("from left to right " +n);
        
        
        
         //declare variables
        int b = 50000;
        double totalb = 0;
        //start for loop
        if(b>=1){
            totalb += (1/b);
            b--;
        }
        System.out.println("from right to left " +b);
    }
}