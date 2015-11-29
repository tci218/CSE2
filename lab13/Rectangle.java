//Trent Insull
//CSE02-310
//This lab involves non-static methods.


//intialize class
public class Rectangle{
    //declare non static global variables
    double width;
    double height;
    
    //intialize method to take width
    public void setWidth(double w){
         width = w;
    }
    
    //initalize method to take height
    public void setHeight(double h){
         height = h;
    }
    
    //initialize method to get area
    public double getArea(){
        return width*height;
    }
    
    //initialize main method
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.setWidth(7.3);
        r1.setHeight(5.3);
        
        System.out.println(r1.getArea());
    }
    
    
    
}