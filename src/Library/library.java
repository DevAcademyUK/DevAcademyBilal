package Library;

import java.util.Scanner;

public class library {
    Scanner myscanner = new Scanner(System.in);


    Scanner myScanner = new Scanner(System.in);


    book[] books = new book[5];
    member[] members = new member[5];
    loan[] loans = new loan[5];


    public static void main(String[] args) {
        library lib = new library();
        lib.init();
    }
    public void menu() {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Deans Library");
        System.out.println("Select an Option From Below");
        System.out.println("1 - Search Book ");
        System.out.println("2 -Check If Book is available");
        System.out.println("3- Search for Author");

        int choice = Integer.parseInt(myScanner.nextLine());

        switch (choice) {
            case 1:

                searchBook();

                break;

            case 2:
                CheckBook();
                break;
            case 3:
                SearchAuthor();
                break;
                default:
                    System.out.println("Invalid Input Provided");

        }



    }

    public void searchBook() {
        System.out.println("what is the book name that you would like to search for?");
        String title = myScanner.nextLine();

        for (int i = 0; i < books.length; i++) {
            if (books[i].booktTitle.equalsIgnoreCase(title)){
                System.out.println("We have that book in the Library");
                System.out.println();
                menu();
            }
            else if (i == books.length - 1 ) {
                System.out.println("Sorry, We do not have the book");
                System.out.println();
                menu();
            }
        }
    }

    public void CheckBook() {

        System.out.println("What is the name of the Book that you would like to check the Availabilty of? ");
        String Check = myScanner.nextLine();

        for (int i = 0; i <books.length; i++) {
            if (books[i].booktTitle.equalsIgnoreCase(Check)){
                System.out.println("Yes, We currently Have this book available to be loaned");
                System.out.println();
                for (book b:books) {
                    if(b.bookID==books[i].bookID)
                        continue;
                    System.out.println(b.booktTitle);
                }
                break;
            }

            else if (i == books.length - 1) {
                System.out.println("sorry we don't have this book  here  are the other choices ");
                for (book b:books) {
                    System.out.println(b.booktTitle);
                }
            }
        }





    }

    public void SearchAuthor() {

        System.out.println("What is the Name of the Author You are Looking for?");
        String author = myScanner.nextLine();

        for (int i = 0 ; i < books.length; i++) {
            if (books[i].booktAuthor.equalsIgnoreCase(author)){
                System.out.println("Yes this Auhtor's Book is Available in the library");
                System.out.println();
                menu();
            }

            else if ( i == books.length - 1 ) {
                System.out.println("Sorry, We do not currently have this Authors Book");
                System.out.println();
                menu();
            }
        }

    }


    public void init() {

        books[0] = new book(1, "In Search of Lost Time", "Marcel Proust", "1913");
        books[1] = new book(2, "Ulysses", "James", "1922");
        books[2] = new book(3, "Moby DIck ", "Marcel", "1833");
        books[3] = new book(4, "Pride and PreJudice", "Herman", "1897");
        books[4] = new book(5, "Lost Time", "Proust", "1973");

        members[0] = new member(1, "Deam", "Lewis", (byte) 30);
        members[1] = new member(2, "Lewis", "John  ", (byte) 44);
        members[2] = new member(3, "Bilal", "Yousaf", (byte) 22);
        members[3] = new member(4, "Vicy", "Cros", (byte) 19);
        members[4] = new member(5, "Rachel", "AP", (byte) 24);

        loans[0] = new loan(2, 4);
        loans[1] = new loan(2, 4);


        menu();
    }


}
