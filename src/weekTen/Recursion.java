package weekTen;

public class Recursion {

    public Recursion() {
    }

    public void countDown(int number){
        if (number == 0){
            System.out.println("Blast Off!");
        } else {
            System.out.println(number);
            countDown(number-1);
        }
    }

    public void alphaBackwards(char letter){
        System.out.println(letter);
        if (letter =='a'){
            int num = 0;
        } else if (letter == 'A') {
            int num = 0;
            //here's a fun experiment: comment out this else-if loop
            //if you have an upper case letter as the initial input
            //it's actually kind of funny
        } else{
            alphaBackwards((char)(letter-1));
        }
    }


}
