package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Student {
    String ime;
    String prezime;
    int brojIndeksa;
    int ETCSKrediti;
    ArrayList<Predmet> predmeti = new ArrayList<Predmet>();

    public Student(String ime, String prezime, int brojIndeksa){

    }

    public String dajIme(){
        return null;
    }

    public String dajPrezime(){
        return null;
    }

    public int dajBrojIndeksa(){
        return 0;
    }

    public int dajETCSKredite(){
        return 0;
    }

    public void postaviETCSKredite(int etcs){

    }

    public void ispisi(){

    }

    public void upisiSemestar(Semestar semestar){

    }

    public void ispisiPredmete(){

    }
}
