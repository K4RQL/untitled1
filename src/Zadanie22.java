public class Zadanie22 {
    public static void main(String[] args) {
        int liczba_zakupionych_akcji = 1000;
        double cena_zakupionych_akcji = 32.87;
        double kwota_zaplacona = liczba_zakupionych_akcji * cena_zakupionych_akcji;
        int liczba_sprzedanych_akcji = 1000;
        double cena_sprzedanych_akcji = 33.92;
        double kwota_otrzymana = liczba_sprzedanych_akcji * cena_sprzedanych_akcji;
        double prowizja_brokera = 0.02;
        double wartosc_prowizji_przy_zakupie = kwota_zaplacona * prowizja_brokera;
        double wartosc_prowizji_przy_sprzedazy = kwota_otrzymana * prowizja_brokera;
        double zysk = kwota_otrzymana - wartosc_prowizji_przy_sprzedazy - kwota_zaplacona - wartosc_prowizji_przy_zakupie;

        System.out.println("Kwota zapłacona przez Jacka za akcje: "+kwota_zaplacona+" zł");
        System.out.println("Wartość prowizji zapłaconej brokerowi przy zakupie: "+wartosc_prowizji_przy_zakupie+" zł");
        System.out.println("Kwota otrzymana przez Jacka za akcje: "+kwota_otrzymana+" zł");
        System.out.println("Wartość prowizji zapłaconej brokerowi przy sprzedazy: "+wartosc_prowizji_przy_sprzedazy+" zł");
        System.out.println("Zysk Jacka: "+Math.round(zysk)+" zł");
    }
}
