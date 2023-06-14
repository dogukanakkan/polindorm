import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }
    }

    public static boolean isPalindrom(int sayi) {
        int tersSayi = 0;
        int kalan, gecici;

        gecici = sayi;
        while (gecici != 0) {
            kalan = gecici % 10;
            tersSayi = tersSayi * 10 + kalan;
            gecici /= 10;
        }

        return sayi == tersSayi;
    }
}
