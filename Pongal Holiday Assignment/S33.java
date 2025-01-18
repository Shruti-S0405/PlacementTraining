import java.util.Scanner;

public class S33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int[] res = new int[6];
        System.out.println("The Even Indexed elements");

        for(int i=0; i<a.length; i++){
            if(i%2==0)
            System.out.println(a[i]  + " Index is : " + i);
        }
    }
}
