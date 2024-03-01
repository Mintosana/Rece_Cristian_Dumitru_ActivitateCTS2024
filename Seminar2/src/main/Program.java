package main;

import model.clase.Angajat;
import model.clase.Aplicant;
import model.readere.AngajatReader;
import model.readere.AplicantReader;
import model.readere.ElevReader;
import model.readere.StudentReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        List<Aplicant> listaElevi;
        List<Aplicant> listaStudenti;

        AplicantReader angajatReader = new AngajatReader();
        AplicantReader elevReader = new ElevReader();
        AplicantReader studentReader = new StudentReader();
        try {
            listaAngajati = angajatReader.readAplicants("Seminar2/angajati.txt");
            for(Aplicant angajat:listaAngajati)
                System.out.println(angajat.toString());

            listaElevi = elevReader.readAplicants("Seminar2/elevi.txt");
            for(Aplicant elev:listaElevi)
                System.out.println(elev.toString());

            listaStudenti = studentReader.readAplicants("Seminar2/studenti.txt");
            for(Aplicant student:listaStudenti)
                System.out.println(student.toString());

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
