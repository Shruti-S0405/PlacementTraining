import java.util.Scanner;
public class AvgInArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 elements: ");
        int sum = 0;
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println(sum);
        int avg = sum/a.length;
        System.out.println(avg);
    }
}


