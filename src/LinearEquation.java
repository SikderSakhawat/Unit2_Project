import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;
import java.text.DecimalFormat;
public class LinearEquation {
    DecimalFormat df = new DecimalFormat("0.00");
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

    public String slopeInterceptFormula(){ // writes out my slope intercept formula
        return "y = " + deltaY + "/" + deltaX + " * x + (" + findYIntercept() + ")";
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
    public String toString(String firstPair, String secondPair){ // where the entire program basically is output
        // (cont. from line 59) based on the inputs the user gives
        int initialX = intYFromOrderedPair(firstPair);
        int initialY = intYFromOrderedPair(firstPair);
        int finalX = intXFromOrderedPair(secondPair);
        int finalY = intYFromOrderedPair(secondPair);
        String design = "-------------------------------------------";
        String firstPairDisplay = "First pair: " + firstPair;
        String secondPairDisplay = "Second pair: " + secondPair;
        String slopeFormulaDisplay = "Formula of line: " + slopeInterceptFormula();
        String slopeDisplay = "Slope of line: " + findSlope();
        String interceptDisplay = "Y-intercept: " + findYIntercept();
        System.out.println("Distance between points:");
        double distance = Double.parseDouble(df.format(Math.sqrt(Math.pow(finalX - initialX, 2) + Math.pow(finalY - initialY, 2))));
        return design + "\n" + firstPairDisplay + "\n" + secondPairDisplay +
                "\n" + slopeDisplay + "\n" + interceptDisplay + "\n" + slopeFormulaDisplay + "\n" +
                "Distance between points: " + distance;
        }
    }
