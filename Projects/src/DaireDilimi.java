import java.util.Scanner;

public class DaireDilimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, aciolcusu;
        double pi = 3.14, sonuc;
        System.out.print("r değeri: ");
        r = input.nextInt();
        System.out.print("Açı Ölçüsü değeri: ");
        aciolcusu = input.nextInt();
        sonuc = (pi * (r * r) * aciolcusu) / 360;
        System.out.print("Daire diliminin alanı:" + sonuc);

    }
}
