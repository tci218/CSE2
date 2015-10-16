public class ComputePi{
    public static void main(String[] args){
        double pi = 0;
        for (double p = 1; p<=5000; p = p+4){
            pi = pi + (1/p)-(1/(p+2));
            
        }
        System.out.println(4*pi);
    }
}