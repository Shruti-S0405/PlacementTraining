import java.util.Scanner;

public class classprob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = checkAsc(n);
        System.out.println(res);
    }

    public static String checkAsc(int n){
        int last = n%10;
        n = n/10;
        int seclast =n%10;
        n = n/10;
        int thirdlast = n%10;
        
        if(thirdlast<seclast && seclast<last){
            return "YES";
        }
        return "NO";
    }
}
