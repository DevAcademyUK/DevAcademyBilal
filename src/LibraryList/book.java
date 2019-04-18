package LibraryList;

import java.util.Comparator;

public class book  implements  Comparable<book> {


    public book(int bookID, String booktTitle, String booktAuthor, String bookYear) {
        this.bookID = bookID;
        this.booktTitle = booktTitle;
        this.booktAuthor = booktAuthor;
        this.bookYear = bookYear;
    }

    public int bookID;
    public String booktTitle;
    public String booktAuthor;
    public String bookYear;

    @Override
    public int compareTo(book o) {
        String title = o.booktTitle;


        return this.booktTitle.compareTo(title);
    }

    public static Comparator<book> bookAuthorComparator = new Comparator<book>() {
        @Override
        public int compare(book b1, book b2) {

            String author1 = b1.booktAuthor.toUpperCase();
            String author2 = b2.booktAuthor.toUpperCase();
            return  author1.compareTo(author2);
        }
    };

    public static Comparator<book> bookYearComparator = new Comparator<book>() {
        @Override
        public int compare(book Y1, book Y2) {


            String Year1 = Y1.bookYear.toUpperCase();
            String Year2 = Y2.bookYear.toUpperCase();
            return Year1.compareTo(Year2);
        }
    };
}
