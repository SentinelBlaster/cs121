package weekSix;

import java.util.Scanner;

public class MethodsActivities {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Double length = getLength();
        Double width = getWidth();
        Double area = getArea(length,width);
        displayData(length,width,area);
        scanner.close();
    }
    public static Double getLength(){
        System.out.println("Please enter the length:");
        Double length = Double.parseDouble(scanner.nextLine());
        return length;
    }
    public static Double getWidth(){
        System.out.println("Please enter the width:");
        Double width = Double.parseDouble(scanner.nextLine());
        return width;
    }
    public static Double getArea(Double length, Double width){
        double area = length*width;
        return area;
    }
    public static void displayData(Double length, Double width, Double area){
        System.out.printf("Length: %.1f\n Width: %.1f\n Area: %.2f",length,width,area);
    }
}
