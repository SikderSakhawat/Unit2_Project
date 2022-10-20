import java.util.Scanner;
public class U2ProjectRunner {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an ordered pair: "); // input for the initial ordered pair
        String firstPair = s.nextLine();
        System.out.println("Enter another ordered pair: "); // input for the final ordered pair
        String secondPair = s.nextLine();
        LinearEquation myLine = new LinearEquation(firstPair, secondPair);
        // object instantiated to have values of the ordered pairs
        myLine.toString(firstPair, secondPair);
        // uses values from ordered pairs to produce slope, y-intercept, slope-intercept formula
        /* Asks for an input to have an x value set to a double, then returns the ordered pair for that
        input value */

    }
}
