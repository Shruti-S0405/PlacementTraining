package patterns;

public class P10 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=1; j<=5; j++){
                int k = j;
                if(i+j>=5){
                    System.out.print(k);
                    k--;
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }        
    }
}

// 5
// 45
// 345
// 2345
// 12345