package BookSorter;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int pageNumber;
    private int releaseYear;

    public Book(String title, String author, int pageNumber, int releaseYear) {
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.releaseYear = releaseYear;
    }
    @Override
    public int compareTo(Book o) {
        return this.getTitle().compareTo(o.title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}
