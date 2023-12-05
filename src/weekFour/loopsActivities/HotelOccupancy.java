package weekFour.loopsActivities;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        //Set up
        Scanner console = new Scanner(System.in);
        int numFloors, numRooms, numFull;
        numRooms = 0;
        numFull = 0;

        System.out.println("How many floors does the hotel have?");
        numFloors = Integer.parseInt(console.nextLine());

        //going though floors
        for(int n = 0;n<numFloors;n++) {
            System.out.printf("How many floors are there on floor number %d?%n",n+1);
            numRooms = numRooms+Integer.parseInt(console.nextLine());
            System.out.println("How many rooms are occupied?");
            numFull = numFull+Integer.parseInt(console.nextLine());
        }

        //the maths
        float rateOccupied = ((float)numFull/numRooms);
        int percentFull = (int) (rateOccupied*100);
        int numVac = numRooms-numFull;

        //output
        System.out.println("");
        System.out.println("Floors: "+numFloors);
        System.out.println("Rooms: "+numRooms);
        System.out.println("Occupied rooms: "+numFull);
        System.out.println("Vacant rooms: "+ numVac);
        System.out.printf("Occupancy rate: %.2f ( %d percent)", rateOccupied,percentFull);
    }
}
