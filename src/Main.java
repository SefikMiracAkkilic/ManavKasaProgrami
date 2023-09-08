import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        double armut = 2.14;
        double elma = 3.67;
        double domates =1.11;
        double muz = 0.95;
        double patlican = 5.00;

        System.out.print("Armut Kaç Kilo : ");
        double armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo : ");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo : ");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilo : ");
        double muzkilo = input.nextDouble();

        System.out.print("Patlican Kaç kilo : ");
        double patlicanKilo = input.nextDouble();

        double toplam = 0.0;
        toplam += (armut * armutKilo);
        toplam += (elma * elmaKilo);
        toplam += (domates * domatesKilo);
        toplam += (muz * muzkilo);
        toplam += (patlican * patlicanKilo);
        System.out.print("Toplam Tutar : " + toplam + " TL ");




    }
}