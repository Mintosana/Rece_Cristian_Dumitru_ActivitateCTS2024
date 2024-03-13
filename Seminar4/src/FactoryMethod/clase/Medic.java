package FactoryMethod.clase;

public class Medic extends PersonalSpital {

    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }


    @Override
    public void afisare() {
        System.out.println("Medicul " + super.getNume() + " are salariul de " + super.getSalariu());
    }
}
