package BuilderV2.model;



public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciCamera;
    private boolean areHalatInterior;

    protected Pacient(String nume, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciCamera, boolean areHalatInterior) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalatInterior = areHalatInterior;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    protected void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    protected void setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
    }

    public class PacientBuilder implements AbstractBuilder {
        private String nume;
        private boolean arePatRabatabil;
        private boolean areMicDejunInclus;
        private boolean arePapuciCamera;
        private boolean areHalatInterior;

        @Override
        public AbstractBuilder adaugaPatRabatabil(boolean arePatRabatabil) {
            this.arePatRabatabil = arePatRabatabil;
            return null;
        }

        @Override
        public AbstractBuilder adaugaMicDejun(boolean areMicDejunInclus) {
            this.areMicDejunInclus = areMicDejunInclus;
            return null;
        }

        @Override
        public AbstractBuilder adaugaPapuciCamera(boolean arePapuciCamera) {
            this.arePapuciCamera = arePapuciCamera;
            return null;
        }

        @Override
        public AbstractBuilder adaugaHalatInterior(boolean areHalatInterior) {
            this.areHalatInterior = areHalatInterior;
            return null;
        }

        @Override
        public Pacient build() {

            return new Pacient(this.nume,this.arePatRabatabil,this.areMicDejunInclus,this.arePapuciCamera,this.areHalatInterior);
        }

    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", arePatRabatabil=" + arePatRabatabil +
                ", areMicDejunInclus=" + areMicDejunInclus +
                ", arePapuciCamera=" + arePapuciCamera +
                ", areHalatInterior=" + areHalatInterior +
                '}';
    }
}
