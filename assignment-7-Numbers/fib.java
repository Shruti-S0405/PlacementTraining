import java.util.Scanner;
public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print("Fibanocci series "+ n1 +", "+ n2 +", ");
        for(int i=2; i<num; i++){
            int sum = n1+n2;
            System.out.print(sum +", ");
            n1 = n2;
            n2 = sum;
        }
        
    }
}
