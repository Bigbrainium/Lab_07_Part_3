import java.util.Scanner;

public class TempCToF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tempC = 0.00;
        double tempF;
        boolean valid = false;
        boolean run = true;
        String check = "n";


        while (run){
            System.out.println("Input the temperature in Celsius");
            valid = false;
            do {
                if (scan.hasNextDouble()) {

                    valid = true;
                    tempC = scan.nextDouble();
                } else {
                    System.out.println("Please enter a valid input");
                }
                scan.nextLine();

            } while (!valid);

            tempF = tempC * 9 / 5 + 32;
            System.out.printf("%-7s %7.2f", "Degrees C:", tempC);
            System.out.printf("\n%-9s %7.2f", "Degrees F:", tempF);

            System.out.println(" ");
            System.out.println("Continue? [Y/N]");
            check = scan.nextLine();
            System.out.println(" ");
            if (check.equalsIgnoreCase("n")) {
                run = false;
            }
        }
    }
}