public class studentProfile {
    //instance variables
    String firstName;
    String lastName;
    int expectedGradYear;
    double GPA;
    String declaredMajor;

    public studentProfile(String firstName, String lastName,
                          int expectedGradYear, double GPA,
                          String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGradYear = expectedGradYear;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public int incrementExpectedGraduationYear(){
        return(this.expectedGradYear + 1);
    }
}
