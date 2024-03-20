package Builder.model;

public interface AbstractBuilder {
    public abstract AbstractBuilder adaugaPatRabatabil();
    public abstract AbstractBuilder adaugaMicDejun();
    public abstract AbstractBuilder adaugaPapuciCamera();
    public abstract AbstractBuilder adaugaHalatInterior();

    public abstract Pacient build();
}
