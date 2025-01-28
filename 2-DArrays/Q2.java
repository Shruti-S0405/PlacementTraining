import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        System.out.println("Enter the array A elements: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter the "+i+j+" element:");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the array B elements: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter the "+i+j+" element:");
                b[i][j] = sc.nextInt();
            }
        }
        int[][] sum = sumOfArr(a,b);
        System.out.println("Matrix A elements are: ");
        printArr(a);
        System.out.println("Matrix B elements are: ");
        printArr(b);
        System.out.println("Sum of A and B: ");
        printArr(sum);
    }

    public static void printArr(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+ " "); 
            }
            System.out.println();
        }        
    }

    public static int[][] sumOfArr(int[][] a, int[][] b){
        int[][] sum = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                sum[i][j] = a[i][j]+b[i][j];
            }
        }        
        return sum;
    }
}