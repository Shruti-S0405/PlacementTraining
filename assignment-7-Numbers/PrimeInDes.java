import java.util.*;
public class PrimeInDes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First how many prime numbers you want? ");
        int n = sc.nextInt();
        int primeCount = 0;
        for(int i=2; i<=Integer.MAX_VALUE && primeCount<n; i++){
            Boolean b = isPrime(i);
            if(b==true){
                primeCount++;
                if(i<10){
                    System.out.print(i+" ");
                }
                else{
                    int len = len(i);
                    int res = desDigit(i, len);
                    System.out.print(res+" ");
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

    public static int desDigit(int n, int len){
        int res = 0;
        if(len==2){
            int second = n%10;
            n = n/10;
            int first = n%10;
            if(first>second) res = first*10 + second;
            else res = second*10 + first;
        }
        else if(len==3){
            int third = n%10;
            n = n/10;
            int second = n%10;
            n = n/10;
            int first = n%10;
            int max1 = max(first,max(second,third));
            int max2 = 0;
            if(max1 == first) max2 = max(second,third);
            if(max1 == second) max2 = max(first,third); 
            if(max1 == third) max2 = max(first, second);
            int max3 = 0;
            if(max1 == first && max2 == second || max2 == first && max1 == second) max3 = third;
            if(max1 == second && max2==third || max2 == second && max1==third ) max3 = first; 
            if(max1 == third && max2 == first || max2 == third && max1 == first) max3 = second;
            res = max1*100 + max2*10 + max3;      
        }
        return res;


    }

    //Max of 2 numbers
    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    // To find the length   
    public static int len(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
}
