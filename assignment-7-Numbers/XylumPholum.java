public class XylumPholum {
    public static void main(String[] args) {
        int a = 12322;
        int len = len(a);

        int firsthalf = a/mul(a,len);
        int secHalf = a%mul(a,len);

        if(isDes(secHalf) && isAsc(firsthalf)) System.out.println("Xylum");
        else System.out.println("Pholum");

    }

    public static int len(int n){
        int len = 0;
        while(n>0){
            len++;
            n = n/10;
        }
        return len;
    }

    public static int mul(int n, int len){
        int mul = 1;
        for(int i=0; i<len/2; i++){
            mul *= 10;
        }
        return mul;
    }

    public static Boolean isDes(int n) {
        int min = 0;
        while(n>0){
            int rem = n%10;
            if(rem>=min) min = rem;
            else return false;
            n = n/10;
        }
        return true;
    }

    public static Boolean isAsc(int n) {
        int max = 9;
        while(n>0){
            int rem = n%10;
            if(rem<=max) max = rem;
            else return false;
            n = n/10;
        }
        return true;
    }
}
