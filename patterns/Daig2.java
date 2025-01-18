package patterns;

import java.util.Scanner;

public class Daig2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int len = sc.nextInt();
        int n = 1;
        for(int i=0; i<len; i++){
            int count = 1;
            for(int j=0; j<len; j++){
                if(i==j)  System.out.print(n++ + " ");
                else if(i>j) System.out.print(count++ + " ");
                else System.out.print("1 ");
            }
            System.out.println();   
        }
    }    
}
// 1 1 1 1 1
// 1 2 1 1 1 
// 1 2 3 1 1 
// 1 2 3 4 1 
// 1 2 3 4 5