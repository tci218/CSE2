//Trent Insull
//9/11/2015
//CSE02-310
//This program takes in user inputs of total check, tip percentage, and how many ways the check
//is to be split and then splits the check.

import java.util.Scanner;

public class Check{
    public static void main (String[] args){
    //scan for user input
    Scanner myScanner = new Scanner( System.in );
    //ask user for input
    System.out.print("Enter the original cost of the check in the form xx.xx: ");
    double checkCost = myScanner.nextDouble();
    //ask for tip percentage user wishes ot pay
    System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
    double tipPercent = myScanner.nextDouble();
    //convert percentage into decimal value
    tipPercent /= 100;
    //ask for how many people went to dinner
    System.out.print("Enter the number of people who went out to dinner: ");
    int numPeople = myScanner.nextInt();
    double totalCost;
    double costPerPerson;
    //whole dollar amount of cost
    int dollars; 
    //int for digits to right of decimal place
    int dimes;
    int pennies; 
    //calculate total cost
    totalCost = checkCost * (1 + tipPercent); 
    //calculate cost per person
    costPerPerson = totalCost / numPeople;
    //get whole amount, drop decimal fraction
    dollars = (int)costPerPerson;
    dimes = (int)(costPerPerson * 10) % 10;
    pennies = (int)(costPerPerson * 100) % 10;
    System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);
    }
}