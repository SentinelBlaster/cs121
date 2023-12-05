package classActivity;

public class studentInfo {
    String name,gradeName, major;
    double gpa;

    public studentInfo(String name, String gradeName, String major, double gpa){
        this.name = name;
        this.gradeName = gradeName;
        this.major = major;
        this.gpa = gpa;
    }

    public void printClassInfo(){
        System.out.printf("Student Name: %s%nStudent Grade: %s%nStudent Major: %s%nStudent GPA: %.2f%n",
                name,gradeName,major,gpa);
    }
    public String printStudentInfo(boolean fact){
        String string = String.format("Student Name: %s\nStudent Grade: %s\nStudent Major: %s\nStudent GPA: %.2f\n",
                name,gradeName,major,gpa);
        return string;
    }
}
