import java.lang.String;

public class Book {
    private int pagesNumber;
    private String name;
    private String text;

    Book(String name, String text, int pagesNumber){
        this.name = name;
        this.text = text;
        this.pagesNumber = pagesNumber;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber){
        this.pagesNumber = pagesNumber;
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return pagesNumber == book.pagesNumber &&
                name == book.name && text == book.text;
    }

    @Override
    public int hashCode() {
        return pagesNumber + name.hashCode() + text.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
