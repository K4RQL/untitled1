import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Długość rzędu w metrach: ");
        double dlugosc_rzedu = klawisz.nextInt();

        System.out.println("Ilość miejsca zajmowanego przez okratowanie w metrach: ");
        double ilosc_miejsca = klawisz.nextInt();

        System.out.println("Odległość miedzy sadzonkami: ");
        double odleglosc_miedzy_sadzonkami = klawisz.nextInt();

        double liczba_sadzonek = (dlugosc_rzedu-2*ilosc_miejsca)/odleglosc_miedzy_sadzonkami;

        System.out.println("Liczba sadzonek, jakie zmieszczą sie w rzędzie: "+Math.round(liczba_sadzonek));
    }
}
