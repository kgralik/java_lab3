import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Osoba KG = new Osoba("Kamil", "Gralik");
        Osoba JK = new Osoba("Jan", "Kowalski");
        Osoba MO = new Osoba("Maciej", "Opara");

        Pracownik Pracownik1 = new Pracownik("Kamil", "Gralik", "Kierownik");
        Pracownik Pracownik2 = new Pracownik("Maciej", "Opara", "Zastępca");

        Wynagrodzenie WynagrodzeniePracownik1 = new Wynagrodzenie("Artur", "Gralik", "Adowkat",7000);
        Wynagrodzenie WynagrodzeniePracownik2 = new Wynagrodzenie("Henryk", "Lewandowski", "Ratownik",10000);
        Wynagrodzenie WynagrodzeniePracownik3 = new Wynagrodzenie("Pola", "Pola", "Piesiutek",200);

        List<Osoba> Ludzie = new ArrayList<>(List.of(
                MO, KG, JK, Pracownik1, Pracownik2, WynagrodzeniePracownik1, WynagrodzeniePracownik2, WynagrodzeniePracownik3));

        for (Osoba osoba : Ludzie) {
            System.out.println(osoba);
        }
    }
}
