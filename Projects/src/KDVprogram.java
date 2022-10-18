import java.sql.SQLOutput;
import java.util.Scanner;

public class KDVprogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat, kdvlifiyat;
        System.out.println("Fiyat Giriniz: ");
        fiyat = input.nextDouble();
        if (fiyat > 0 && fiyat <= 1000){
            kdvlifiyat = (fiyat * 0.18)+ fiyat;
            System.out.println("KDVli tutar :"+kdvlifiyat);
        }else if (fiyat>1000){
            kdvlifiyat = (fiyat * 0.08)+ fiyat;
            System.out.println("KDVli tutar :"+kdvlifiyat);
        }else
            System.out.println("Yanlış değer girdiniz tekrar deneyiniz.");
    }
}
