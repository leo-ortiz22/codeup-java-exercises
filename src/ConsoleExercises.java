import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;

//        System.out.printf("The value of pi is approximately %.2f%n", pi);
//
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int nextInt = scanner.nextInt();
        System.out.println(nextInt);

//        System.out.println("Enter a word: ");
//        String firstWord = scanner.next();
//
//        System.out.println("Enter another word: ");
//        String secondWord = scanner.next();
//
//        System.out.println("Enter a final word: ");
//        String thirdWord = scanner.next();
//
//        System.out.printf("%n%s %n%s %n%s", firstWord, secondWord, thirdWord);

//        for (int i = 0; i < 3; i ++){
//            String userInput = scanner.next();
//            System.out.printf("%s%n",userInput);
//        }


//        System.out.println("Enter a sentence: ");
//        String userInput = scanner.nextLine();
//        System.out.printf("%s%n" ,userInput);

        System.out.println("Enter the length of the room: ");
        float length = scanner.nextFloat();

        System.out.println("Enter the width of the room: ");
        float width = scanner.nextFloat();


        System.out.println("The perimeter of the room is " + (length * 2  + width * 2 ));




    }
}