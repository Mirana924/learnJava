public class Triangle {
    // static variable
    static  int numOfSides = 3;
    // instance variables, because every instance share those same variables
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // constructors
    public Triangle(double base, double height,double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
    public static void main(String[] args) {

    }
}
