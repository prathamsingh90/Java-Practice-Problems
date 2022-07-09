import java.util.Scanner;

public class FindWebsiteType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String website = input.next();

        if (website.contains(".org")){
            System.out.println("Organization Website");
        } else if (website.contains(".com")){
           System.out.println("Commercial Website");
        } else if(website.contains(".in")) {
            System.out.println("Indian Website");
        } else {
            System.out.println("Invalid Website");
        }
        input.close();
    }
    
}
