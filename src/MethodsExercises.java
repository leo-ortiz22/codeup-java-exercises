import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
rolldice()
        System.out.println(getInteger(1,6));
//        System.out.println(add(4, 2));
//        System.out.println(subtract(6, 2));
//        System.out.println(multiply(3, 2));
//        System.out.println(divide(14, 2));
//        System.out.println(modulus(14, 2));

//        sayName("leo", "ortiz");
//        System.out.println(getInteger(1,10));
//        System.out.println(factorialNum(10));

    }

//    public static void sayName(String name) {
//        sayName("Hi", name);
//    }
//
//    public static void sayName(String name1, String name2) {
//        System.out.println(name1 + ", " + name2 + "!");
//    }
//
//    public static int add(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int subtract(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int multiply(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static int divide(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//    }


//    public static double add(double num1, double num2) {
//        return "";
//    }


// TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
//  a greeting message to the user by either their first or first and last name.

// example: sayName("Justin") - "Hi Justin"
// example: sayName("Justin", "Reich") - "Hi Justin Reich"

// TODO: overload the addition method from the curriculum exercise to both add integers and add doubles


    public static int getInteger(int min, int max) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10 \n");
        String userInput = scanner.nextLine();
        int userInt = Integer.parseInt(userInput);
        if (userInt >= min && userInt <= max) {
            System.out.println("Right answer!");
            return userInt;
        } else {
            return getInteger(min, max);
        }
//public static int factorialNum(int num1) {
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter a number between 1 and 10 \n");
//    String userInput = scanner.nextLine();
//
//    int userIn = Integer.parseInt(userInput);
//int number = 1;
//    for (int i = 1; i < userIn; i++) {
//        number = i * number;
//    }
//    System.out.println("The factorial number of your input is:");
//    return number;
//
//}

        public static int randomDice(min,max){

            return min + (int) (Math.random() * ((max - min) + 1));
        }

        public static void rollDice () {

            System.out.println("Please enter the number of sides for a pair of dice: \n");
            System.out.print("Roll diceg");
            int noOfSidesOfDice = getInteger(1, 6);
            System.out.printf("You rolled %d and a %d",
                    randomDice(1, noOfSidesOfDice),
                    randomDice(1, noOfSidesOfDice));

        }


    }
}













