import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private static List<List<Object>> bookStore = new ArrayList<>();

    public static void addBook(String ntitle, String nauthor, int nprice, int nstock) {
        List<Object> list = new ArrayList<>();
        list.add(ntitle);
        list.add(nauthor);
        list.add(nprice);
        list.add(nstock);
        bookStore.add(list);
    }

    public static void displayBooks() {
        for (List<Object> list : bookStore) {
            System.out.println(list);
        }
    }

    public static void searchBook(String givenTitle) {
        boolean found = false;
        for (List<Object> list : bookStore) {
            if (list.get(0).equals(givenTitle)) {
                System.out.println("Book found: " + list);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found");
        }
    }

    public static void updateStock(String givenTitle, int givenStock) {
        boolean found = false;
        for (List<Object> list : bookStore) {
            if (list.get(0).equals(givenTitle)) {
                list.set(3, givenStock);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Wrong title of book");
        }
    }

    public static void main(String[] args) {
        addBook("qwe", "qwe", 123, 1);
        displayBooks();
        searchBook("qwe");
        updateStock("qwe", 23);
        displayBooks();
        }


}