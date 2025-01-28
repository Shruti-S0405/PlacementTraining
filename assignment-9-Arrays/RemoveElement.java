
import java.util.Arrays;

public class RemoveElement {
    public static void main(String args[]) { 
        int[] a = {1,2,3,4,5,6,6,4};
        int elementToRemove = 4;
        int count = 0; 
        // Count occurrences of the element to remove 
        for (int value : a) { 
            if (value != elementToRemove) { 
                count++; 
            } 
        } 
        // Create a new array of the appropriate size 
        int[] newArray = new int[count]; 
        int index = 0; 
        // Fill the new array with elements that are not the one to remove 
        for (int value : a) { 
            if (value != elementToRemove) { 
                newArray[index++] = value; 
            } 
        } 
        System.out.println(Arrays.toString(newArray)); 
        
    } 
}
