import java.util.Scanner;
public class S23{
    public static void main(String[] args){
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second half of the elements in the reverse direction");
        for(int i=0; i<arr.length/2; i++){
            System.out.print(arr[i]+ " ");
        }
        for(int i=arr.length-1; i>=arr.length/2; i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
