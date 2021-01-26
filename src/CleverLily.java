import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearsLily = Integer.parseInt(scanner.nextLine());
        double priceWash = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int counterToys = 0;
        int counterMoney = 0;
        int sum = 0;
        int sumToys = 0;
        int savedMoney = 0;

        for (int i = 1; i <= yearsLily; i++) {
            if (i % 2 == 0) {
                counterMoney++;
                int money = counterMoney * 10;
                sum = sum + money - 1;
            } else {
                counterToys++;
            }
        }
        sumToys = counterToys * priceToy;
        savedMoney = sum + sumToys;

        if (savedMoney >= priceWash){
            System.out.printf("Yes! %.2f", savedMoney - priceWash);
        } else {
            System.out.printf("No! %.2f", priceWash - savedMoney);
        }
    }
}
