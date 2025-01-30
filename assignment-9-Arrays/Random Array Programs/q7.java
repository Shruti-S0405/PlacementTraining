public class q7 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};

        if(a[a.length-1] < 10){
            a[a.length-1] = a[a.length-1] + 1;
            return a;

        }
        else{
            int[] res = new int[a.length+1];

            for(int i=0; i<a.length; i++){
                res[i] = a[i];
            }
            int resNum = a[a.length-1] + 1;
            res[a.length-1] = resNum%10;
            res[a.length] = resNum/10;

            return res;
        }


    }
}
