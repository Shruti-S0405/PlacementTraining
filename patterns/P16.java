package patterns;

public class P16 {
    public static void main(String[] args) {
        for(int i=0, k=69; i<5; i++,k--){
            int a = k;
            for(int j=0; j<5; j++){
                if(i+j>=4){
                    System.out.print((char)a);
                    a++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//     E
//    DE
//   CDE
//  BCDE
// ABCDE