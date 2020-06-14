package Project;

import java.util.Date;
import java.util.Calendar;


public class User {
    private static int count = 0;
    private String name;
    private int ID;
    private int borrowbookID = 0;
    private Date issuedate;
    private Date returndate;

    public User() {
        count++;
        this.ID = count;
    }

    public User(String name) {
        count++;
        this.name = name;
        this.ID = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserID() {
        return ID;
    }

    public int getBorrowbookID() {
        return borrowbookID;
    }

    public void setBorrowbookID(int borrowbookID) {
        this.borrowbookID = borrowbookID;
    }

    public static Date getcurrentTime() {
        Date dt = new Date();
        return dt;
    }

    public void setcurrentdate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public static Date getreturnTime() {
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 7);
        dt = c.getTime();
        return dt;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    @Override
    public String toString() {
        return "User { " +
                "ID= '" + ID +
                ", Name= " + name +
                ", Borrow Book ID= " + borrowbookID +
                ", Issued Date= " + issuedate +
                ",Due Date= " + returndate;
    }

}
