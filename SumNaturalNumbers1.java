import java.util.Scanner;

public class SumNaturalNumbers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0;

            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumLoop);

            if (sumFormula == sumLoop) {
                System.out.println("Both computations match. The result is correct!");
            } else {
                System.out.println("There is an error in computation.");
            }
        }
    }
}
