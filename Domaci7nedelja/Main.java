package Domaci7nedelja;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {/*
0. Main класу која садржи main методу
У њој инстанцирати креиране класе (Направити објекте)
Такође позвати све направљене методе (Тестирати методе и објекте)
1. Направити класу Састојак која садржи следеће:
Назив састојка
Цену састојка (По јединици мере, због једноставности)
Јаје - Цена по Комаду
Млеко - Цена по Милилитру
Брашно - Цена по Граму
// Пример
*/

    public static void main(String[] args) {

        Sastojak s1 = new Sastojak("Jaje", 13.0);
        SastojakRecepta s2 = new SastojakRecepta("Brasno", 0.06, 300);
        SastojakRecepta s3 = new SastojakRecepta("Mleko", 0.08, 200);
        SastojakRecepta s4 = new SastojakRecepta("jaje", 15, 5);
        ArrayList<SastojakRecepta> sastojciSpageta = new ArrayList<>();
        Recept Spagete = new Recept("Spagete", 2,sastojciSpageta);
        sastojciSpageta.add(s3);
        sastojciSpageta.add(s2);
        sastojciSpageta.add(s4);
        System.out.println(s1.getCena());

        System.out.println(s1);
        System.out.println("___________________");
        System.out.println(Spagete);
       /* System.out.println(Spagete.ukupnaCena(sastojciSpageta));

        System.out.println("Cena ovog recepta je : " +Spagete.ukupnaCena(sastojciSpageta));*/
    }
}
