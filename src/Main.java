import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    private static int acquisitionCost;
    private static double residualValue;
    private static int years;

    static DecimalFormat df = new DecimalFormat("#.####");

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
        acquisitionCost = scan.nextInt();
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
    private static void sumOfDigits() {
        System.out.println("Sum of the digits");
        System.out.print("Acquisition Cost -> ");
        acquisitionCost = scan.nextInt();
        System.out.print("Residual Value -> ");
        residualValue = scan.nextDouble();
        System.out.print("Years -> ");
        years = scan.nextInt();

        int sum = 0;

        for (int i = 0; i <= years; i++){
            sum += i;
        }
        System.out.println("Sum of digits: " + sum);

        int storeAcq = acquisitionCost;
        for (double j = years; j >= 1; j--){
            int depForYear = (int) ((j / sum) * (storeAcq - residualValue));
            acquisitionCost -= depForYear;
            System.out.println(acquisitionCost);
        }

    }

    private static void reducingBalance() {
        System.out.println("Reducing Balance");
        System.out.print("Acquisition Cost -> ");
        acquisitionCost = scan.nextInt();
        System.out.print("Residual Value -> ");
        residualValue = scan.nextDouble();
        System.out.print("Years -> ");
        years = scan.nextInt();

        double percentageCalc = 1 - (Math.pow(residualValue / acquisitionCost, 1.0 / years));
        String format = df.format(percentageCalc);
        System.out.println(Float.parseFloat(format));
        for (int i = 1; i <= years; i++){
            acquisitionCost -= (acquisitionCost * Float.parseFloat(format));
            System.out.println(acquisitionCost);
        }

    }
}