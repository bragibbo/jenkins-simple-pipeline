import jdk.internal.joptsimple.internal.Strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userChoice;
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        System.out.println("Welcome to the calculator.\nEnter a command: ");
        do {
            userChoice = scanner.next();

            if(userChoice.equals("add")) {
                System.out.println(calculator.add(scanner.nextInt(), scanner.nextInt()));

            } else if (userChoice.equals("subtract")) {
                System.out.println(calculator.subtract(scanner.nextInt(), scanner.nextInt()));

            } else if (userChoice.equals("multiply")) {
                System.out.println(calculator.multiply(scanner.nextInt(), scanner.nextInt()));

            } else if (userChoice.equals("divide")) {
                System.out.println(calculator.divide(scanner.nextInt(), scanner.nextInt()));

            } else if (userChoice.equals("fibonacci")) {
                System.out.println(calculator.fibonacciNumberFinder(scanner.nextInt()));

            } else if (userChoice.equals("binary")) {
                System.out.println(calculator.intToBinaryNumber(scanner.nextInt()));
            }


        } while(userChoice != "quit");

        System.out.println("Goodbye!!");
    }
}
