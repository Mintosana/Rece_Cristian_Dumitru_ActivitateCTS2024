package exDecorator.bilet;

public class Bilet extends BiletAbstract {

    public Bilet(String echipaGazda, String echipaOaspete, Double pret) {
        super(echipaGazda, echipaOaspete, pret);
    }

    @Override
    public void printareBilet() {
        System.out.println(this);
    }
}
