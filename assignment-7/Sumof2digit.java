import java.util.Scanner;

public class Sumof2digit {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int third = n%10;
       n = n/10;
       int second = n%10;
       n = n/10;
       int first = n%10;
       
       if(first+second == third) System.out.println("Sum of 2 digit is last digit");
       else System.out.println("Sum of 2 digit is not last digit");
    }

}

