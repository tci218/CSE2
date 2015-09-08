//Trent Insull
//9/4/2015
//CSE02-310
//Arithmetic program to compute cost of items purchased including sales tax

public class Arithmetic{
    public static void main(String[] args){
     // initialize input variables
     
      //Tax rate
     double taxPercent=0.06;
     
     //Number of pairs of socks
     int nSocks=3;
     //Cost per pair of socks
     double sockCost$=2.58;
     double sockCostPreTax = sockCost$*nSocks;
     double sockTax1 = sockCostPreTax*taxPercent;
     //round sock tax to two decimals
     double sockTax = Math.round(sockTax1 * 100.0) / 100.0;
     double totalSockCost$=sockTax+sockCostPreTax;
     
     //Number of drinking glasses
     int nGlasses=6;
     //Cost per glass
     double glassCost$=2.29;
     double glassCostPreTax=glassCost$*nGlasses;
     double glassTax1=glassCostPreTax*taxPercent;
     //round glass tax to two decimals
     double glassTax = Math.round(glassTax1 * 100.0) / 100.0;
     double totalGlassCost$=glassTax+glassCostPreTax;
     
     
     //number of boxes of envelopes
     int nEnvelopes = 1;
     //Cost per box of envelops
     double envelopeCost$=3.25;
     double envelopeCostPreTax=envelopeCost$*nEnvelopes;
     double envelopeTax1=envelopeCostPreTax*taxPercent;
     //round envelope tax to two decimals
     double envelopeTax = Math.round(envelopeTax1 * 100.0) / 100.0;
     double totalEnvelopeCost$=envelopeCostPreTax+envelopeTax;
     
    //Compute total
    double totalCostPreTax = sockCostPreTax+glassCostPreTax+envelopeCostPreTax;
    double totalTax = sockTax+envelopeTax+glassTax;
    double totalCost = totalSockCost$+totalEnvelopeCost$+totalGlassCost$;
     

     
     
     //Print out iteam being bought, quantity and cost per item.
     System.out.println("You are buying "+nSocks+" socks at $"+sockCost$+" per sock");
     System.out.println("You are buying "+nGlasses+" glasses at $"+glassCost$+" per glass");
     System.out.println("You are buying "+nEnvelopes+" boxes of envelopes at $"+envelopeCost$+" per envelope");
     
     //Print out cost of each item and tax for each item.
     System.out.println("Cost of socks before tax is $"+sockCostPreTax+" and the sales tax is $"+sockTax);
     System.out.println("Cost of glasses before tax is $"+glassCostPreTax+" and the sales tax is $"+glassTax);   
     System.out.println("Cost of envelopes before tax is $"+envelopeCostPreTax+" and the sales tax is $"+envelopeTax);
        
     //Print out totals
     System.out.println("Total cost before taxes is $"+totalCostPreTax);
     System.out.println("Total sales tax is $"+totalTax);
     System.out.println("Total cost of purchases including tax is $"+totalCost);
        
    }
    
}