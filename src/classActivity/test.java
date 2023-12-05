package classActivity;

public class test {
    public static void main(String[] args) {
        studentInfo johnFait = new studentInfo("John Fait","Sophmore","Media Productino",3.65);
        courseInfo dataStruc = new courseInfo("Data Structures & Objects","Computer Science", 121);

        johnFait.printClassInfo();
        System.out.println("");
        dataStruc.printCourseInfo();
    }
}
