public class Q1 {
    public static void main(String[] args) {
        int a[] = {2,3,4,5,6,7,8};
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(isPrime(a[i])==true) {
                count++;
            }
        }
        System.out.println("The total number of Prime numbers less than or equal to 10 is: "+count);
    }

    public static Boolean isPrime(int n){
        int count = 0;
        for(int i =2; i<=n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
