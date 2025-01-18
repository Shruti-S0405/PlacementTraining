import java.util.*;
public class S24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 elements: ");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Even indexed elements of the array");
        for(int i=0; i<a.length; i++){
            if(i%2==0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
}
