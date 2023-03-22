public class BookMenu {
    public static void main(String[] args) {
        BookStore customer1 = new BookStore("Spider-Man","Stan Lee", 15.99,1);
        BookStore customer2= new BookStore("Wolverine Origins", "DC Comics", 14.99,1);

        System.out.println("I went to the store and bought "+customer1.getTitle() +" and " +customer2.getTitle());
        System.out.println(customer1.getTotal());
    }
}
