package Domaci7nedelja;


import java.util.ArrayList;

public class Recept {/*
3. Направити класу Рецепт која садржи следеће:
Назив рецепта
Тежину рецепта (Број од 1 до 5)
Редом означавају следеће нивое: Почетни, Лак, Средњи, Тежак, Мајсторски
Колекцију састојака (типа СастојакРецепта)
Подразумевани конструктор, get и set методе за све
dodajSastojak(SastojakRecepta sastojak)
Додаје састојак у колекцију
ukloniSastojak(SastojakRecepta sastojak)
Брише састојак из колекције (Водити рачуна о референцама/вредностима)
toString враћа String у следећем формату:
Шпагете у белом сосу:
Тежина: Средњи ниво
Састојци: Шпагете, Павлака за кување, Бели лук, Ћуреће месо, Маслац, Јаја, Бибер, Со

Напомена: Океј је и неки други формат ако је све читко и садржи МАКАР исто информација као пример изнад!
Објашњење: Ниво рецепта је био 3, и зато исписујемо Средњи ниво
4. На класу Рецепт додати методе које враћају:
Укупну цену рецепта
*/
    private String NazivRecepta;
    private int tezina;
    private ArrayList<SastojakRecepta> sastojci;

    public String getNazivRecepta() {
        return NazivRecepta;
    }

    public void setNazivRecepta(String nazivRecepta) {
        NazivRecepta = nazivRecepta;
    }

    public Recept(String nazivRecepta, int tezina, ArrayList<SastojakRecepta> sastojci) {
        this.NazivRecepta = nazivRecepta;
        this.tezina = tezina;
        this.sastojci = sastojci;
    }


    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public ArrayList<SastojakRecepta> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<SastojakRecepta> sastojci) {
        this.sastojci = sastojci;
    }


    public void dodajSastojak(SastojakRecepta sastojakRecepta) {
        sastojci.add(sastojakRecepta);
    }

    public void dodajSastojak(SastojakRecepta sastojakRecepta, int i) {
        sastojci.add(i, sastojakRecepta);
    }

    public void ukloniSastojak(SastojakRecepta sastojakRecepta) {
        sastojci.remove(sastojakRecepta);
    }

    public void ukloniSastojak(int i) {
        sastojci.remove(i);
    }

    public String ispisiTezinu() {
        String ispis = null;

        switch (tezina) {
            case (1) -> ispis = "Pocetni";
            case (2) -> ispis = "Lak";
            case (3) -> ispis = "Srednji";
            case (4) -> ispis = "Tezak";
            case (5) -> ispis = "Majstorski";
            default -> System.out.println("Pogresna ocena.");
        }
        return ispis;
    }


/* Negde mi pravi problem umesto da povuce iz sumaCena on mi cenu mnozi sa brojem clanova u Nizu
    public static double ukupnaCena(ArrayList<SastojakRecepta> sastojci,) {
        double sum = 0;
        for (SastojakRecepta d : sastojci) {
            sum += d.sumCena;


        }return sum;
    }*/
        @Override
        public String toString () {
            final StringBuilder sb = new StringBuilder();
            sb.append("Recept :").append(getNazivRecepta()).append("\n");
            sb.append("Tezina recepta: ").append(ispisiTezinu()).append("\n");
            for (SastojakRecepta d : sastojci) {
                sb.append(d.toString());
            }
            return sb.toString();
        }
    }
