import java.util.Scanner;
public class S28{
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search from the array: ");
        int element = sc.nextInt();
        System.out.println();
        System.out.print("Index is : ");
        System.out.println(searchIndex(element, arr));

    }

    public static int searchIndex(int ele, int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    } 
}
