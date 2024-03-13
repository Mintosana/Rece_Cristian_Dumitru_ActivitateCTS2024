package FactoryMethod.clase;

public class Infirmier extends PersonalSpital{
    public Infirmier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Infirmierul " + super.getNume() + " are salariul de " + super.getSalariu());
    }
}
