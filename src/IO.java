import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IO {


    public void menu(Scanner b,Scanner u,FileWriter writer1,FileWriter writer2,ArrayList<Book> book,ArrayList<User> user) throws IOException {

        int choice = 0;
        List<String> option = List.of("f","b","u","i","r");
        String temp;
        Scanner op = new Scanner(System.in);
        boolean flag = true;
        LocalDateTime time = LocalDateTime.now();

        ArrayList<String> record = new ArrayList();//store the record info.
        ArrayList<String> output = new ArrayList();//store the output info.


        while (flag) {

            System.out.println("f - to finish running the program.\n");
            System.out.println("b - to display on the screen the information about all the books in the library.\n");
            System.out.println("u - to display on the screen the information about all the users.\n");
            System.out.println("i - to update the stored data when a book is issued to a user.\n");
            System.out.println("r - to update the stored data when a user returns a book to the library.\n");
            System.out.println("Please input following letters:");

            do {
                while (!option.contains(temp = op.nextLine())) {
                    System.out.println("Incorrect input!!!");

                }
                choice = option.indexOf(temp);

            } while (choice < 0);



            switch (choice) {
                case 0 : {
                    System.out.println("Quitting");
                    writer1.write(String.valueOf(output));
                    writer1.close();
                    writer2.write(String.valueOf(record));//display the record when the terminal is closed.
                    writer2.close();
                    System.out.println(record);
                    flag = false;
                    break;
                }

                case 1: {

                    System.out.println(book);
                    record.add("Terminal operation: display the list of book | Time:" + time + "\n");
                    break;
                }
                case 2: {

                    System.out.println(user);
                    record.add("Terminal operation: display the list of user | Time:" + time + "\n");
                    break;
                        }
                case 3: {
                    Scanner sc = new Scanner(System.in);
                    User user1= new User();
                    Book book1= new Book();
                    int userinlist = -1;
                    int bookinlist = -1;

                    do {
                        System.out.println("Please input the fisrtname of user:");
                        user1.setFirstName(sc.nextLine());
                        System.out.println("Please input the surname of user:");
                        user1.setSurname(sc.nextLine());

                        for (int i = 0; i < user.size(); i++) {
                            if (user1.getFirstName().equals(user.get(i).getFirstName())) {
                                if (user1.getSurname().equals(user.get(i).getSurname())) {
                                    userinlist = i;
                                }
                            }
                        }
                        if (userinlist <0) {
                            System.out.println("Not a valid user!");
                        } else {
                            System.out.println("Valid user");
                        }
                    }while(userinlist < 0);

                    do {
                        System.out.println("Please input the title of book:");
                        book1.setTitle(sc.nextLine());

                        for (int i = 0; i < book.size(); i++) {
                            if (book1.getTitle().equals(book.get(i).getTitle())) {
                                bookinlist = i;
                            }
                        }

                        if (bookinlist <0) {
                            System.out.println("Not a valid book!");
                        } else {
                            if (book.get(bookinlist).status){
                            System.out.println("This book is in the library");
                            record.add("Terminal operation: User " + user.get(userinlist).getFirstName() + " " + user.get(userinlist).getSurname() + " request borrowing <<" + book.get(bookinlist).getTitle() + ">> | Operation Time:" + time + "\n");

                                book.get(bookinlist).setStatus(false);
                                book.get(bookinlist).getBorrowername(user.get(userinlist).getFirstName(), user.get(userinlist).getSurname());
                                user.get(userinlist).setNumberofbook(user.get(userinlist).getNumberofbook() + 1);

                            System.out.println("Borrow successfully");
                                record.add("Terminal operation: User " + user.get(userinlist).getFirstName() + " " + user.get(userinlist).getSurname() + " borrow <<" + book.get(bookinlist).getTitle() + ">> successfully | Operation Time:" + time + "\n");
                            }
                            else {System.out.println("This book was borrowed by " + book.get(bookinlist).getBorrowername());
                                  output.add("imformation to User " + book.get(bookinlist).getBorrowername() + ": user " + user.get(userinlist).getFirstName() + " " + user.get(userinlist).getSurname() + " request borrowing <<" + book.get(bookinlist).getTitle() + ">> , please return it as soon as possible.\n");
                            }
                        }

                    }while(bookinlist <0);


                            break;
                        }
                case 4: {
                    Scanner sc = new Scanner(System.in);
                    User user1= new User();
                    Book book1= new Book();
                    int userinlist = -1;
                    int bookinlist = -1;

                    do {
                        System.out.println("Please input the fisrtname of user:");
                        user1.setFirstName(sc.nextLine());
                        System.out.println("Please input the surname of user:");
                        user1.setSurname(sc.nextLine());

                        for (int i = 0; i < user.size(); i++) {
                            if (user1.getFirstName().equals(user.get(i).getFirstName())) {
                                if (user1.getSurname().equals(user.get(i).getSurname())) {
                                    userinlist = i;
                                }
                            }
                        }
                        if (userinlist <0) {
                            System.out.println("Not a valid user!");
                        } else {
                            System.out.println("Valid user");
                        }
                    }while(userinlist < 0);

                    do {
                        System.out.println("Please input the title of book:");
                        book1.setTitle(sc.nextLine());

                        for (int i = 0; i < book.size(); i++) {
                            if (book1.getTitle().equals(book.get(i).getTitle())) {
                                bookinlist = i;
                            }
                        }

                        if (bookinlist <0) {
                            System.out.println("Not a valid book!");
                        } else {

                            if (!book.get(bookinlist).status){

                                System.out.println("This book was borrowed by " + book.get(userinlist).getBorrowername());//need to change the borrowname so that the name can match each other when comparing


                                book.get(bookinlist).setStatus(true);
                                book.get(bookinlist).setBorrowername(null);
                                user.get(userinlist).setNumberofbook(user.get(userinlist).getNumberofbook() - 1);
                                System.out.println("Return successfully");
                                record.add("Terminal operation: User " + user.get(userinlist).getFirstName() + " " + user.get(userinlist).getSurname() + " return <<" + book.get(bookinlist).getTitle() + ">> | Operation Time:" + time + "\n");
                            }
                            else {System.out.println("The book is still in the libaray");}
                        }

                    }while(bookinlist <0);



                            break;
                        }
                default: {
                    System.out.println("Incorrect input!!");
                            break;
                        }


                }


            }
        }
    }


