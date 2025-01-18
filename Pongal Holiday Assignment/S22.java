import java.util.Scanner;
public class S22{
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First half of the elements in the reverse direction ");
        for(int i=arr.length/2 -1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
        for(int i=arr.length/2; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
