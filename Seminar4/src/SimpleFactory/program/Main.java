package SimpleFactory.program;

import SimpleFactory.clase.FactoryPersonal;
import SimpleFactory.clase.PersonalSpital;
import SimpleFactory.clase.TipAngajat;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal = new FactoryPersonal();
        PersonalSpital medic = factoryPersonal.creareAngajat(TipAngajat.MEDIC,"Marcel",1000,3);
        PersonalSpital asistent = factoryPersonal.creareAngajat(TipAngajat.ASISTENT,"Viorel",1500,0);
        PersonalSpital brancardier = factoryPersonal.creareAngajat(TipAngajat.BRANCARDIER,"Davidescu",5000,0);
        PersonalSpital infirmier = factoryPersonal.creareAngajat(TipAngajat.INFIRMIER,"Eleanor",2500,0);

        medic.afisare();
        asistent.afisare();
        brancardier.afisare();
        infirmier.afisare();
    }
}