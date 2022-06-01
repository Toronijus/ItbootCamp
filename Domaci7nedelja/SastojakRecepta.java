package Domaci7nedelja;

public class SastojakRecepta extends Sastojak {
    /*
    2. Направити класу СастојакРецепта која наслеђује Састојак и има додатно:
Количина састојка (У јединици мере, као изнад)
Описује колико нам састојка треба за неки конкретан рецепт
Метода: ukupnaCena()
Враћа укупну цену састојка
// Пример прављења и коришћења:
x = new SastojakRecepta("Brasno", 0.075, 300.0); // Ово описује састојак који кошта 0.075 динара по граму, а
за рецепт је потребно 300 грама
x.ukupnaCena(); // Враћа 22.5 | Објашњење: 300 * 0.075
      */

    private int kolicina;

    public SastojakRecepta(String naziv, double cena, int kolicina) {
        super(naziv, cena);
        this.kolicina = kolicina;
    }

    public int getKolicina(SastojakRecepta n) {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public void cenaSastojka(double cena, int kolicina){
         double sumCena;
        sumCena = cena * (double )kolicina;


    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(kolicina).append("  ").append(super.toString()).append("\n");
     return sb.toString();
    }
}
