public class Book implements Comparable<Book>{
    String title;
    String AFirstName;
    String ALastName;
    boolean status;
    String borrowername;

    public Book() {
    }

    public Book(String title, boolean status) {
        this.title = title;
        this.status = status;
    }

    public Book(String title, String AFirstName, String ALastName, boolean status) {
        this.title = title;
        this.AFirstName = AFirstName;
        this.ALastName = ALastName;
        this.status = status;
    }

    public Book(String title, String AFirstName, String ALastName, boolean status,String borrowername) {
        this.title = title;
        this.AFirstName = AFirstName;
        this.ALastName = ALastName;
        this.status = status;
        this.borrowername = borrowername;
    }

    public String getBorrowername() {
        return borrowername;
    }

    public void getBorrowername(String firstname,String surname) {
        borrowername = firstname + surname;
    }

    public void setBorrowername(String borrowername) {
        this.borrowername = borrowername;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAFirstName() {
        return AFirstName;
    }

    public void setAFirstName(String AFirstName) {
        this.AFirstName = AFirstName;
    }

    public String getALastName() {
        return ALastName;
    }

    public void setALastName(String ALastName) {
        this.ALastName = ALastName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public int compareTo(Book b) {
        int lnCmp = ALastName.compareTo(b.ALastName);
        if (lnCmp != 0) return lnCmp;
        int fnCmp = AFirstName.compareTo(b.AFirstName);
        if (fnCmp != 0) return fnCmp;
        else return 0;
    }

    public String toString()
    {
        return "<<" + title + ">>" + " | Author: " + AFirstName + " " + ALastName + " | Status: " + status +" | Borrower Name: " + borrowername + "\n";
    }

}
