import java.util.Arrays;
import java.util.Scanner;

public class S29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the first element: ");
        int a1 = sc.nextInt();
        int index1 = 0;
        System.out.println("Enter the Second element: ");
        int a2 = sc.nextInt();
        int index2 = 0;
        System.out.println("Before Swapping: "+Arrays.toString(a));
        for(int i=0; i<a.length; i++){
            if(a[i] == a1){
                index1 = i;
            }
            else if(a[i] == a2){
                index2 = i;
            } 
        }
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
        System.out.println("After Swapping: "+Arrays.toString(a));
    }
}
