import java.util.Scanner;

public class ÜcgenAlanHesaplama {
    public static void main(String[] args) {
        int ilkKenar, ikinciKenar, ucuncuKenar, u;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk kenarı giriniz:");
        ilkKenar = input.nextInt();
        System.out.print("İkinci kenarı giriniz:");
        ikinciKenar = input.nextInt();
        System.out.print("Üçüncü kenarı giriniz:");
        ucuncuKenar = input.nextInt();
        u = (ilkKenar + ikinciKenar + ucuncuKenar) / 2;
        alan = Math.sqrt(u * (u - ilkKenar) * (u - ikinciKenar) * (u - ucuncuKenar));
        System.out.println("Aşağıda üçgenin alanı verilmiştir:");
        System.out.println(alan);


    }
}
