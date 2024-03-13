package FactoryMethod.fabrici;

import FactoryMethod.clase.Asistent;
import FactoryMethod.clase.PersonalSpital;

public class FactoryAsistent implements FactoryAngajati {

    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Asistent(nume,salariu);
    }
}
