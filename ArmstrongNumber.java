import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int exponent = order(number);
        double result = ifArmstrong(number, exponent);

        if (result == number){
            System.out.printf("%d is Armstrong number", number);
        } else {
            System.out.printf("%d is not Armstrong number", number);
        }
        input.close();
    }

    static int order(int number){
        int order_num = 0;

        while(number!=0){
            order_num++;
            number=number/10;
        }

        return order_num;
    }
    
    static double ifArmstrong(int number, int exponent){
        double sumOfNumbers=0;
        while(number!=0){
            int lastNum = number%10;
            number = number/10;
            sumOfNumbers += Math.pow(lastNum, exponent);
        }
        return sumOfNumbers;
    }
}
