package FactoryMethod.fabrici;

import FactoryMethod.clase.Brancardier;
import FactoryMethod.clase.PersonalSpital;

public class FactoryBrancardier implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Brancardier(nume,salariu);
    }
}
