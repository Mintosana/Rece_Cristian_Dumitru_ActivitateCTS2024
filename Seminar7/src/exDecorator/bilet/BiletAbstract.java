package exDecorator.bilet;

public abstract class BiletAbstract {
private String echipaGazda;
private String echipaOaspete;
private Double pret;

    public BiletAbstract(String echipaGazda, String echipaOaspete, Double pret) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.pret = pret;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public String getEchipaOaspete() {
        return echipaOaspete;
    }

    public void setEchipaOaspete(String echipaOaspete) {
        this.echipaOaspete = echipaOaspete;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "BiletAbstract{" +
                "echipaGazda='" + echipaGazda + '\'' +
                ", echipaOaspete='" + echipaOaspete + '\'' +
                ", pret=" + pret +
                '}';
    }

    public abstract void printareBilet();
}
