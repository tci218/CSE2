//Trent Insull
//9/11/2015
//CSE02-310
//this program prompts user for the current time, what time they are having dinner, and then
//tells them how long they have until dinner

import java.util.Scanner;

public class Timer{
    public static void main(String[] args){
        //scan for user input
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter current time in form HHMM: ");
        int current = myScanner.nextInt();
        System.out.print("Enter when you will eat dinner in form HHMM: ");
        int dinner = myScanner.nextInt();
        int difference = dinner - current;
        int hours = (difference / 100)%10;
        int minutes = (difference-(hours*100));
        System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner.");   
        }
}