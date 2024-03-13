package FactoryMethod.clase;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, int salariu) {
        super(nume,salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Brancardierul " + this.getNume() + " are salariul de " + this.getSalariu());
    }
}
