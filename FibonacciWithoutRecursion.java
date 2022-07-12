import java.util.Scanner;

public class FibonacciWithoutRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terms = input.nextInt();
        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int index = 3; index <= terms; index++) {
            int nextTerm = a+b;
            System.out.println(nextTerm);
            a=b;
            b=nextTerm;
        }
        input.close();
    }
}
