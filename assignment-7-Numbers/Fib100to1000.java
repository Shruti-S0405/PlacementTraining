public class Fib100to1000 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        System.out.print("Fibanocci series 100 to 1000: ");
        while(n2<=1000){
            if(n2>=100){
                System.out.print(n2 +", ");
            }
            int sum = n1+n2;
            n1 = n2;
            n2 = sum;
        }
        
    }    
}
