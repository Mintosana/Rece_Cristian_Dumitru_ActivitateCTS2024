package Prototype.model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements AbstractReteta{
    private String numeMedicament;
    private Map<String,Double> compozitieMedicament;
    private Double gramaj;

    public Reteta(String numeMedicament, Map<String, Double> compozitieMedicament, Double gramaj) {
        this.numeMedicament = numeMedicament;
        this.compozitieMedicament = compozitieMedicament;
        this.gramaj = gramaj;

        Double suma=0.0;
        for (Double cantitate: compozitieMedicament.values()){
            suma = suma+cantitate;
        }
        if(suma >  gramaj + 0.1 || suma < gramaj - 0.1 ){
            throw new RuntimeException("Gramaj incorect!");
        }
    }

    private Reteta(){

    }

    @Override
    public AbstractReteta cloneaza() {
        Reteta reteta = new Reteta();
        reteta.numeMedicament = this.numeMedicament;
        reteta.compozitieMedicament = new HashMap<>();
        for(String cheie: this.compozitieMedicament.keySet()){
            reteta.compozitieMedicament
                    .put(cheie,this.compozitieMedicament.get(cheie));
        }

        reteta.gramaj = this.gramaj;
        return reteta;
    }

    @Override
    public void setNumeMedicament(String nume) {
        this.numeMedicament = nume;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numeMedicament='" + numeMedicament + '\'' +
                ", compozitieMedicament=" + compozitieMedicament +
                ", gramaj=" + gramaj +
                '}';
    }
}
