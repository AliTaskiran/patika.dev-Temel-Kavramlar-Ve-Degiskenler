import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kg, boy,formul ;


        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz:");
        kg =input.nextDouble();
        System.out.print("Boyunuzu Giriniz:");
        boy =input.nextDouble();
        formul= kg/(boy*boy);
        System.out.print("Vücüt Kitle İndeksi " + formul);




    }
}
