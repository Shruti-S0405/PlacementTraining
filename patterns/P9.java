package patterns;

public class P9 {
    public static void main(String args[]){
        for(int i=0; i<5; i++){
            int k = 1;
            for(int j=0; j<5; j++){
                if(i+j>=4){
                    System.out.print(k);
                    k++;
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
// 1
// 12
// 123
// 1234
// 12345