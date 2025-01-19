package patterns;

public class P20 {
    public static void main(String[] args) {
        for(int i=0, k=65; i<5; i++,k++){
            int a = k;
            for(int j=0; j<5; j++){
                if(i<=j){
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
// ABCDE
//  BCDE
//   CDE
//    DE
//     E