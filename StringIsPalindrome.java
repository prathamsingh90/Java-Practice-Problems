import java.util.Scanner;

public class StringIsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int start = 0;
        int end = str.length()-1;
        boolean isPalindrome=true;

        while(end>=start){
            if ((str.charAt(start))==(str.charAt(end))) {
                start++;
                end--;
            } else {
                isPalindrome=false;
                break;
            }
        }

        if (isPalindrome==true){
            System.out.println("String is palindrome");
        } else {  
            System.out.println("String is not palindrome");
        }

        input.close();
    }
}
