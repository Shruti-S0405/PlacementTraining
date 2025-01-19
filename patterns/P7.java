package patterns;

public class P7 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i<=j){
                    System.out.print('1');
                }
                else{
                    System.out.print('0');
                }
            }
            System.out.println();
        }
    }
}

// 11111
// 01111
// 00111
// 00011
// 00001