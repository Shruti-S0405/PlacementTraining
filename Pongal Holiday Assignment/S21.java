import java.util.Scanner;
public class S21{
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements in the array in the Reverse Order ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
