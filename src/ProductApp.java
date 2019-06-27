public class ProductApp {

    public static void main(String[]args){

        Book a = new Book();
        a.setCode("Book 1225");
        a.setAuthor("B.K. Humbug");
        a.setPages(205);
        a.setDescription("Darn Holidays");
        a.setPrice(25.95);
        a.setTitle("Anti-Christmas for Dummies");


        Book b = new Book();
        b.setCode("Book 1031");
        b.setAuthor("B.B Wolf");
        b.setPages(666);
        b.setDescription("Super scary, now 25% more Spooky");
        b.setPrice(49.95);
        b.setTitle("Biggest Bestest Halloween");

    }


}
