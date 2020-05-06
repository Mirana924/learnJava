public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3,3, 3);

        double triAArea = triangleA.findArea();
        System.out.println("The area for triangle A is " + triAArea);

        double triBArea = triangleB.findArea();
        System.out.println(triBArea);

        System.out.println(triangleA.sideLenOne);

        System.out.println(Triangle.numOfSides);
    }
}