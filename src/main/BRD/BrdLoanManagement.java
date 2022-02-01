package main.BRD;
import java.util.ArrayList;
import java.util.Date;
import main.AttendenceSytem.Student;
public class BrdLoanManagement{
    private ArrayList<StudentWithLoan> studentsWithLoan=StudentWithLoan.studentsWithLoan;
    private ArrayList<Student> studentsRequestLoan;
    private long budgetSum;
    private static long minimumCaptal=2000000;
    private static long payedMoney=0;
    public BrdLoanManagement(ArrayList<Student> studentsRequestLoan, long budgetSum) {
        this.studentsRequestLoan = studentsRequestLoan;
        this.budgetSum = budgetSum;
  
    }

    public static long getPayedMoney() {
        return payedMoney;
    }

    public static void setPayedMoney(long payedMoney) {
        BrdLoanManagement.payedMoney = payedMoney;
    }

    public BrdLoanManagement(ArrayList<StudentWithLoan> studentsWithLoan, ArrayList<Student> studentsRequestLoan,
            long budgetSum) {
        this.studentsWithLoan = studentsWithLoan;
        this.studentsRequestLoan = studentsRequestLoan;
        this.budgetSum = budgetSum;
    }
    public void provideLoan(Student student,long moneyToPay){
        if(budgetSum>minimumCaptal)
        if(studentsRequestLoan.contains(student)){
            
            studentsWithLoan.add(new StudentWithLoan(moneyToPay,student));
            budgetSum-=moneyToPay;
            System.out.println("The student "+student+" is given a loan ");
        }
        else{
            System.out.println("The student with id "+student.getNId()+" Did not request the loan! ");
            return;
        }
        else{
        System.out.println("Nomore budget for loan perovision! ");
        return;
        }
    }
    public void applyLoanPayment(long amount,Date dateOfLoanProvision,Date dateOfPayement){
      if(dateOfPayement.after(new Date()))
      for(StudentWithLoan studentWithLoan:studentsWithLoan){
          if(studentWithLoan.getDateOfLoanGiving().equals(dateOfLoanProvision)){
         
            studentWithLoan.payLoan(amount);
            payedMoney+=amount;
          }
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

    @Override
    public String toString() {
        return "BrdLoanManagement [budgetSum=" + budgetSum + ", studentsRequestLoan=" + studentsRequestLoan
                + ", studentsWithLoan=" + studentsWithLoan + "]";
    }
 

}
