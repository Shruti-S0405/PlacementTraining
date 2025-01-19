package patterns;

public class P12 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            char a = 'E';
            for(int j=0; j<5; j++){
                if(i+j<=4){
                    System.out.print(a);
                    a--;
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }        
    }
}
// EDCBA
// EDCB
// EDC
// ED
// E