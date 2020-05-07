public class Main {
    public static void main(String[] args) {
        studentProfile studentA = new studentProfile("James", "Wloof",
                2019, 3.40, "Finance");

        System.out.println("The increment graduation year is " + studentA.incrementExpectedGraduationYear());
    }
}