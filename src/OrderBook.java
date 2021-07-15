import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderBook {

        public OrderBook(ArrayList<Book> book,Scanner b) throws FileNotFoundException{
            int j = b.nextInt();


            for (int i = 0; i < j; i++) {
                Book a = new Book();
                String enter = b.nextLine();//to absorb the Enter
                a.setTitle(b.nextLine());
                a.setAFirstName(b.next());
                a.setALastName(b.next());
                a.setStatus(true);
                a.setBorrowername(null);
                book.add(a);
            }
            SortedArraylist.selectionSort(book);

        }


}
