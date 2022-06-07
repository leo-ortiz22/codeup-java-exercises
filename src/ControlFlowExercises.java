import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Question 1.
//            A.
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i = i + 1;
//        }

//        B.
//        long i = 2;
//        System.out.println(i);
//        do {
//                    i *= i  ;
//            System.out.println(i);
//        } while (i <= 1000000);



//        int i;
//        for (i = 5; i < 15; i++ ){
//            System.out.println(i);
//        }
//        System.out.println(i);

//        long i;
//
//        for (i = 2 ; i <= 1000000; i *= i ){
//            System.out.println(i);
//        }


        //Question 2.

//        for (int i = 1; i <= 100; i++)
//            if (((i % 3) == 0) && ((i % 5) == 0))
//                System.out.println("fizzbuzz");
//            else if ((i % 3) == 0)
//                System.out.println("fizz");
//            else if ((i % 5) == 0)
//                System.out.println("buzz");
//            else
//                System.out.println(i);


        //Question 3.
        System.out.println("What number would you like to go up to?");
        int userInput = scanner.nextInt();
        System.out.println(userInput);
        System.out.println("Here is your table! \n");

        System.out.println("number | squared  | cubed ");
        System.out.println("------ | -------  | -----");
        for (userInput = 1; userInput <= 5; userInput++){


        } System.out.println(userInput + "     |");






//Question 4.
//        System.out.println("Enter a grade value from 0 to 100");
//        int userGrade = s.nextInt();
//        System.out.println("Would you like to see your letter grade?  Please enter Yes or No");
//        String userContinue = s.next();
//        if (userContinue.equals("yes")) {
//            if (userGrade > 87) {
//                System.out.println("Your grade is an A");
//            } else if (userGrade > 79) {
//                System.out.println("Your grade is a  B");
//            } else if (userGrade > 65) {
//                System.out.println("Your grade is a C");
//            } else if (userGrade > 59) {
//                System.out.println("Your grade is a D");
//            } else {
//                System.out.println("Your grade is an F");
//
//            }
//        } else {
//            System.out.println("No problem!");
//        }
    }
}