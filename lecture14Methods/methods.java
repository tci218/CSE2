public class methods{
    public static void hw(){
           System.out.println("Hello world!");
    }
    public static void add(int a, int b){
        int c;
        c = a + b;
        return c;
    }
    public static void main(String[] args){
        hw();
        System.out.println("add="+ add(3,8));
    }
}