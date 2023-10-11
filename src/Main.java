import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner option = new Scanner(System.in);
        System.out.print("1: Straight Line\n2: Sum of the digits\n3: Reducing Balance\nOption -> ");

        switch (option.nextInt()){
            case 1 -> straightLine();
            case 2 -> sumOfDigits();
            case 3 -> reducingBalance();
            default -> System.out.println("Invalid Input");
        }

    }

    private static void straightLine() {
        System.out.println("Straight Line");
    }

    private static void reducingBalance() {
        System.out.println("Reducing Balance");
    }

    private static void sumOfDigits() {
        System.out.println("Sum of the digits");
    }
}