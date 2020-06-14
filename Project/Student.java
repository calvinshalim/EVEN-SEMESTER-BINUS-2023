package Project;

public class Student extends User  {
    private String Grade;
    private double totalfine;
    private double finepaid;


    public Student() {
        super();
        this.finepaid = 0;
        this.totalfine = 0 ;
    }


    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public double getTotalfine() {
        return totalfine;
    }

    public void setTotalfine(double totalfine) {
        this.totalfine = totalfine;
    }

    public double getFinepaid() {
        return finepaid;
    }

    public void setFinepaid(double finepaid) {
        this.finepaid = finepaid;
    }

    public void addFinepaid(double finepaid) {
        this.finepaid += finepaid;
    }


    @Override
    public String toString() {
        return "Student { " + super.toString() + ", Grade= " + Grade + ", total fine= $" + totalfine +
        ", fine paid= $" + finepaid + "}\n";
    }
}
