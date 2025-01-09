import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of even digits: ");
        int n = sc.nextInt();
        int len = len(n);
        int mod = modValue(len);
        int n1 = firstHalf(n,mod);
        int rev = rev(n1);
        //Find the last half and append the rev of first half with the last half
        int n2 = n%mod;
        int res = rev*mod + n2;
        System.out.println("The resultant number is "+res);
    }

    // To find the length   
    public static int len(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }

    // To find the mod value based on the digits
    public static int modValue(int len){
        int mod = 1;
        for(int i=0; i<len/2; i++) mod = mod*10;
        return mod;
    }

    // To segregate the first half of the digits
    public static int firstHalf(int n, int mod){
        int n1 = n/mod;
        return n1;
    }

    //Reverse the first half digits
    public static int rev(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        return rev;
    }


}
