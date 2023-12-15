package weekSixteen;

public class Student {
    private String name;
    private int idNum;
    private String major;

    public Student(String name, int idNum, String major) {
        this.name = name;
        this.idNum = idNum;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
