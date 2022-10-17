import java.util.Scanner;
public class LinearEquation {
    private double intX;
    private double intY;
    private double finX;
    private double finY;
    private double deltaX;
    private double deltaY;
    // basically the initial ordered pair taken, then the final ordered pair taken

    public LinearEquation(double initialX, double initialY, double finalX, double finalY){
        intX = initialX;
        intY = initialY;
        finX = finalX;
        finY = finalY;
        deltaX = finX - intX;
        deltaY = finY - finX;
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
        System.out.println("y = " + deltaY + "/" + deltaX + "x + (" + findYIntercept() + ")");
    }

    public double calcValue(double input){
        double result = findSlope() * input + findYIntercept();
        return result;
    }

    public int intXFromOrderedPair(String orderedPair){
       String noParentheses = orderedPair.substring(1, orderedPair.length() - 1);
       int whereComma = orderedPair.indexOf(",");
       String firstNum = orderedPair.substring(1, whereComma);
       String secondNum = orderedPair.substring(whereComma + 1, orderedPair.length() - 1);
       int xNum = Integer.parseInt(firstNum);
       int yNum = Integer.parseInt(secondNum);
       return xNum;
    }
    public int intYFromOrderedPair(String orderedPair){
        String noParentheses = orderedPair.substring(1, orderedPair.length() - 1);
        int whereComma = orderedPair.indexOf(",");
        String firstNum = orderedPair.substring(1, whereComma);
        String secondNum = orderedPair.substring(whereComma + 1, orderedPair.length() - 1);
        int xNum = Integer.parseInt(firstNum);
        int yNum = Integer.parseInt(secondNum);
        return yNum;
    }
    public void toString(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an ordered pair: ");
        String firstPair = s.nextLine();
        System.out.println("Enter another ordered pair: ");
        String secondPair = s.nextLine();
        System.out.println("First pair: " + firstPair);
        System.out.println("Second pair: " + secondPair);
        intX = intXFromOrderedPair(firstPair);
        intY = intYFromOrderedPair(firstPair);
        finX = intXFromOrderedPair(secondPair);
        finY = intYFromOrderedPair(secondPair);
        System.out.print("Slope of line: ");
        slopeInterceptFormula();
        System.out.println("Slope of line: " + findSlope());
        System.out.println("Y-intercept: " + findYIntercept());
        System.out.print("Distance between points:" );
        System.out.println(Math.sqrt(Math.pow()));
    }
}
