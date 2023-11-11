import java.util.ArrayList;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        System.out.print("Enter a number (no spaces): ");
        Scanner scan = new Scanner(System.in);

        ArrayList<Float> arrayNum = new ArrayList<>();

        while (scan.hasNextFloat()) {

            arrayNum.add(scan.nextFloat());

            Float sum = 0f;
            Float average = 0f;

            for (int i = 0; i < arrayNum.size(); i++) {
                sum += arrayNum.get(i);
            }

            average = sum / arrayNum.size();

            System.out.println("The current SUM is: " + sum);
            System.out.println("The current AVERAGE is: " + average);
            System.out.println();
            System.out.print("Enter another number: ");
        }

        if (!scan.hasNextFloat()) {
            System.out.println("Invalid.");
        }

    }
}
