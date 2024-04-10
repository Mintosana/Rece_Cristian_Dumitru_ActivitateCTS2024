package exDecorator.decorator;

import exDecorator.bilet.Bilet;
import exDecorator.bilet.BiletAbstract;

public abstract class DecoratorBilet extends BiletAbstract {
    private BiletAbstract biletAbstract;
    public DecoratorBilet(String echipaGazda, String echipaOaspete, Double pret) {
        super(echipaGazda, echipaOaspete, pret);
        this.biletAbstract = new Bilet(echipaGazda,echipaOaspete,pret);
    }

    public DecoratorBilet(BiletAbstract biletDecorat) {
        super(biletDecorat.getEchipaGazda(),biletDecorat.getEchipaOaspete(),biletDecorat.getPret());
        this.biletAbstract = biletDecorat;
    }

    public BiletAbstract getBiletAbstract() {
        return biletAbstract;
    }

    public abstract void aplicaDiscountBilet();
}
