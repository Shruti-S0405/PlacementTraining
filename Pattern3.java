import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int count = 1;
            for(int j=1; j<=i*2-1; j++){
                System.out.print(count++);
            }
            System.out.println();
        }
    }
}
