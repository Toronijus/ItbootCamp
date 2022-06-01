package Domaci7nedelja;

public class Sastojak {/*
1. Направити класу Састојак која садржи следеће:
Назив састојка
Цену састојка (По јединици мере, због једноставности)
Јаје - Цена по Комаду
Млеко - Цена по Милилитру
Брашно - Цена по Граму
// // Пример прављења:
//new Sastojak("Jaje", 12.5);
*/
    private String naziv;
   private double cena;

    public Sastojak(String naziv, double cena) {
        this.naziv = naziv;

        this.cena = cena;
    }

    public String getNaziv() {
        return naziv ;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv);
        return sb.toString();
    }
}
