import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {



Scanner scanner = new Scanner(System.in);

        System.out.println("Ask bob a question");

            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (userInput.trim().equals("")) {
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Bob: Whatever.");
            }


        }
    }

