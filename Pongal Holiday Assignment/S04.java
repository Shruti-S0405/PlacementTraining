import java.util.*;
public class S04 {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        System.out.println("Maximum Element: "+ max);
        System.out.println("SecondMaximum: "+secMax);
    }    
}
