import java.util.*;
public class PrimeInDes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First how many prime numbers you want? ");
        int n = sc.nextInt();
        int primeCount = 0;
        for(int i=10; i<=Integer.MAX_VALUE && primeCount<n; i++){
            if(isPrime(i)==true){
                if(desDigit(i)==true){
                    System.out.println(i);
                    primeCount++;
                }
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

    public static boolean desDigit(int n){
        int min = 0;
        while(n>0){
            int rem = n%10;
            if(rem>=min){
                min = rem;
            }
            else{
                return false;
            }
            n = n/10;
        }
        return true;
    }
}
