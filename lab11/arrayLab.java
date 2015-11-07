//Trent Insull
//11/6/2015
//CSE02-310
//This program 



//import java array
import java.util.Arrays;
//import org.apache.commons.lang.ArrayUtils;

//declare class
public class arrayLab{
    
    
    //declare sort method
    public static void sort(int[] array){
       
        Arrays.sort(array);
    }
    
    //declare main method
    public static void main(String[] args){
        
        
         //create array of size 20
        int[] array1 = new int [20];
        //for loop to fill array values
        for(int i = 0;i<array1.length;i++){
            //fill array with random values between 0 and 100
            array1[i]=(int)(Math.random()*100.00);
        }
        
        //sort array1
       // int[] sarray1=new int[20];
        ////sarray1=sort(array1);
        
        
        
             //create array of size 10
        int[] array2 = new int [10];
        //for loop to fill array values
        for(int i = 0;i<array2.length;i++){
            //fill array with random values between 0 and 100
            array2[i]=(int)(Math.random()*100.00);
        }
        //sort array2
        // int[] sarray2=new int[10];
       // sarray=sort(array2);
        
        //create array of size 30
        int[] array3 = new int [30];
        //insert values of array1 into array3
        System.arraycopy(array1,0,array3,0,20);
        //insert values of array2 into array3
        System.arraycopy(array2,0,array3,20,10);
        //sort array3
        sort(array3);
        //print out sorted values of array3
        for(int i=0;i<array3.length;i++){
            System.out.println(array3[i]);
        }
        
    }
    
}