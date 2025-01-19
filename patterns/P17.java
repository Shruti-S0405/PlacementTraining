package patterns;

public class P17 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(a++ + " ");
                }
            } else {
                int start = a + i; // Calculate the start for descending order
                for (int j = 0; j <= i; j++) {
                    System.out.print(start-- + " ");
                    a++;
                }
            }
            System.out.println();
        }
    }
}
// 1 
// 3 2
// 4 5 6
// 10 9 8 7
// 11 12 13 14 15