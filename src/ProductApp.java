public class ProductApp {

    public static void main(String[]args){

        Book a = new Book();
        a.setCode("Book 1225");
        a.setAuthor("B.K. Humbug");
        a.setPages(205);
        a.setDescription("Darn Holidays");
        a.setPrice(25.95);
        a.setTitle("Anti-Christmas for Dummies");
        System.out.println(a.toString());


        Book b = new Book();
        b.setCode("Book 1031");
        b.setAuthor("B.B Wolf");
        b.setPages(666);
        b.setDescription("Super scary, now 25% more Spooky");
        b.setPrice(49.95);
        b.setTitle("Biggest Bestest Halloween");
        System.out.println(b.toString());

        Software c = new Software();
        c.setOs("Windows 95");
        c.setPlatform("Microsoft");
        c.setProgrammer("Mr. Q");
        c.setCode("Software2095");
        c.setDescription("Software for Software");
        c.setPrice(98.62);
        System.out.println(c.toString());

        Software d = new Software();
        d.setOs("Super Apple Pie 4.0");
        d.setPlatform("Mac");
        d.setProgrammer("Mr. J");
        d.setPrice(75.00);
        d.setDescription("It totally does a thing");
        d.setCode("Software 1999");
        System.out.println(d.toString());
    }


}
