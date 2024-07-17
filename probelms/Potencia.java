public class Potencia {
    
public static void main(String[] args) {
    
    System.out.println(myPow(2.00000, -2147483648));

    
}

    
    public static double myPow(double x, int n){
       double result=1;

       int po=Math.abs(n);

       for(int i=0; i<po;i++){
        result *=x;

       }
       return n<0? 0/result: result;
    }
}
