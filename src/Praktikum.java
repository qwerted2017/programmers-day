import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println("12.09." + year);
        } else {
            System.out.println("13.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) { // не високосный
            return false;
        } else {
            if (year % 100 == 0) {
                if (year % 400 == 0) { // Делится на 4, на 100 и на 400 - викосный
                    return true;
                } else { // Столетие, но не високосный год.
                    return false;
                }
            } else { // Високосный и не столетие
                return true;
            }
        }
    }
}