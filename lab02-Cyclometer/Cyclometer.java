//Trent Insull
//9/4/2015
//CSE002-310
//Cyclometer is a program which records data on the time elapsed and number of rotations of a front wheel throughout a bicycle ride.
 public class Cyclometer{
     //main method
     public static void main(String[] args){
         //initialize variables
         //seconds in trip 1
         int secsTrip1=480;
         //seconds in trip 2
         int secsTrip2=3220;
         //counts in trip 1
         int countsTrip1=1561;
         //counts in trip 2
         int countsTrip2=9037;
         
         
         //initialize constant variables
         double wheelDiameter=27.0;
         double PI=3.14159;
         double feetPerMile=5280;
         double inchesPerFoot=12;
         double secondsPerMinute=60;
         double distanceTrip1;
         double distanceTrip2;
         double totalDistance;
         
         //Print out time of each trip and counts in each trip
         System.out.println("Trip 1 took "
          + (secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts");
          
          System.out.println("Trip 2 took "+ 
          (secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts");
          
          //run calculations and store data. Here we are calculating the distance of each trip.
          distanceTrip1=countsTrip1*wheelDiameter*PI;
          //gives distance in inches
          //for each count a rotation of the wheel travels the diameter*PI
          distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
          distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
          totalDistance=distanceTrip1+distanceTrip2;
          
          //Print out the distances
          System.out.println("Trip 1 was "+distanceTrip1+" miles");
          System.out.println("Trip 2 was "+distanceTrip2+" miles");
          System.out.println("The total distance was "+totalDistance+" miles");
          
          
         
         
     }
 }//end of class