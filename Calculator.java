import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("List of operations: add subtract multiply divide alphabetize");

        System.out.print("Enter an operation: ");
        String op = input.next();
        input.nextLine(); 

        System.out.println("You chose: " + op);

        if (op.equals("alphabetize")) { 
            System.out.print("Enter two words: ");
            String words = input.nextLine(); 
            System.out.println("You chose: " + words);
        }
        else {
            System.out.print("Enter two integers: ");
            input.nextLine();
            String integers = input.nextLine();
            System.out.println("You chose: " + integers);

            switch (op) {
                case "add":
                    System.out.println("2+3=5");
                    break; 
                case "subtract":
                    System.out.println("10-8=2");
                case "multiply":
                    System.out.println("4*2=8");
                case "divide":
                    System.out.println("8/4=2");
                default:
                    System.out.println("Default");
            }
        }

        input.close();
    }
}
