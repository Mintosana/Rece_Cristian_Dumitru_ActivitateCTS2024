package FactoryMethod.fabrici;

import FactoryMethod.clase.PersonalSpital;

public interface FactoryAngajati {
    public PersonalSpital creareAngajat(String nume,int salariu);
}
