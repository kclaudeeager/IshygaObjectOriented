package main.AttendenceSytem;
import java.util.Date;
import main.Citizen;
public class Student extends Citizen{
    /**
     *
     */
    private static final CalenderForStudents CALENDER_FOR_STUDENTS = new CalenderForStudents();
    private String universityName;
    private String collageName;
    private String schoolName;
    private String departmentName;
    private Date dateOfStartingToStudy;
    private int yearsToStudy;
    private int attendanceGott;
    public CalenderForStudents calenderForStudents=CALENDER_FOR_STUDENTS;

    public Student() {
        super();
    }



    public Student(String universityName, String collageName, String schoolName, String departmentName,
             Date dateOfStartingToStudy, int yearsToStudy, CalenderForStudents calenderForStudents) {
        super();
        this.universityName = universityName;
        this.collageName = collageName;
        this.schoolName = schoolName;
        this.departmentName = departmentName;
        this.dateOfStartingToStudy = dateOfStartingToStudy;
        this.yearsToStudy = yearsToStudy;
        this.calenderForStudents = calenderForStudents;
    }



    public void print(){
        System.out.print("student");
    }



    public String getUniversityName() {
        return universityName;
    }



    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }



    public String getCollageName() {
        return collageName;
    }



    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }



    public String getSchoolName() {
        return schoolName;
    }



    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }



    public String getDepartmentName() {
        return departmentName;
    }



    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }



    public Date getDateOfStartingToStudy() {
        return dateOfStartingToStudy;
    }



    public void setDateOfStartingToStudy(Date dateOfStartingToStudy) {
        this.dateOfStartingToStudy = dateOfStartingToStudy;
    }



    public int getYearsToStudy() {
        return yearsToStudy;
    }



    public void setYearsToStudy(int yearsToStudy) {
        this.yearsToStudy = yearsToStudy;
    }



    public int getAttendanceGott() {
        return attendanceGott;
    }



    public void setAttendanceGott(int attendanceGott) {
        this.attendanceGott = attendanceGott;
    }



    @Override
    public String toString() {
        return "Student [ Identification= "+super.toString()+" attendanceGott=" + attendanceGott + ", collageName=" + collageName + ", dateOfStartingToStudy=" + dateOfStartingToStudy
                + ", departmentName=" + departmentName + ", schoolName=" + schoolName + ", universityName="
                + universityName + ", yearsToStudy=" + yearsToStudy + "]";
    }
}
