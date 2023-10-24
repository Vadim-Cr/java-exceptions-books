import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // chiedo quanti libri vuole inserire
        System.out.print("How many books? ");
        int cartSize = Integer.parseInt(scanner.nextLine());
        // con questa dimensione creo un array di Libro
        Book[] newBooks = new Book[cartSize];
        for (int i = 0; i < newBooks.length; i++) {
            System.out.println("Insert product " + (i + 1));

            String bookName = null;
                System.out.print("Book Name: ");
                bookName = scanner.nextLine();

            int pages = 0;
            try {
                System.out.print("# of Book's Pages: ");
                pages = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid number");
            }
            String authorName = null;
                System.out.print("Author Name: ");
                authorName = scanner.nextLine();
            String editorName = null;
                System.out.print("Editor Name: ");
                editorName = scanner.nextLine();


            try {
                Book nuovoLibro = new Book(bookName, pages,authorName, editorName);
                newBooks[i] = nuovoLibro;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
        System.out.println(Arrays.toString(newBooks));
        for (Book b : newBooks) {
            System.out.println(b.toString());
        }


        scanner.close();
    }
}
