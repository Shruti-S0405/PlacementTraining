import java.util.*;
public class pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(i==0||j==0||i+j==n-1) System.out.print(i+j+1);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
