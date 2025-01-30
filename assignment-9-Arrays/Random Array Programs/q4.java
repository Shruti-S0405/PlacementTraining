public class q4 {
    public static void main(String[] args) {
        int[] a = {3,0,1,2};
        for(int i=0; i<=a.length; i++){
            Boolean b = false;
            for(int j=0; j<a.length; j++){
                if(i == a[j]){
                    b = true;
                }
            }
            if(b==false){
                System.out.println(i);
            }
        }
    }
}
