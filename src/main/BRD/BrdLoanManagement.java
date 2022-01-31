package main.BRD;
import java.util.ArrayList;
import java.util.Date;
import main.AttendenceSytem.Student;
public class BrdLoanManagement{
    private ArrayList<StudentWithLoan> studentsWithLoan;
    private ArrayList<Student> studentsRequestLoan;
    private long budgetSum;
    public void provideLoan(Student student){
        if(studentsRequestLoan.contains(student)){
            studentsWithLoan.add((StudentWithLoan) student);
            studentsRequestLoan.remove(student);
        }
        else{
            System.out.println("The student with id "+student.getNId()+" Did not request the loan! ");
            return;
        }
    }
    public void applyLoanPayment(long amount,Date dateOfLoanProvision){
      for(StudentWithLoan studentWithLoan:studentsWithLoan){
          if(studentWithLoan.getDateOfLoanGiving().equals(dateOfLoanProvision))
            studentWithLoan.payLoan(amount);
      }
       
    }
    public BrdLoanManagement() {
    }
    public BrdLoanManagement(long budgetSum) {
        this.budgetSum = budgetSum;
    }
    public long getBudgetSum() {
        return budgetSum;
    }
    public void setBudgetSum(long budgetSum) {
        this.budgetSum = budgetSum;
    }
    public ArrayList<StudentWithLoan> getStudentsWithLoan() {
        return studentsWithLoan;
    }
    public void setStudentsWithLoan(ArrayList<StudentWithLoan> studentsWithLoan) {
        this.studentsWithLoan = studentsWithLoan;
    }
    public ArrayList<Student> getStudentsRequestLoan() {
        return studentsRequestLoan;
    }
    public void setStudentsRequestLoan(ArrayList<Student> studentsRequestLoan) {
        this.studentsRequestLoan = studentsRequestLoan;
    }

}
