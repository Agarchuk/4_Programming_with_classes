package Book9;

public class Book {
    private int id;
    private static int ID = 0;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pageCount;
    private int price;
    private String bindingType;

    public Book(String name, String author, String publisher, int year, int pageCount, int price, String bindingType) {
        this.id = ID++;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Book.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return '\n'+"id=" + id +'\n' +
                "name='" + name + '\n' +
                "author='" + author + '\n' +
                "publisher='" + publisher + '\n' +
                "year=" + year+ '\n' +
                "pageCount=" + pageCount +'\n' +
                "price=" + price +'\n' +
                "bindingType='" + bindingType+'\n';
    }
}
