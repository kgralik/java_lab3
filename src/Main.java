import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */


        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        Osoba O1 = new Osoba("Kamil", "Gralik", 1);
        Student student1 = new Student(O1, enumWydzial.INFORMATYKA);

        Osoba O2 = new Osoba("Pola", "Pies", 2);
        Student student2 = new Student(O2, enumWydzial.PEDAGOGIKA);

        Osoba O3 = new Osoba("Maciej", "Opara", 3);
        Student student3 = new Student(O3, enumWydzial.INFORMATYKA);

        Osoba O4 = new Osoba("Karolina", "Kruszyńska", 4);
        Student student4 = new Student(O4, enumWydzial.PRAWO);

        Osoba O5 = new Osoba("Jan", "Kowalski", 5);
        Student student5 = new Student(O5, enumWydzial.INFORMATYKA);

        ArrayList listaStudentow = new ArrayList();
        listaStudentow.add(student1);
        listaStudentow.add(student2);
        listaStudentow.add(student3);
        listaStudentow.add(student4);
        listaStudentow.add(student5);

        for (Object i : listaStudentow) {
            System.out.println(i.toString());
        }
    }
}
