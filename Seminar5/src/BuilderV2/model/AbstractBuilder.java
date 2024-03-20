package BuilderV2.model;

public interface AbstractBuilder {
    public abstract AbstractBuilder adaugaPatRabatabil(boolean arePatRabatabil);
    public abstract AbstractBuilder adaugaMicDejun(boolean areMicDejunInclus);
    public abstract AbstractBuilder adaugaPapuciCamera(boolean arePapuciCamera);
    public abstract AbstractBuilder adaugaHalatInterior(boolean areHalatInterior);

    public abstract Pacient build();
}
