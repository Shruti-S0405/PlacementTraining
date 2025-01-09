import java.util.Scanner;

public class FirstSecRev {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();


        long div = pow(digit(num));
        long first = num/div;
        long second = num%div;
        long result = second*div +first;
        System.out.println(digit(num));
        System.out.println(pow(digit(num)));
        System.out.println(first);
        System.out.println(second);

        System.out.println(result);
    }

    public static long digit(long num){
        long count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }

    public static long pow(long a){
        long res=1;
        for(long i=0; i<a/2; i++){
            res *= 10;
        }
        return res;
    }
}
