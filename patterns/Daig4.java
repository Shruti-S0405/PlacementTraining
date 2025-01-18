package patterns;

import java.util.Scanner;

public class Daig4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int len = sc.nextInt();
        int n = len;
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                System.out.print(n);
            }
            n--;
            System.out.println();   
        }
    }    
}
// 5 5 5 5 5
// 4 4 4 4 4 
// 3 3 3 3 3 
// 2 2 2 2 2 
// 1 1 1 1 1