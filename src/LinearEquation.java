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

    public int intFromOrderedPair(String orderedPair){
       String noParentheses = orderedPair.substring(1, orderedPair.length() - 1);
       int whereComma = orderedPair.indexOf();
    }
}
