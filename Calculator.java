import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        final String error = "Invalid input. Terminating...";
        Scanner input = new Scanner(System.in);
        System.out.println("List of operations: add subtract multiply divide alphabetize");

        System.out.print("Enter an operation: ");
        String op = input.next().toLowerCase();
        input.nextLine();

        if (op.equals("alphabetize")) {
            System.out.print("Enter two words: ");

            if (input.hasNext()) {
                String word1 = input.next();
                if (input.hasNext()) {
                    String word2 = input.next();
                    int check = word1.toLowerCase().compareTo(word2.toLowerCase());
                    if (check > 0) {
                        System.out.println("Answer: " + word2 + " comes before " + word1 + " alphabetically.");
                    } else if (check < 0) {
                        System.out.println("Answer: " + word1 + " comes before " + word2 + " alphabetically.");
                    } else {
                        System.out.println("Answer: Chicken or Egg.");
                    }
                }
            }
        } else if (op.equals("add") || op.equals("subtract")) {
            System.out.print("Enter two integers: ");

            if (input.hasNextInt()) {
                int num1 = input.nextInt();
                if (input.hasNextInt()) {
                    int num2 = input.nextInt();
                    int answer = op.equals("add") ? num1 + num2 : num1 - num2;
                    System.out.println("Answer: " + answer);
                } else {
                    System.out.println(error);
                }
            } else {
                System.out.println(error);
            }
        } else if (op.equals("multiply") || op.equals("divide")) {
            System.out.print("Enter two doubles: ");

            if (input.hasNextDouble()) {
                double double1 = input.nextDouble();
                if (input.hasNextDouble()) {
                    double double2 = input.nextDouble();
                    double answer = op.equals("multiply") ? double1 * double2 : double1 / double2;
                    System.out.printf("Answer: %.2f%n", answer);
                } else {
                    System.out.println(error);
                }
            } else {
                System.out.println(error);
            }
        } else {
            System.out.println(error);
        }

        input.close();
    }
}