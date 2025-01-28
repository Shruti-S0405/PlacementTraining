package patterns;

public class P15 {
    public static void main(String[] args) {
        char a = 'E';
        for(int i=0; i<5; i++, a--){
            for(int j=0; j<5; j++){
                if(i+j>=4){
                    if(i+j==4 || j==4)
                    System.out.print(a+" ");
                    else
                    System.out.print("  ");
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        char b = 'B';
        for(int i=0; i<5; i++, b++){
            for(int j=0; j<5; j++){
                if(i<=j){
                    if(i==j || j==4)
                    System.out.print(b+" ");
                    else
                    System.out.print("  ");
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }


}
