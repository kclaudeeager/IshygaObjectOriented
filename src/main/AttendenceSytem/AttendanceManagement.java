package main.AttendenceSytem;

import java.util.ArrayList;
import java.util.Date;

public class AttendanceManagement {
    public static void main(String args[]){
        Student student = new Student("UR","CST","ICT","CSE",new Date(),4,new CalenderForStudents());
        student.setNames("Kwizera Claude");
        student.setSex('M');
        student.setNId("1199780005490135");
       
        ArrayList<Student> studentsInLecture=new ArrayList<>();
        studentsInLecture.add(student);
       var lecture=new Lecture("Emmanuel", "Visual basic", studentsInLecture);
       ArrayList<Lecture> lectures=new ArrayList<>();
       lectures.add(lecture);
       lecture.setEndDate(new Date());
      lecture.makeAttendence(student, new Date(), true);
      lecture.makeAttendence(student, new Date(), false);
      lecture.makeAttendence(student, new Date(), true);
      lecture.makeAttendence(student, new Date(), false);
      lecture.makeAttendence(student, new Date(), true);
      lecture.makeAttendence(student, new Date(), false);
      CalenderForStudents.setTotalNumberOfLecturesToAttend(lectures.size());
      lecture.endLecture();
     System.out.println(lecture.toString());
     System.out.println();
     System.out.println();
     System.out.println(student.toString()); 
     System.out.println("which lectures attended:");
     for (Student st: studentsInLecture) {
        System.out.println("For "+st.getNames()+"::");
          for (Lecture lecture2 : st.calenderForStudents.getLecturesPasses()) {
        System.out.print("=> ");
        System.out.println(lecture2.getCourseName());
     }
     }
    
    
    }
}
