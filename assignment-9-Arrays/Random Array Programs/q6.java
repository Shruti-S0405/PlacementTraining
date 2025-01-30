import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1; i<=a; i++){
            b++;
        }

        System.out.println("Sum of 2 numbers : "+ b);
    }
}
