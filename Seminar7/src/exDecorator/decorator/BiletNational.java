package exDecorator.decorator;

import exDecorator.bilet.BiletAbstract;

public class BiletNational extends DecoratorBilet{
    private double valoareDiscount = 0.9;
    public BiletNational(String echipaGazda, String echipaOaspete, Double pret) {
        super(echipaGazda, echipaOaspete, pret);
    }

    public BiletNational(BiletAbstract biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void printareBilet() {
        this.getBiletAbstract().printareBilet();
        System.out.println("Hai ca poti " + this.getEchipaGazda() + "!!!");
    }

    @Override
    public void aplicaDiscountBilet() {
        this.setPret((this.getBiletAbstract().getPret()*valoareDiscount));
    }
}
