package Builder.model;

public class PacientBuilder implements AbstractBuilder {
    private Pacient pacient;

    public PacientBuilder(String nume) {
        pacient = new Pacient();
        pacient.setNume(nume);
    }

    @Override
    public AbstractBuilder adaugaPatRabatabil() {
        pacient.setArePatRabatabil(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaMicDejun() {
        pacient.setAreMicDejunInclus(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaPapuciCamera() {
        pacient.setArePapuciCamera(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaHalatInterior() {
        pacient.setAreHalatInterior(true);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
