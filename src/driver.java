import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) throws IOException {
        ArrayList<Book> book = new ArrayList<Book>();
        ArrayList<User> user= new ArrayList<User>();
        Scanner b = new Scanner(new File("D:\\MscCS\\8012\\8012CW\\book.txt"));
        Scanner u = new Scanner(new File("D:\\MscCS\\8012\\8012CW\\user.txt"));
        FileWriter writer1 = new FileWriter("D:\\MscCS\\8012\\8012CW\\output.txt");
        FileWriter writer2 = new FileWriter("D:\\MscCS\\8012\\8012CW\\record.txt");
        new OrderBook(book,b);//initialize the SortedArrayList of book
        new OrderUser(user,u);//initialize the SortedArrayList of user
        new IO().menu(b,u,writer1,writer2,book,user);

    }
}
