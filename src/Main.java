import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat) {
            System.out.println("would you like to take this song off of repeat? if so, answer yes");
            String userInput = input.next();

            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("play next song");
    }
}