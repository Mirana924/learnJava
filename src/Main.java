import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;

        char studentLastInitial = 'H';
        boolean hasPrefectAttendence = true;
        String studentName = "Kayla Hammon";
        char studentFirstInitial = studentName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentName);
        System.out.println(studentFirstInitial);

        System.out.println(studentName + " " + "GPA is" + " " + studentGPA);
        System.out.println("what do you want ti update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentName + " now has a GPA of " + studentGPA);
    }
}
