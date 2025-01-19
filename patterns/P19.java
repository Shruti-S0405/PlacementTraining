package patterns;

public class P19 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            int a = 'A';
            for(int j=0; j<5; j++){
                System.out.print((char)a++);
            }
            System.out.println();
        }
    }
}
// ABCDE
// ABCDE
// ABCDE
// ABCDE
// ABCDE