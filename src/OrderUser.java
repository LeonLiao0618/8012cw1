import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderUser
    {
        public OrderUser(ArrayList<User> user,Scanner u) throws FileNotFoundException
        {

            int j = u.nextInt();


            for(int i = 0; i < j; i++){
                User a = new User();
                a.setFirstName(u.next());
                a.setSurname(u.next());
                a.setNumberofbook(0);
                user.add(a);
            }

            SortedArraylist.selectionSort(user);
        }
    }

