package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Predmet {
    String imePredmeta;
    int brojECTSKredita;
    ArrayList<Student> studenti = new ArrayList<Student>();
    boolean izborni;
    int brojStudenata;
    int kapacitet;

    public Predmet(String ime, int ects, boolean izborni){
        imePredmeta = ime;
        brojECTSKredita = ects;
        this.izborni = izborni;
    }

    public void upisiStudenta(Student student){
        if(brojStudenata < kapacitet) {
            studenti.add(student);
            student.postaviECTSKredite(student.dajECRSKredite() + brojECTSKredita);
            brojStudenata++;
        }
    }

    public void ispisiStudenta(Student student){
        studenti.remove(student);
        student.postaviECTSKredite(student.dajECRSKredite() - brojECTSKredita);
    }

    public boolean jeLiPun(){
        return (brojStudenata == kapacitet);
    }

    public String dajIme(){
        return imePredmeta;
    }

    public int dajECTSKredite(){
        return brojECTSKredita;
    }

    public boolean jaLiIzborni(){
        return izborni;
    }

    public void ispisiStudente(){
        studenti.clear();
    }
}
