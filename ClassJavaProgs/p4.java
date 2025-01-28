class Book{

}

class p4{
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        System.out.println(b1==b2);
        System.out.println(b1==b3);
        System.out.println(b3==b2);

    }
}