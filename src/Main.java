import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    private static double acquisitionCost;
    private static double residualValue;
    private static int years;

    public static void main(String[] args) {

        System.out.print("1: Straight Line\n2: Sum of the digits\n3: Reducing Balance\nOption -> ");

        switch (scan.nextInt()){
            case 1 -> straightLine();
            case 2 -> sumOfDigits();
            case 3 -> reducingBalance();
            default -> System.out.println("Invalid Input");
        }

    }

    private static void straightLine() {
        System.out.println("Straight Line Depreciation");
        System.out.print("Acquisition Cost -> ");
        acquisitionCost = scan.nextDouble();
        System.out.print("Residual Value -> ");
        residualValue = scan.nextDouble();
        System.out.print("Years -> ");
        years = scan.nextInt();

        double depPerYear = (acquisitionCost - residualValue) / years;
        System.out.println("Depreciation per year: £" + depPerYear);
        for (int i = 1; i <= 5; i++){
            System.out.println("Year " + i + ": £" + (acquisitionCost -= depPerYear));
        }

    }

    private static void reducingBalance() {
        System.out.println("Reducing Balance");
    }

    private static void sumOfDigits() {
        System.out.println("Sum of the digits");
    }
}