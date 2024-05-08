package exTemplate.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta {
    private int numarReteta;
    private List<String> medicamente;

    public Reteta(int numarReteta) {
        this.numarReteta = numarReteta;
        this.medicamente=new ArrayList<>();
    }

    public void adaugareMedicamente(String medicament) {
        this.medicamente.add(medicament);
    }

    public int getNumarReteta() {
        return numarReteta;
    }

    public List<String> getMedicamente() {
        return medicamente;
    }
}
