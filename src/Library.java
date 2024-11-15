public class Library {
    public String LibraryName;

    public class Book{
        public String getLibraryName(){
            return LibraryName;
        }
    }

    public static void main(String[] args) {

        Library mylibrary = new Library();
        Library.Book book = mylibrary.new Book();
        System.out.println(book.getLibraryName());
    }
}