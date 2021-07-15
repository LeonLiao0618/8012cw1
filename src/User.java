public class User implements Comparable<User> {
    private String firstName;
    private String Surname;
    private int Numberofbook;

    public User(){}

    public User(String firstName, String Surname) {
        this.firstName = firstName;
        this.Surname = Surname;
    }

    public User(String firstName, String Surname, int numberofbook) {
        this.firstName = firstName;
        this.Surname = Surname;
        if (numberofbook < 0) throw new IllegalArgumentException();
        this.Numberofbook = numberofbook;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getNumberofbook() {
        return Numberofbook;
    }

    public void setNumberofbook(int numberofbook) {
        Numberofbook = numberofbook;
    }


    public int compareTo(User u) {
        int lnCmp = Surname.compareTo(u.Surname);
        if (lnCmp != 0) return lnCmp;
        int fnCmp = firstName.compareTo(u.firstName);
        if (fnCmp != 0) return fnCmp;
        else return 0;
    }

    public String toString()
    {
        return firstName + " " + Surname + " | Borrow book: " + Numberofbook + "\n";
    }



}

