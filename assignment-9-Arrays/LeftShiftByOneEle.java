import java.util.*;
public class LeftShiftByOneEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {2,5,7,3,4};
        int times = sc.nextInt();
        for(int j=0; j<times; j++){
            int temp = a[0];
            for(int i=1; i<a.length; i++){
                a[i-1] = a[i];
            }
            a[a.length-1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
