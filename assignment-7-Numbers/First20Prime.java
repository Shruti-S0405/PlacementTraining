import java.util.*;
public class First20Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First how many prime numbers you want? ");
        int n = sc.nextInt();
        int primeCount = 0;
        for(int i=2; i<=Integer.MAX_VALUE && primeCount<n; i++){
            System.out.println(Integer.MAX_VALUE);
            Boolean b = isPrime(i);
            if(b==true){
                primeCount++;
                System.out.print(i+" ");
            }
        }

    }
    public static boolean isPrime(int n){
        int count = 0;
        for(int i=2; i<n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(!(count>0)){
            return true;
        }
        return false;
    }
}
