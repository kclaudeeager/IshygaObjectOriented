package main.BRD;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import main.AttendenceSytem.CalenderForStudents;
import main.AttendenceSytem.Student;

public class BrdTaskImplimentation {
    
    private static boolean add;

   public static void main(String args[]){
        PersonAcount personAcount1=new PersonAcount("1234-455-53774334555",5000000);
        PersonAcount personAcount2=new PersonAcount("1234-455-53774334-34",2000000);
        Date dateOfLoan=new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(dateOfLoan);
        calendar.add(calendar.DATE,-1);
        dateOfLoan=calendar.getTime();
        // Instant now=Instant.now();
        // Instant yesterday=now.minus(1,ChronoUnit.DAYS);
        ArrayList<Student> studentsRequestLoan=new ArrayList<>();
        Student student1=new Student("UR", "CST", "ICT", "CSE", new Date(), 4,new CalenderForStudents());
        Student student2=new Student("UR", "CST", "Engineering", "Construction", new Date(), 3,new CalenderForStudents());
           studentsRequestLoan.add(student1);
            studentsRequestLoan.add(student2);
           System.out.println(studentsRequestLoan.size());
        BrdLoanManagement brdLoanManagement=new  BrdLoanManagement(studentsRequestLoan,200000000);
        for(int i=0;i<brdLoanManagement.getStudentsRequestLoan().size();i++){
         
         System.out.println("Student "+(i+1)+": \n"+brdLoanManagement.getStudentsRequestLoan().get(i));
      }
        for(int i=0;i<brdLoanManagement.getStudentsRequestLoan().size();i++){
           System.out.println("\n Student "+(i+1)+": \n"+brdLoanManagement.getStudentsRequestLoan().get(i));
           brdLoanManagement.provideLoan(brdLoanManagement.getStudentsRequestLoan().get(i), 10000000);
           
        }

        StudentWithLoan.studentsWithLoan=brdLoanManagement.getStudentsWithLoan();
        brdLoanManagement.getStudentsWithLoan().get(0).setPersonAcount(personAcount1);
        System.out.println(brdLoanManagement.getStudentsRequestLoan().size());
        System.out.println(studentsRequestLoan.size());
      // brdLoanManagement.getStudentsWithLoan().get(1).setPersonAcount(personAcount2);
        for (StudentWithLoan studentWithLoan: brdLoanManagement.getStudentsWithLoan()) {
         studentWithLoan.setDateOfLoanGiving(dateOfLoan);
         studentWithLoan.setDoesHaveJob(true);
        }
        calendar.add(calendar.DATE,365);
        Date dateOfPayment=new Date();
        dateOfPayment=calendar.getTime();
        brdLoanManagement.applyLoanPayment(2000000, dateOfLoan,dateOfPayment);
       System.out.println(brdLoanManagement.toString());
       System.out.println("Number of loan "+StudentWithLoan.studentsWithLoan.size());
    }
}