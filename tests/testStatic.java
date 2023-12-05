
import classActivity.courseInfo;
import classActivity.studentInfo;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class testStatic {
    private courseInfo courseTest = new courseInfo("Comp Sci","CS", 121);
    private  studentInfo studentTest = new studentInfo("John","Sophmore", "Media",3.60);

    @Test
    public void printCourseInfo(){
        String string = "Course Name: Comp Sci\nCourse Department: " +
                "CS\nCourse Number: 121\n";
        assertEquals(string,courseTest.printCourseInfo(true));
    }

    @Test
    public void printStudentInfo(){
        String string = "Student Name: John\nStudent Grade: Sophmore\nStudent Major: Media\nStudent GPA: 3.60\n";
        assertEquals(string,studentTest.printStudentInfo(true));
    }

}
