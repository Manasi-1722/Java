import java.util.*;

public class Xplore_2 {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        Book[] booksArray = new Book[4];
        Book[] sorted = new Book[4];
        for (int i = 0; i < booksArray.length; i++) {
            booksArray[i] = new Book();
            sorted[i] = new Book();
        }
        for (int i = 0; i < booksArray.length; i++) {
            booksArray[i].id = sc.nextInt();
            booksArray[i].title = sc.next();
            booksArray[i].author = sc.next();
            booksArray[i].price = sc.nextDouble();
        }
        sorted = sortBooksByPrice(booksArray);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i].id + " " + sorted[i].title + " " + sorted[i].author + " " + sorted[i].price);
        }

        sc.close();
    }

    public static Book[] sortBooksByPrice(Book[] booksArray) {
        int n = booksArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (booksArray[j].price > booksArray[j + 1].price) {
                    Book temp = booksArray[j];
                    booksArray[j] = booksArray[j + 1];
                    booksArray[j + 1] = temp;
                }
            }
        }
        return booksArray;
    }
}

class Book {
    int id;
    String title, author;
    double price;
}
