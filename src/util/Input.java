package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
      this.scanner = new Scanner(System.in);
    }
    public String getString(){

        String userInput = scanner.nextLine();
        return userInput;
    }
    public boolean yesNo() {
        String userInput = scanner.nextLine().toLowerCase();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }
    public int getInt(int min, int max) {
        int userInput = min - 1;
        while (userInput > max || userInput < min){
            System.out.println("Enter an integer between " + min + " and " + max + ".");

            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public int getInt() {
        return scanner.nextInt();
    }
    public double getDouble(double min, double max) {
        double userInput = min - 1;
        while (userInput < min || userInput > max){
            System.out.println("Enter an double between " + min + " and " + max + ".");
            userInput = scanner.nextDouble();
        }
        return userInput;
    }
    public double getDouble() {
        return scanner.nextDouble();
    }

}

