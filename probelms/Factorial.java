public class Factorial {
    
public static int facto(int n){
    return (n==0)? 1 :n*facto(n-1);

}
public static void main(String[] args) {
    int num = 2;
    System.out.println("Factorial of " + num + " is: " + facto(num));
}

}
