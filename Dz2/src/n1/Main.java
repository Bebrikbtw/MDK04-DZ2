package Exesize1;

import Exesize1.Intefaces.Printable;

public class Main {
    public static void main(String[] args) {
        Book Crew = new Book("CrewChallenge");
        Magazine Vestnik = new Magazine("Владимирский Вестник");
        Book Barmalei = new Book("Бармалей");
        Magazine MyRussia = new Magazine("Моя Россия");

        Printable[] printable;
        printable = new Printable[] {
                Crew, Vestnik, Barmalei, MyRussia
        };

        for (Printable print : printable){
            print.print();
        }

        System.out.println();
        Magazine.printMagazines(printable);

        System.out.println();
        Book.printBooks(printable);
    }
}