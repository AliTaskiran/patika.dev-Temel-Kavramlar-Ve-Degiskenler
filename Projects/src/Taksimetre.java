import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double km, ucret, acilis = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç km gittiniz?");
        km = input.nextInt();
        ucret = acilis + (km * 2.20);
        if (km <= 20) {
            System.out.println("Tutar 20 Türk Lirasıdır.");
        } else
            System.out.println("Ücretiniz" + ucret);


    }
}
