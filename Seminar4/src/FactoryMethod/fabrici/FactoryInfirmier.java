package FactoryMethod.fabrici;

import FactoryMethod.clase.Infirmier;
import FactoryMethod.clase.PersonalSpital;

public class FactoryInfirmier implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Infirmier(nume,salariu);
    }
}
