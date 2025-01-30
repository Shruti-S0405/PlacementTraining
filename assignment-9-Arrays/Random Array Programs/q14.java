import java.util.*;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alen = sc.nextInt();
        int[] a = new int[alen];
        System.out.println("Enter A array elements");
        for(int i=0; i<alen; i++){
            a[i] = sc.nextInt();
        }

        int blen = sc.nextInt();
        int[] b = new int[blen];
        System.out.println("Enter B array elements");
        for(int i=0; i<blen; i++){
            b[i] = sc.nextInt();
        }

        for(int i=0; i<alen; i++){
            if(a[i]%2==1){
                for(int j=0; j<blen; j++){
                    if(a[i]==b[j]){
                        System.out.println(a[i]);
                    }
                }
            }
        }
    }
}
