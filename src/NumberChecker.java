import java.util.Scanner;

public class NumberChecker {

    public static String checkNumber(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (or 'stop' to quit): ");
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("stop")) {
            boolean validNumber = true;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (!Character.isDigit(c) && c != '.' && c != '-') {
                    validNumber = false;
                    break;
                }
            }


            if (!validNumber) {
                System.out.println("Invalid input. Please enter a number.");
            } else {
                int number = Integer.parseInt(input);
                String result = checkNumber(number);
                System.out.println(number + " is " + result);
            }
            //test


            System.out.print("Enter a number (or 'stop' to quit): ");
            input = scanner.nextLine();
        }
        //test case rub

        scanner.close();

    }
}