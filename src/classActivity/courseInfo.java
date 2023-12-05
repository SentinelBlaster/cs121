package classActivity;

public class courseInfo {
    String courseName,departmentName;
    int courseNum;

    public courseInfo(String courseName, String departmentName, int courseNum){
        this.courseName = courseName;
        this.departmentName = departmentName;
        this.courseNum = courseNum;
    }

    public void printCourseInfo(){
        System.out.printf("Course Name: %s%nCourse Department: %s%nCourse Number: %d%n",
                courseName,departmentName,courseNum);
    }
    public String printCourseInfo(boolean fact){
        String string= String.format("Course Name: %s\nCourse Department: %s\nCourse Number: %d\n",
                courseName,departmentName,courseNum);
        return string;
    }
}
