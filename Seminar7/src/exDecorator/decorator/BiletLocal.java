package exDecorator.decorator;

import exDecorator.bilet.BiletAbstract;

public class BiletLocal extends DecoratorBilet {
    private double valoareDiscount = 0.9;

    public BiletLocal(String echipaGazda, String echipaOaspete, Double pret) {
        super(echipaGazda, echipaOaspete, pret);
    }

    public BiletLocal(BiletAbstract biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void printareBilet() {
        this.getBiletAbstract().printareBilet();
        System.out.println("Hai ca poti " + this.getEchipaGazda() + "!!!");
    }

    @Override
    public void aplicaDiscountBilet() {
        this.getBiletAbstract().setPret((this.getBiletAbstract().getPret()*valoareDiscount));
    }
}
