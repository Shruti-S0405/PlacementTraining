public class After3NonPrime {
    public static void main(String[] args) {
        int count = 0;
        for(int i=10; i<100; i++){

            if(count%3==0 && count!=0) System.out.println(i);
            if(isPrime(i)==true) count=0;
            if(isPrime(i)==false) count++;
        }


    }
    public static Boolean isPrime(int n){
        for(int i=2; i<n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
