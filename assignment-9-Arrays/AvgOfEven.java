import java.util.*;
public class AvgOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 elements: ");
        int sum = 0;
        int count = 0;
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
            if(i%2==0){
                count++;
                sum += a[i];
            }
        }
        System.out.println("Avg of Even Indexed numbers in the Array: "+ sum/count);
    }
}
