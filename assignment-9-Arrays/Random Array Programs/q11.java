import java.util.*;

public class q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        
        int[] a = new int[len];

        for(int i=0; i<len; i++){
            a[i] = sc.nextInt(); 
        }
        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                if(isPrime(a[i]) || isPrime(a[j])){
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }

    }

    public static Boolean isPrime(int a){
        int count = 0;
        for(int i=1; i<=a; i++){
            if(a%i==0){
                count++;
            }
        }
        return count==2;
    }
}