import java.util.*;
public class Primebtw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int s = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int e = sc.nextInt();
        for(int i=s; i<e; i++){
            Boolean b = isPrime(i);
            if(b==true){
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
