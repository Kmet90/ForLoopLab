import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            int number = 0;
            switch (word.charAt(i)) {
                case 'a':
                    number = 1;
                    break;
                case 'e':
                    number = 2;
                    break;
                case 'i':
                    number = 3;
                    break;
                case 'o':
                    number = 4;
                    break;
                case 'u':
                    number = 5;
                    break;
            }
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
