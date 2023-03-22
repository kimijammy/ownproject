public class BookStore {
    private String Title;
    private String Author;
    private double price;
    private int copies;
    private double total;

    public BookStore(String Title, String Author, double price,int copies){
        setTitle(Title);
        setAuthor(Author);
        setPrice(price);
        setCopies(copies);
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitle() {
        return Title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
       
            return price *copies;
        
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public int getCopies() {
        return copies;
    }


}
