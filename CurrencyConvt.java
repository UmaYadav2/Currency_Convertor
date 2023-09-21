import java.util.Scanner;

public class CurrencyConvt {

    public static void main(String[] args) {
        System.out.println("1 Rupee");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        Scanner sc = new Scanner(System.in);
        System.out.println("choose the currency");
        int choice = sc.nextInt();
        System.out.println("enter the amount");
        double amount = sc.nextDouble();
        if (choice == 1) {
            Rupee_to_other(amount);
        } else if (choice == 2) {
            Dollar_to_other(amount);
        } else if (choice == 3) {
            Euro_to_other(amount);
        } else {
            System.out.println("invali choice ");
        }
    }

    public static void Rupee_to_other(double amount) {
        System.out.println("1 Rupee =" + 0.013 + "Dollar");
        System.out.println();
        System.out.println(amount + "Rupee=" + (amount * 0.013) + "Dollar");
        System.out.println();

        System.out.println("1 Rupee=" + 0.012 + "Euro");
        System.out.println();
        System.out.println(amount + "Rupee=" + (amount * 0.012) + "Euro");
    }

    public static void Dollar_to_other(double amount) {
        System.out.println("1 Dollar =" + 79.37 + "Rupee");
        System.out.println();
        System.out.println(amount + "Dollar=" + (amount * 79.37) + "Rupee");
        System.out.println();

        System.out.println("1 Dollar=" + 0.98 + "Euro");
        System.out.println();
        System.out.println(amount + "Dollar=" + (amount * 0.98) + "Euro");
    }

    public static void Euro_to_other(double amount) {
        System.out.println("1 Euro=" + 80.85 + "Rupee");
        System.out.println();
        System.out.println(amount + "Euro" + (amount * 80.85) + "Rupee");
        System.out.println();

        System.out.println("1 Euro=" + 1.02 + "Dollar");
        System.out.println();
        System.out.println(amount + "Euro=" + (amount * 1.02) + "Dollar");
    }

}
