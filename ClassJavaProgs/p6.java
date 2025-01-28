public class p6 {
    int id;
    String name;

    public static void main(String[] args) {
        p6 p = new p6(1,"Shruti");
        System.out.println(p.id);

    }

    p6(int id, String name){
        // int i = i;
        // String s = s;

        this.id = id;
        this.name = name;
    }

}
