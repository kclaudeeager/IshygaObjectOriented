package main.AttendenceSytem;
import java.util.ArrayList;
import java.util.Date;

public class CalenderForStudents {
    private static int totalNumberOfLecturesToAttend;
    private static ArrayList<Lecture> LecturesPasses=new ArrayList<Lecture>();
    private static Date startDate;
    private static Date endDate;
    public CalenderForStudents() {
    }
  
    public ArrayList<Lecture> getLecturesPasses() {
        return LecturesPasses;
    }
   
    public static void setLecturesPasses(ArrayList<Lecture> lecturesPasses) {
        LecturesPasses = lecturesPasses;
    }

    @Override
    public String toString() {
        return "CalenderForStudents [totalNumberOfLecturesToAttend="+totalNumberOfLecturesToAttend+", LecturesPasses="+LecturesPasses+"]";
    }

    public static int getTotalNumberOfLecturesToAttend() {
        return totalNumberOfLecturesToAttend;
    }

    public static void setTotalNumberOfLecturesToAttend(int totalNumberOfLecturesToAttend) {
        CalenderForStudents.totalNumberOfLecturesToAttend = totalNumberOfLecturesToAttend;
    }

   

    public static Date getStartDate() {
        return startDate;
    }

    public static void setStartDate(Date startDate) {
        CalenderForStudents.startDate = startDate;
    }

    public static Date getEndDate() {
        return endDate;
    }

    public static void setEndDate(Date endDate) {
        CalenderForStudents.endDate = endDate;
    }

}
