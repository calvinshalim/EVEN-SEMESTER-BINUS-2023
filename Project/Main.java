package Project;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Book> booklist = new ArrayList<>();
        ArrayList<User> userlist = new ArrayList<>();
        Library library = new Library(booklist, userlist);
        library.readbookcsvfile();
        boolean proceed = false;
        Librarian admin = new Librarian();
        Scanner sclogin = new Scanner(System.in);
        System.out.println("------Library Management System------");
        System.out.print("LOGIN ADMIN\nUsername : ");
        String username = sclogin.nextLine();
        System.out.print("Password : ");
        String password = sclogin.nextLine();
        if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
            System.out.println("Successful login!");
            proceed = true;
        } else {
            System.out.println("Wrong password or username!");
            System.exit(0);
        }
        while (proceed == true) {
            Scanner input_choice = new Scanner(System.in);
            Scanner input_String = new Scanner(System.in);
            Scanner input_int = new Scanner(System.in);
            System.out.println("------Library Management System------\n-------------- ADMIN ----------------");
            System.out.println("1.Add Book \n2.Delete Book \n3.Display Library \n4.Add Student \n5.Add Teacher \n6.Delete User \n7.Display User \n8.Borrow Book \n9.Return Book \n10.Add Fine \n11.Pay Fine\n12.EXIT");
            System.out.println("-------------------------------------");
            System.out.print("Input Choice >> ");
            int choice = input_choice.nextInt();
            if (choice == 1) {
                Book book = new Book();
                System.out.println("Enter Book Name : ");
                String bookname = input_String.nextLine();
                System.out.println("Enter Author name : ");
                String authorname = input_String.nextLine();
                System.out.println("Enter year of publish : ");
                int yearofpub = input_int.nextInt();
                System.out.println("Enter Number of Book Pages : ");
                int bookpages = input_int.nextInt();
                library.addexistingBook(new Book(yearofpub,authorname,bookname,bookpages));
            }
            if (choice == 2) {
                System.out.println(library.getBooklist());
                library.delbook();

            }
            if (choice == 3) {
                System.out.println(library.getBooklist());
            }
            if (choice == 4) {
                Student student = new Student();
                System.out.println("Enter Student Name : ");
                String studentname = input_String.nextLine();
                student.setName(studentname);
                System.out.println("Enter Student Grade : ");
                String studentgrade = input_String.nextLine();
                student.setGrade(studentgrade);
                library.addtoUserList(student);
            }
            if (choice == 5) {
                Teacher teacher = new Teacher();
                System.out.println("Enter Teacher Name : ");
                String teachername = input_String.nextLine();
                teacher.setName(teachername);
                System.out.println("Enter Teacher Division : ");
                String teacherDiv = input_String.nextLine();
                teacher.setDivision(teacherDiv);
                System.out.println("Enter Teacher Shift : ");
                String teachershift = input_String.nextLine();
                teacher.setshift(teachershift);
                library.addtoUserList(teacher);
            }
            if (choice == 6) {
                System.out.println(library.getUserlist());
                library.deluser();
            } if(choice == 7) {
                System.out.println(library.getUserlist());
            } if (choice == 8) {
                library.borrowbook();
            } if (choice == 9) {
                library.returnbook();
            } if(choice == 10){
                library.addfine();
            } if (choice == 11) {
                library.payfine();
            } if(choice == 12) {
                library.addbookcsv();
                System.exit(0);
            }
        }
    }
}