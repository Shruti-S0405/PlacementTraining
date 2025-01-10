import java.util.Scanner;

public class classprob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        String res = checkAsc(arr);
        System.out.println(res);

    }

    public static String checkAsc(int[] a){
        for(int i=0; i<a.length-1; i++){
            if(!(a[i]<a[i+1])){
                return "No";
            }
        }
        return "Yes";
    }
}
