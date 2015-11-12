//Trent Insull
//CSE002-310
//11/7/2015
//this program asks user for size of board, number of mines to be placed
// and places mines around board and then checks to see how many mines
//contained in adjacent cells


//import scanner
import java.util.Scanner;

//declare class
public class MineSweeper{
    //declare main method
    public static void main(String[] args){
        //initialize scanner
        Scanner scan = new Scanner(System.in);
        //ask user to enter size of board
        System.out.println("Please enter an integer between 2 and 30 for the size of the board");
        //scan for user input
        int n = scan.nextInt();
        
        
        //int[][] board = new int[2][2];
        
        //check to see if n is within bounds of 2 and 30
        if(n<2 ||n>30){
            System.out.println("invalid input");
        }else{
            
            
            
        //create array of size NxN
        char[][] board = new char[n][n];
           //ask user for number of mines to be placed on board
        System.out.println("Enter number of mines to be placed on board");
        //scan for user input
        int m = scan.nextInt();
        
        
        
        //check to see m is within bounds
        if(m<1 || m>n*n){
            System.out.println("invalid input");
        }else{
            //for loop to place mines
            for(int i =0;i<m;i++){
                //set random x and y values
                int x=(int)(Math.random()*n);
                int y=(int)(Math.random()*n);
                //check to see if mine is already in cell
                if(board[x][y]!='M'){
                    board[x][y]='M';
                }else{
                 //if already mine, do nothing
                }
            }
            
            
            //for loop to fill empty cells with 0 as a space holder
             for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    //check to see if not mine
                    if(board[i][j]=='M'){
                        //if mine do nothing
                }else{
                    //if not mine fill with 0 to indicate empty cell
                    board[i][j]='0';
                }
            
            }
            }
            
            
            //for loop to go through cells on board and count mines in adjacent cells
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    //intialize counters
                        int count1=0;
                        int count2=0;
                        int count3=0;
                        int count4=0;
                        
                    
                    //if mine in cell
                    if(board[i][j]=='M'){
                      //try catch statements to check M's and adjacent indices
                      //check to make sure adjacent indices aren't M's
                      //convert chars to ints for counters
                      //add to counter if adjacent to mine
                      //convert ints back to chars to print out
                      //use try catch methods to make sure program works
                      try{
                        if(board[i+1][j]=='M'){
                            
                        }else{
                        count1=(int)board[i+1][j];
                        count1=count1+1;
                        board[i+1][j]=(char)count1;
                        }
                      }catch(Exception e){
                          
                      }
                      try{
                          if(board[i-1][j]=='M'){
                           
                        }else{
                        count2=(int)board[i-1][j];
                        count2=count2+1;
                        board[i-1][j]=(char)count2;
                        }
                      }catch(Exception e){
                          
                      }
                      try{
                          if(board[i][j+1]=='M'){
                            
                        }else{
                        count3=(int)board[i][j+1];
                        count3=count3+1;
                        board[i][j+1]=(char)count3;
                        }
                      }catch(Exception e){
                          
                      }
                      try{
                          if(board[i][j-1]=='M'){
                            
                        }else{
                        count4=(int)board[i][j-1];
                        count4=count4+1;
                        board[i][j-1]=(char)count4;
                        }
                      }catch(Exception e){
                          
                      }
                        
                        
                        
                        
                        
                }
            
            }
            }
            
            
            
            
            //print out board
            for(int k=0;k<n;k++){
                for(int j=0;j<n;j++){
                    System.out.print(board[k][j]+" ");
                }
                System.out.println();
            }
            
            
            
        }
        
        
        
        
        
        
        }
        
        
        
 
        
        
    }
    
    
    
}
