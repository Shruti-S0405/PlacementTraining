public class Q4 {
    int emp;
    String name;
    int sal;
    public static void main(String[] args) {
        Q4 q = new Q4();
        Q4 q1 = new Q4(101, "Dinga", 45000);

    }
    Q4(){

    }
    Q4(int e, String n, int s){
        System.out.println(e);
        System.out.println(n);
        System.out.println(s);
    }
}
