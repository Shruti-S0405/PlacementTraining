import java.util.*;

public class q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        
        int[] a = new int[len];

        for(int i=0; i<len; i++){
            a[i] = sc.nextInt(); 
        }

        int target = sc.nextInt();

        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                if(a[i]+a[j]>target){
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }
}