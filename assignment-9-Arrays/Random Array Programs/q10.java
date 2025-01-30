import java.util.*;

public class q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        
        int[] a = new int[len];

        for(int i=0; i<len; i++){
            a[i] = sc.nextInt(); 
        }

        int min = Integer.MAX_VALUE;

        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                if(a[i]+a[j]<min){
                    min = a[i]+a[j];
                }
            }
        }

        System.out.println(min);
    }
}