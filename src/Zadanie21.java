import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Kwota początkowo zdeponowana na konice: ");
        int kwota_pierwotna = klawisz.nextInt();

        System.out.println("Roczna stopa procentowa: ");
        float stopa_procentowa = klawisz.nextFloat()/100;

        System.out.println("Ile razy w roku odsetki są kapitalizowane " +
                "(np. przy kapitalizacji miesięcznej wpisz 12, " +
                "a przy kapitalizacji kwartalnej — 4),: ");
        int kapitalizacja = klawisz.nextInt();

        System.out.println("Liczba lat, przez jakie środki będą znajdować " +
                "się na koncie i generować odsetki.   ");
        int liczba_lat = klawisz.nextInt();

        double wynik = Math.pow((1+stopa_procentowa/kapitalizacja), kapitalizacja*liczba_lat);

        double kwota_koncowa = kwota_pierwotna*wynik;
        System.out.println("Kwota pieniędzy na koncie po określonej liczbie lat: "+Math.round(kwota_koncowa));
    }
}
