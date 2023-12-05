package weekNine;

import java.util.Random;

public class MovieBookingSimulation {
    public static void main(String[] args) {
        Random random = new Random();

        //Initialize the theater
        int numRows = 5;
        int numSeats = 10;
        int[][] theater = new int[numRows][numSeats];
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numSeats; j++){
                theater[i][j] = 0;
            }
        }

        //Hardcode Movie Info
        String[][] movies = new String[3][4];
        movies[0][0] = "Transformers ROTB"; movies[0][1] = "3D"; movies[0][2] = "10"; movies[0][3] = "25.99";
        movies[1][0] = "Ready Player One"; movies[1][1] = "3D"; movies[1][2] = "15"; movies[1][3] = "10.99";
        movies[2][0] = "Rescuers Down Under"; movies[2][1] = "2D"; movies[2][2] = "20"; movies[2][3] = "5.99";

        //print theater
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numSeats; j++){
                System.out.printf("%s ",theater[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //print movies
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.printf("%s ",movies[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        //simulate booking
        int numFull = random.nextInt(25);
        for (int i = 0; i < numFull; i++){
            int xFill = random.nextInt(5);
            int yFill = random.nextInt(10);
            theater[xFill][yFill] = 1;

        }

        //print updated booking
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numSeats; j++){
                System.out.printf("%s ",theater[i][j]);
            }
            System.out.println();
        }


    }
}
