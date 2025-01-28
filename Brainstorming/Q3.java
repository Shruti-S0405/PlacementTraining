
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args){
        int a[] = {1,2,3,3,4,4,4,5,6,1};

        // for(int i=0; i<a.length-1; i++){
        //     for(int j=i+1; j<a.length; j++){
        //         if(a[i]>a[j]){
        //             int temp = a[i];
        //             a[i] = a[j];
        //             a[j] = temp;
        //         }
        //     }
        // }

        int maxCount = 0;
        int maxValue = 0;
        for(int i=0; i<a.length-1; i++){
            int count = 1;
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]) count++;
            }
            if(count>maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }

        System.out.println(Arrays.toString(a));

        System.out.println("The value "+maxValue+" has the maximum count of "+ maxCount);
    }
}
