package main.AttendenceSytem;
import java.util.Date;
import java.util.ArrayList;
public class Lecture {
    private String lecturerName;
    private static Date startDate;
    private static Date endDate;
    private String courseName;
    private ArrayList<Student> studentsInLecture;
    private ArrayList<Attendence<Student,Date,Boolean>> attendence=new ArrayList<>();
    public void endLecture(){
        Date date=new Date();
        if(date.after(endDate)){
          
          for(var student:studentsInLecture){
              student.calenderForStudents.getLecturesPasses().add(this);
          }
          System.out.println("The lecture should get to the end!!");
        }
    }
    public void makeAttendence(Student student,Date date,Boolean attended){
     if(!studentsInLecture.contains(student)){
     System.out.println("This student is not a member of my course!");
     return;
     }
     attendence.add(new Attendence<Student,Date,Boolean>(student, date, attended));
     if(attended)
     student.setAttendanceGott(student.getAttendanceGott()+1);
    }
    public static Date getStartDate() {
        return startDate;
    }
    public static void setStartDate(Date startDate) {
        Lecture.startDate = startDate;
    }
    public static Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        Lecture.endDate = endDate;
    }
    public Lecture(String lecturerName, String courseName, ArrayList<Student> studentsInLecture) {
        this.lecturerName = lecturerName;
        this.courseName = courseName;
        this.studentsInLecture = studentsInLecture;
    }


    public ArrayList<Attendence<Student,Date,Boolean>> getAttendence() {
        return attendence;
    }


    public void setAttendence(ArrayList<Attendence<Student,Date,Boolean>> attendence) {
        this.attendence = attendence;
    }


    /**
     * @return String return the lecturerName
     */
    public String getLecturerName() {
        return lecturerName;
    }

    /**
     * @param lecturerName the lecturerName to set
     */
    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    /**
     * @return String return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return ArrayList<Student> return the studentsInLecture
     */
    public ArrayList<Student> getStudentsInLecture() {
        return studentsInLecture;
    }

    /**
     * @param studentsInLecture the studentsInLecture to set
     */
    public void setStudentsInLecture(ArrayList<Student> studentsInLecture) {
        this.studentsInLecture = studentsInLecture;
    }
    @Override
    public String toString() {
        return "Lecture [attendence=" + attendence + ", courseName=" + courseName + ", lecturerName=" + lecturerName
                + ", studentsInLecture=" + studentsInLecture + "]";
    }

}

