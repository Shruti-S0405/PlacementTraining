import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The output is: "+ isOrder(a));
    }

    public static int isOrder(int[] a){
        for(int i=0; i<a.length-1; i++){
            if(a[i]>a[i+1]){
                return a[i+1];               
            }
        }
        return -1;
    }
}
