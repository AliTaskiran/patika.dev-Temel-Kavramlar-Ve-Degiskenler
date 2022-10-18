import java.util.Scanner;

public class NotortProg {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz Nedir ?: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz Nedir ?: ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz Nedir ? :");
        kimya = input.nextInt();
        System.out.print("Turkce Notunuz Nedir ?: ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunuz Nedir ?: ");
        tarih = input.nextInt();
        System.out.print("Muzik Notunuz Nedir ?");
        muzik = input.nextInt();

        sonuc=(mat + fizik + kimya + tarih + turkce + muzik) / 5;
        boolean kosul = sonuc >= 50;
        String gecmekosulu = kosul ? "Sınıfı Geçtiniz!" : "Sınıfta Kaldınız :(";
        System.out.println(gecmekosulu);

    }
}
