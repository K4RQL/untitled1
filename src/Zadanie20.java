import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {

        double szklanki_cukru = 1.5 , szklanki_masla = 1 , szklanki_maki = 2.75;

        Scanner klawisz = new Scanner(System.in);


        System.out.println("Podaj porządaną liczbe ciasteczek: ");
        int liczba_ciasteczek = klawisz.nextInt();

        szklanki_cukru = szklanki_cukru*liczba_ciasteczek/48;
        szklanki_masla = szklanki_masla*liczba_ciasteczek/48;
        szklanki_maki = szklanki_maki*liczba_ciasteczek/48;

        System.out.println("Składniki potrzebne na: "+liczba_ciasteczek+" cisteczek");
        System.out.println("Szklanki Cukru: "+szklanki_cukru);
        System.out.println("Szklanki Masla: "+szklanki_masla);
        System.out.println("Szklanki Mąki: "+szklanki_maki);
    }
}
