package main.BRD;
import java.util.Date;
import main.AttendenceSytem.CalenderForStudents;
import main.AttendenceSytem.Student;

public class StudentWithLoan extends Student{
    private long moneyToPay;
    private Date dateOfLoanGiving;
    private long payedMoneySoFar;
    private boolean doesHaveJob;
    private PersonAcount personAcount;
  public StudentWithLoan(long moneyToPay, Date dateOfLoanGiving, long payedMoneySoFar, boolean doesHaveJob,
            PersonAcount personAcount) {
        this.moneyToPay = moneyToPay;
        this.dateOfLoanGiving = dateOfLoanGiving;
        this.payedMoneySoFar = payedMoneySoFar;
        this.doesHaveJob = doesHaveJob;
        this.personAcount = personAcount;
    }

public StudentWithLoan(String universityName, String collageName, String schoolName, String departmentName,
            Date dateOfStartingToStudy, int yearsToStudy, CalenderForStudents calenderForStudents, long moneyToPay,
            Date dateOfLoanGiving, long payedMoneySoFar, boolean doesHaveJob, PersonAcount personAcount) {
        super(universityName, collageName, schoolName, departmentName, dateOfStartingToStudy, yearsToStudy,
                calenderForStudents);
        this.moneyToPay = moneyToPay;
        this.dateOfLoanGiving = dateOfLoanGiving;
        this.payedMoneySoFar = payedMoneySoFar;
        this.doesHaveJob = doesHaveJob;
        this.personAcount = personAcount;
    }

public void payLoan(long money){
      if(!doesHaveJob){
          System.out.println("This person has not yet got a job!");
          return;
      }
      if(personAcount.getAmountOnBank()<money){
          System.out.println("Insufient balance on the person's account");
          return;
      }

      personAcount.setAmountOnBank(personAcount.getAmountOnBank()-money);
      payedMoneySoFar+=money;
      if(moneyToPay<=payedMoneySoFar){
        System.out.println("This person finished loan payment!");
        if(moneyToPay<payedMoneySoFar){
            long balance=payedMoneySoFar-moneyToPay;
            personAcount.setAmountOnBank(personAcount.getAmountOnBank()+balance);
            System.out.println(balance+" Is returned!");
        }
        return;
      }
  }

  

    public void print(){
        System.out.print("studentWithLoan");
    }


    /**
     * @return long return the moneyToPay
     */
    public long getMoneyToPay() {
        return moneyToPay;
    }

    /**
     * @param moneyToPay the moneyToPay to set
     */
    public void setMoneyToPay(long moneyToPay) {
        this.moneyToPay = moneyToPay;
    }

    /**
     * @return Date return the dateOfLoanGiving
     */
    public Date getDateOfLoanGiving() {
        return dateOfLoanGiving;
    }

    /**
     * @param dateOfLoanGiving the dateOfLoanGiving to set
     */
    public void setDateOfLoanGiving(Date dateOfLoanGiving) {
        this.dateOfLoanGiving = dateOfLoanGiving;
    }

    /**
     * @return long return the payedMoneySoFar
     */
    public long getPayedMoneySoFar() {
        return payedMoneySoFar;
    }

    /**
     * @param payedMoneySoFar the payedMoneySoFar to set
     */
    public void setPayedMoneySoFar(long payedMoneySoFar) {
        this.payedMoneySoFar = payedMoneySoFar;
    }

    /**
     * @return boolean return the doesHaveJob
     */
    public boolean isDoesHaveJob() {
        return doesHaveJob;
    }

    /**
     * @param doesHaveJob the doesHaveJob to set
     */
    public void setDoesHaveJob(boolean doesHaveJob) {
        this.doesHaveJob = doesHaveJob;
    }


}
