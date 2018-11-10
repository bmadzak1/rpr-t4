package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Student {
    String ime;
    String prezime;
    int brojIndeksa;
    int ECTSKrediti;
    ArrayList<Predmet> predmeti = new ArrayList<Predmet>();

    public Student(String ime, String prezime, int brojIndeksa){
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }

    public String dajIme(){
        return ime;
    }

    public String dajPrezime(){
        return prezime;
    }

    public int dajBrojIndeksa(){
        return brojIndeksa;
    }

    public int dajECRSKredite(){
        return ECTSKrediti;
    }

    public void postaviECTSKredite(int ects){
        ECTSKrediti = ects;
    }

    public String ispisi(){
        String s;
        s = ime + " " + prezime + "(" + brojIndeksa + ")";
        return  s;
    }

    public void ispisiPredmete(){
        predmeti.clear();
        postaviECTSKredite(0);
    }
}
