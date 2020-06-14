package Project;


public class Book {
    private static int count = 0;
    private int BookID;
    private String Bookname;
    private String Bookauthor;
    private int Bookpages;
    private int yearofpublish;
    private boolean status;

    /**
     * using count++ so that every Book object, the ID gains 1
     * so i dont have to manually input the id when creating a new Book object.
     */
    public Book() {
        count++;
        this.BookID = count;
        this.status = true;

    }

    public Book(int yearofpublish, String Bookauthor, String Bookname, int Bookpages) {
        count++;
        this.BookID = count;
        this.Bookauthor = Bookauthor;
        this.yearofpublish = yearofpublish;
        this.Bookname = Bookname;
        this.status = true;
        this.Bookpages = Bookpages;
    }

    public Book(int yearofpublish, String Bookauthor, String Bookname, int Bookpages, boolean status) {
        count++;
        this.BookID = count;
        this.Bookauthor = Bookauthor;
        this.yearofpublish = yearofpublish;
        this.Bookname = Bookname;
        this.status = true;
        this.Bookpages = Bookpages;
        this.status = status;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    public String getBookname() {
         return Bookname;
    }

    public void setBookauthor(String bookauthor) {
        Bookauthor = bookauthor;
    }

    public String getBookauthor() {
        return this.Bookauthor;
    }

    public void setBookpages(int bookpages) {
        Bookpages = bookpages;
    }

    public int getBookpages() {
        return Bookpages;
    }

    public void setYearofpublish(int yearofpublish) {
        this.yearofpublish = yearofpublish;
    }

    public int getYearofpublish() {
        return yearofpublish;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }


    @Override
    public String toString() {
            return "Book { " +
                    "ID= " + BookID +
                    ", Book= '" + Bookname + '\'' +
                    ", Author= '" + Bookauthor + '\'' +
                    ", Pages= " + Bookpages + " Pages" +
                    ", published= " + yearofpublish +
                    ", status= '" + status + "\'" +
                    "}\n";
    }
}