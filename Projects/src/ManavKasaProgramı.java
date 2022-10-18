import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kg armut aldınız ?");
        armut = input.nextDouble();
        System.out.println("Kaç kg elma aldınız ?");
        elma = input.nextDouble();
        System.out.println("Kaç kg domates aldınız");
        domates = input.nextDouble();
        System.out.println("Kaç km muz aldınız ?");
        muz = input.nextDouble();
        System.out.println("Kaç km patlıcan aldınız ?");
        patlican = input.nextDouble();
        System.out.print("Toplam Tutar= " + ((armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5))+" Türk Lirası");


    }
}
