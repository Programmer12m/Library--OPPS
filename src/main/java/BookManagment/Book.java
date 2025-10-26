package BookManagment;
/* no function added till yet*/

public class Book {
    private int isbn;
    private String title;
    private String  author;
    private int totalCopies;
    private int avaliableCopies;

    public Book(int isbn, String title, String author, int totalCopies, int avaliableCopies) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.avaliableCopies = avaliableCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", totalCopies=" + totalCopies +
                ", avaliableCopies=" + avaliableCopies +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

