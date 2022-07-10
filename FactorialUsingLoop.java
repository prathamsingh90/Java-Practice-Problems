import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        findFactorial(n);
        input.close();
    }

    static void findFactorial(int n){
        int factorial=1;
        while(n>1){
            factorial*=n;
            n--;
        }
        System.out.println("The factorial for given number is " + factorial);
    }
}
