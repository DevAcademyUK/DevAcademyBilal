package LibraryList;

import java.util.*;

public class library {
    Scanner myscanner = new Scanner(System.in);


    Scanner myScanner = new Scanner(System.in);



    List<book> books = new ArrayList<book>();

    List<member> members = new ArrayList<member>();


    loan[] loans = new loan[5];


    public static void main(String[] args) {
        library lib = new library();
        lib.init();
    }
    public void menu() {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Bilal's Library");
        System.out.println("Select an Option From Below");
        System.out.println("1:Search Book");
        System.out.println("2:Book Year");
        System.out.println("3:Search for Author");
        System.out.println("4:Search for Member ForName");
        System.out.println("5:Search for Member for Surname");
        System.out.println("6:Search for Member for Age");


        int choice = Integer.parseInt(myScanner.nextLine());

        switch (choice) {
            case 1:

                searchBook();

                break;

            case 2:
                BookYear();
                break;
            case 3:
                SearchAuthor();

            case 4:
                SearchMemberName();

            case 5:
                SearchSurname();

            case 6:
                SearchAge();

                break;
                default:
                    System.out.println("Invalid Input Provided");

        }



    }

    private void SearchMemberName() {
        Collections.sort(members);
        for (member A : members) {
            System.out.println(A.memberForname);

        }

        System.out.println("\n");
    }
    private void SearchSurname() {

        Collections.sort(members, member.SurnameBook);
        for (member S : members) {
            System.out.println(S.memberSurname);
        }

    }
    private void SearchAge() {
        Collections.sort(members, member.membersAge);
        for (member A : members) {
            System.out.println(A.memberAge);
        }


    }

    public void searchBook() {
        for (book a : books) {
            System.out.println(a.booktTitle);
        }
        System.out.println("\n");
        Collections.sort(books);

            menu();

    }

    public void BookYear() {

        Collections.sort(books, book.bookYearComparator);
        for (book Y : books) {
            System.out.println(Y.bookYear);
        }
       menu();


    }

    public void SearchAuthor() {

        Collections.sort(books, book.bookAuthorComparator);
        for (book b : books) {
            System.out.println(b.booktAuthor);
        }
                menu();
    }


    public void init() {

        books.add(new book(1, "In Search of Lost Time", "Marcel Proust", "1913"));
        books.add(new book(2, "Ulysses", "James", "1922"));
        books.add( new book(3, "Moby DIck ", "Marcel", "1833"));
        books.add( new book(4, "Pride and PreJudice", "Herman", "1897"));
        books.add(new book(5, "Lost Time", "Proust", "1973"));



        members.add(new member(1, "Deam", "Lewis", (byte) 30));
        members.add( new member(2, "Lewis", "John  ", (byte) 44));
        members.add( new member(3, "Bilal", "Yousaf", (byte) 22));
        members.add(new member(4, "Vicy", "Cros", (byte) 19));
        members.add( new member(5, "Rachel", "AP", (byte) 24));

        loans[0] = new loan(2, 4);
        loans[1] = new loan(2, 4);


        menu();
    }


}
