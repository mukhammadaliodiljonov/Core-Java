public class Book {
    private String title;
    private String author;
    private double price;

    public Book(){
        this.title = "Unkown";
        this.author= "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String args[]){

        Book book = new Book();
        System.out.println("Name is : "+book.title);
        System.out.println("Name is :"+book.author);

        Book book2 = new Book("Web Griffin","John Abby");
        System.out.println("Name is : "+book2.title);
        System.out.println("Author is : "+book2.author);

        Book book3 = new Book("Acts of Desperation","Megan Nolan",68.21);
        System.out.println("Name is : "+book3.title);
        System.out.println("Author is : "+book3.author);
        System.out.println("Price is : "+book3.price+" $");
    }
}