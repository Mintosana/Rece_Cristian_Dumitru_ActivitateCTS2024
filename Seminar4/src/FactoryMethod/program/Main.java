package FactoryMethod.program;

import FactoryMethod.fabrici.*;
import FactoryMethod.clase.PersonalSpital;

public class Main {
    public static void main(String[] args) {
        FactoryAngajati factoryAsistent = new FactoryAsistent();
        FactoryAngajati factoryMedic = new FactoryMedic();
        FactoryAngajati factoryBrancardier = new FactoryBrancardier();
        FactoryAngajati factoryInfirmier = new FactoryInfirmier();

        ProcesareAngajat(factoryAsistent,"Rares",1234);
        ProcesareAngajat(factoryMedic,"Marian",2311);
        ProcesareAngajat(factoryBrancardier,"Bogdan",1100);
        ProcesareAngajat(factoryInfirmier,"Maricica",3000);
    }

    public static void ProcesareAngajat(FactoryAngajati factory,String nume, int salariu){
        PersonalSpital angajat = factory.creareAngajat(nume,salariu);
        angajat.afisare();
    }
}