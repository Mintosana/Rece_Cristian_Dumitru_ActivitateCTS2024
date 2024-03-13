package SimpleFactory.clase;

public class FactoryPersonal {
    public PersonalSpital creareAngajat(TipAngajat tipAngajat,String nume, int salariu, int vechime){
        switch(tipAngajat){
            case MEDIC: return new Medic(nume,salariu,vechime);
            case ASISTENT: return new Asistent(nume,salariu);
            case BRANCARDIER: return new Brancardier(nume,salariu);
            case INFIRMIER: return new Infirmier(nume,salariu);

            default: return null;
        }
    }
}
