import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String question = "Which country is the third-largest country?";
        String choiceOne = "USA";
        String choiceTwo = "China";
        String choiceThree = "Australia";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        if (userInput.equals("China")) {
            System.out.println("Congrats! Your answer is correct!");
        } else {
            System.out.println("Sorry, the answer is not right.");
        }
    }
}