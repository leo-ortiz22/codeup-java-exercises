package util;

public class InputTest {
    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println("Enter a string:");
        System.out.println(userInput.getString());
        System.out.println("Enter yes or no or true or false:");
        System.out.println(userInput.yesNo());
        System.out.println(userInput.getInt(1, 10));
        System.out.println("Enter any integer:");
        System.out.println(userInput.getInt());
        System.out.println(userInput.getDouble(1, 10));
        System.out.println("Enter any double:");
        System.out.println(userInput.getDouble());
    }
}