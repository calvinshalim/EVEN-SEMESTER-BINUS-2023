package Project;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Library {
    private ArrayList<Book> booklist;
    private ArrayList<User> userlist;

    public Library(ArrayList<Book> booklist, ArrayList<User> userlist) {
        this.booklist = booklist;
        this.userlist = userlist;
    }

    /**
     * for display all the book within the library
     * @return the booklist
     */
    public ArrayList<Book> getBooklist() {
        return booklist;
    }

    /**
     * for display all the user in the program
     * @return the userlist
     */
    public ArrayList<User> getUserlist () {
        return userlist;
    }

    /**
     * add a book to the book list (if book already created)
     *
     * book
     */
    public void addexistingBook(Book book) {
        booklist.add(book);
    }

    /**
     * function to delete the book from the book list.
     */
    public void delbook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book ID to delete : ");
        int bookid = sc.nextInt();
        for (int i = 0; i < booklist.size(); i++) {
            if (bookid == booklist.get(i).getBookID()) {
                booklist.remove(i);
                System.out.println("Book Has been deleted.");
                break;
            }
        }
    }

    /**
     * this will let the student or teacher borrow book from the book list.
     * it will ask for the book ID and the user ID (teach and student)
     * then it will add the book in the issued list and remove from the available book list
     * and set the book status to false.
     */
    public void borrowbook() {
        Book book = null;
        User user = null;
        Scanner sc = new Scanner(System.in);
        System.out.println(booklist);
        System.out.println("Enter book ID to borrow : ");
        int borrowbookid = sc.nextInt();
        for (int i = 0; i < booklist.size(); i++) {
            if (borrowbookid - 1 == i) {
                book = booklist.get(i);
                if (book.getStatus() == false) {
                    System.out.println("Book is not available!");
                    break;
                } else {
                    System.out.println(userlist);
                    System.out.println("Enter User ID to borrow : ");
                    int userborrowid = sc.nextInt();
                    for (int j = 0; j < userlist.size(); j++) {
                        if (userborrowid - 1 == j) {
                            user = userlist.get(j);
                        }
                    }
                }
                user.setBorrowbookID(borrowbookid);
                user.setcurrentdate(user.getcurrentTime());
                user.setReturndate(user.getreturnTime());
                book.setStatus(false);
            }
        }
    }

    /**
     * basically like borrowbook() but instead it remove the book from issued book list and add to available booklist.
     */
    public void returnbook() {
        Book book = null;
        User user = null;
        Scanner sc = new Scanner(System.in);
        System.out.println(booklist);
        System.out.println("which book ID to return : ");
        int returnbookid = sc.nextInt();
        for (int i = 0; i < booklist.size(); i++) {
            if (returnbookid-1 == i) {
                book = booklist.get(i);
            }
        }
        System.out.println(userlist);
        System.out.println("Which user ID return : ");
        int userreturnid = sc.nextInt();
        for(int j = 0; j < userlist.size(); j++) {
            if (userreturnid-1 == j) {
                user = userlist.get(j);
            }
        }
        user.setBorrowbookID(0);
        user.setcurrentdate(null);
        user.setReturndate(null);
        book.setStatus(true);
    }

        /**
         * add student and teacher to the list if the student already exist
         * user
         */
        public void addtoUserList (User user){
            userlist.add(user);
        }


        public void deluser() {
        User user;
        Scanner userdelid = new Scanner(System.in);
        System.out.println("Enter User ID to delete : ");
        int userid = userdelid.nextInt();
        for (int i = 0; i < userlist.size(); i++) {
            if (userid == userlist.get(i).getUserID()) {
                userlist.remove(i);
                System.out.println("User Has been deleted.");
                break;
            } else {
                System.out.println("ID does not match!");
                break;
            }
        }
    }

    /**
     * return the total fine of a student.
     * it can only be paid in full.
     * if paid, totalfine = 0, finepaid += totalfine.
     */
    public void payfine() {
        Student student = null;
        User user = null;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println(getUserlist());
        System.out.println("Enter student ID to pay fine : ");
        int studentpayid = sc.nextInt();
        for (int j = 0; j < userlist.size(); j++) {
            if (studentpayid == userlist.get(j).getUserID()) {
                user = userlist.get(j);
                student = (Student)user;
                double fine = student.getTotalfine();
                if (fine > 0) {
                    System.out.println("Fine should be paid : " + student.getTotalfine());
                    System.out.println("y for yes     n for no");
                    String input = sc1.nextLine();
                    if (input.equals("y")) {
                        student.addFinepaid(student.getTotalfine());
                        student.setTotalfine(0);
                        System.out.println("Fine has been paid");
                        break;
                    }
                    if (input.equals("n")) {
                        break;
                    }
                } else {
                    System.out.println("Student has no fine to paid");
                    break;
                }
            } else if(studentpayid != userlist.get(j).getUserID()) {
                System.out.println("Teacher Can NOT be fined!");
                break;
        } else {
                System.out.println("Wrong Input!");
                break;
            }
        }
    }

    /**
     * add a fine to a student based on ID.
     * it shows the user list but ONLY Student can be fined.
     */
    public void addfine() {
        Student student = null;
        User user = null;
        Scanner sc = new Scanner(System.in);
        System.out.println(getUserlist());
        System.out.println("Enter student ID to add fine : ");
        int studentpayid = sc.nextInt();
        for (int j = 0; j < userlist.size(); j++) {
            if (studentpayid == userlist.get(j).getUserID()) {
                user = userlist.get(j);
                student = (Student)user;
                System.out.println("Enter fine");
                double fine = sc.nextInt();
                double totalfine = student.getTotalfine();
                totalfine += fine;
                student.setTotalfine(totalfine);
                System.out.println("Fine has been added!");
                break;
            } else if(studentpayid != userlist.get(j).getUserID()) {
                System.out.println("Teacher Can NOT be fined!");
                break;
            } else {
                System.out.println("Wrong Input!");
                break;
            }
        }
    }

    /**
     * to write the book and update in the csv file
     * @throws IOException
     */
    public void addbookcsv() throws IOException {
        FileWriter csv_booklist = new FileWriter("booklist.csv");
        for (int i = 0; i < getBooklist().size(); i++) {
            csv_booklist.append(getBooklist().get(i).getBookauthor()).append(",");
            csv_booklist.append(getBooklist().get(i).getBookname()).append(",");
            csv_booklist.append(Boolean.toString(getBooklist().get(i).getStatus())).append(",");
            csv_booklist.append(Integer.toString(getBooklist().get(i).getBookpages())).append(",");
            csv_booklist.append(Integer.toString(getBooklist().get(i).getYearofpublish()));
            csv_booklist.append("\n");
        }
        csv_booklist.flush();
        csv_booklist.close();
    }

    /**
     * to read the csv file and put it in the book list library.
     * @throws IOException
     */
    public void readbookcsvfile() throws IOException {
        List<List<String>> bookdata = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("booklist.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                bookdata.add(Arrays.asList(values));
            }
            for (int i = 0; i < bookdata.size(); i++) {
                String authorname = bookdata.get(i).get(0);
                String bookname = bookdata.get(i).get(1);
                boolean status = Boolean.parseBoolean(bookdata.get(i).get(2));
                int bookpages = Integer.parseInt(bookdata.get(i).get(3));
                int yearofpub = Integer.parseInt(bookdata.get(i).get(4));
                addexistingBook(new Book(yearofpub, authorname, bookname, bookpages, status));
            }
        }
    }

        @Override
        public String toString () {
            return "\nAvailable books = " + booklist +
                    "\nUser list =" + userlist;
        }
    }