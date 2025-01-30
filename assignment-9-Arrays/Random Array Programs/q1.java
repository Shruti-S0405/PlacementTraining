import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];
        for(int i=0; i<len; i++){
            a[i] = sc.nextInt();
        }
        int min = min(a);
        int max = max(a);
        // int count = 0;
        // int[] res = new int[(max-min)-1];
        // int index = 0;

        // for(int i=min+1; i<max; i++){
        //     res[index++] = i;
        // }
 
        // for(int i=0; i<a.length; i++){
        //     for(int j=0; j<res.length; j++){
        //         if(a[i]==res[j]) count++;
        //     }
        // }

        // System.out.println(res.length - count);
        int count = 0;
        for(int i=min+1; i<max; i++){
            boolean flag = false;
            for(int j=0; j<a.length; j++){
                if(a[j]==i) flag=true;
            }
            if(flag){

            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }

    public static int min(int[] a){
        int m = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++){
            if(a[i]<m){
                m = a[i];
            }
        }
        return m;
    }

    public static int max(int[] a){
        int m = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++){
            if(a[i]>m){
                m = a[i];
            }
        }
        return m;
    }
}
