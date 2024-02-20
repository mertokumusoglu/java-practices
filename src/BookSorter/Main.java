package BookSorter;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> bookSet = new TreeSet<>();

        Book b1 = new Book("The North Water",  "Ian McGuire", 352, 2017);
        Book b2 = new Book("In the Kingdom of Ice",  "Hampton Sides", 458, 2015);
        Book b3 = new Book("The Cruel Sea",  "Nicholas Monsarrat", 448, 2009);
        Book b4 = new Book("The Ship",  "C.S. Forester", 288, 1943);
        Book b5 = new Book("One Hundred Days",  "Sandy Woodward", 572, 2012);

        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        bookSet.add(b4);
        bookSet.add(b5);
        System.out.println("----------Order by name----------");
        for (Book book : bookSet) {
            System.out.println(book.getTitle());
        }

        TreeSet<Book> bookSetName = new TreeSet<>(new PageNumberComparable());
        bookSetName.add(b1);
        bookSetName.add(b2);
        bookSetName.add(b3);
        bookSetName.add(b4);
        bookSetName.add(b5);
        System.out.println("----------Order by page number----------");
        for (Book book : bookSetName) {
            System.out.println(book.getTitle());
        }
    }
}
