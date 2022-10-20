import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;
public class LinearEquation {
    Scanner s = new Scanner(System.in);
    private double intX;
    private double intY;
    private double finX;
    private double finY;
    private double deltaX;
    private double deltaY;
    // basically the initial ordered pair taken, then the final ordered pair taken

    public LinearEquation(String firstPair, String secondPair){
        intX = intXFromOrderedPair(firstPair);
        intY = intYFromOrderedPair(firstPair);
        finX = intXFromOrderedPair(secondPair);
        finY = intYFromOrderedPair(secondPair);
        deltaX = finX - intX;
        deltaY = finY - intY;
    }
    // gives us the two ordered pairs as formal parameters which can then be used to figure out the slope and such

    public double findSlope(){ // find the slope to our problem!
        double slope = deltaY / deltaX;
        return slope;
    }

    public double findYIntercept(){ // reworked the usual "y = mx + b" to y - mx = b to find our y-intercept
        double yIntercept = intY - (findSlope() * intX);
        return yIntercept;
    }

    public void slopeInterceptFormula(){ // writes out my slope intercept formula
        System.out.println("y = " + deltaY + "/" + deltaX + " * x + (" + findYIntercept() + ")");
    }

    public double calcValue(double input){ // calculates the value based on the given input and the slope formula for it
        double result = findSlope() * input + findYIntercept();
        return result;
    }

    public int intXFromOrderedPair(String orderedPair){ // returns the x value from the given ordered pair as an int
       String noParentheses = orderedPair.substring(1, orderedPair.length() - 1);
       int whereComma = orderedPair.indexOf(",");
       String firstNum = orderedPair.substring(1, whereComma);
       String secondNum = orderedPair.substring(whereComma + 1, orderedPair.length() - 1);
       int xNum = Integer.parseInt(firstNum);
       int yNum = Integer.parseInt(secondNum);
       return xNum;
    }
    public int intYFromOrderedPair(String orderedPair){ // returns the y value from the given ordered pair as an int
        String noParentheses = orderedPair.substring(1, orderedPair.length() - 1);
        int whereComma = orderedPair.indexOf(",");
        String firstNum = orderedPair.substring(1, whereComma);
        String secondNum = orderedPair.substring(whereComma + 1, orderedPair.length() - 1);
        int xNum = Integer.parseInt(firstNum);
        int yNum = Integer.parseInt(secondNum);
        return yNum;
    }
    public void toString(String firstPair, String secondPair){ // where the entire program basically is output
        // (cont. from line 59) based on the inputs the user gives
        int initialX = intYFromOrderedPair(firstPair);
        int initialY = intYFromOrderedPair(firstPair);
        int finalX = intXFromOrderedPair(secondPair);
        int finalY = intYFromOrderedPair(secondPair);
        System.out.println("-------------------------------------------");
        System.out.println("First pair: " + firstPair);
        System.out.println("Second pair: " + secondPair);
        System.out.print("Slope of line: ");
        slopeInterceptFormula();
        System.out.println("Slope of line: " + findSlope());
        System.out.println("Y-intercept: " + findYIntercept());
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.print("Distance between points: " );
        System.out.printf("%.2f" + "\n", Math.sqrt(Math.pow(finalX - initialX, 2) + Math.pow(finalY - finalX, 2)));
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Enter a new value: ");
        double newXVal = s.nextDouble();
        double newYVal = findYIntercept() + findSlope() * newXVal;
        System.out.println("The coordinate for this is: (" + newXVal + "," + newYVal + ")");
        System.out.println();
        System.out.println("-------------------------------------------");
    }
}
