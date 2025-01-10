import java.util.Scanner;

public class classprob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = checkAsc(n);
        System.out.println(res);
    }

    public static String checkAsc(int n){
        int max = 9;
        while(n>0){
            if(n%10<=max){
                max = n%10;
            }
            else{
                return "No";
            }
            n = n/10;
        }
        return "YES";
    }
}
