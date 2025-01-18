import java.util.Scanner;
public class S06{
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of all the elements: "+ sum);
        System.out.println("Average of all the elements: "+ sum/arr.length);
    }
}