import java.util.*;
public class SumOfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First how many prime numbers you want? ");
        int n = sc.nextInt();
        int primeCount = 0;
        int sum = 0;
        for(int i=2; i<=Integer.MAX_VALUE && primeCount<n; i++){
            int count = 0;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(!(count>0)){
                primeCount++;
                sum += i;
            }
        }
        System.out.println("Sum of Prime Numbers: "+sum);
    }
}
