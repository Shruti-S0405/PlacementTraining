package patterns;

public class P13 {
    public static void main(String[] args) {
        char a = 'A';
        for(int i=0; i<5; i++, a++){
            for(int j=0; j<5; j++){
                if(i+j>=4){
                    System.out.print(a+" ");
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
