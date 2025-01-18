import java.util.*;
public class S05 {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<secMin && arr[i] != min){
                secMin = arr[i];
            }
        }
        System.out.println("Minimum Element: "+ min);
        System.out.println("SecondMinimum: "+secMin);
    }    
}
