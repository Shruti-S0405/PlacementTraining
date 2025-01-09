import java.util.*;
public class Before10Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Immediately before? ");
        int s = sc.nextInt();
        System.out.print("Till? ");
        int e = sc.nextInt();
        int i = s;
        while(i<e){
            Boolean b = isPrime(i-1);
            if(b==true) System.out.print(i-1 + " ");
            i = i+10;
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
