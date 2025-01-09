import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPalindrome(n);
    }
    public static void isPalindrome(int n){
        int rev = 0;
        int n1 = n;
        while(n>0){
            rev = rev*10 + (n%10);
            n = n/10;
        }
        if(rev==n1) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
