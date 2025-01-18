import java.util.*;
public class RightShiftByOneEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {2,5,7,3,4};
        int times = sc.nextInt();
        for(int j=0; j<times; j++){
            int temp = a[a.length-1];
            for(int i=a.length-1; i>0; i--){
                a[i] = a[i-1];
            }
            a[0] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
