package patterns;

public class P11 {
    public static void main(String[] args) {
        for(int i=1, k=65; i<=5; i++,k++){
            int a = k;
            for(int j=1; j<=5; j++){
                if(i+j<=5){
                    System.out.print((char)a);
                    a++;
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }        
    }
}
// ABCD 
// BCD
// CD
// D