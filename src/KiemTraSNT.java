import java.util.Scanner;

public class KiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");

        int number = scanner.nextInt();
        int i = 2;
        boolean check = true;

        if (number < 2) {
            System.out.print(number + " is not a prime");
        } else
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
                if (check) {
                    System.out.print(number + " is a prime");
                } else
                    System.out.print(number + "is not a prime");
            }
    }
}
