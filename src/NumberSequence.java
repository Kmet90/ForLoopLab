import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i = 1; i <= numbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= max) {
                max = number;
            }
            if (number <= min) {
                min = number;
            }
        }
        System.out.printf("Max number: %d", max);
        System.out.printf("%nMin number: %d", min);

    }
}
