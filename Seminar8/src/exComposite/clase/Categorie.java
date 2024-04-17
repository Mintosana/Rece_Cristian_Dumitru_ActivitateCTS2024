package exComposite.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements StructuraAbstracta{
    private List<StructuraAbstracta> medicamente;
    private String denumire;
    private Double procentReducere;

    public Categorie(String denumire) {
        this.medicamente = new ArrayList<>();
        this.denumire = denumire;
    }

    public List<StructuraAbstracta> getMedicamente() {
        return medicamente;
    }

    public void setMedicamente(List<StructuraAbstracta> medicamente) {
        this.medicamente = medicamente;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Double getProcentReducere() {
        return procentReducere;
    }

    public void setProcentReducere(Double procentReducere) {
        this.procentReducere = procentReducere;
    }

    @Override
    public void adaugareCategorie(StructuraAbstracta sa) {
        this.medicamente.add(sa);
    }

    @Override
    public void stergereCategorie(StructuraAbstracta sa) {
        this.medicamente.remove(sa);
    }

    @Override
    public StructuraAbstracta getCategorie(int index) {
        if(index >= 0 && index < this.medicamente.size()){
            return this.medicamente.get(index);
        }
        else{
            return null;
        }
    }

    @Override
    public void afisareProspect(String indentare) {
        System.out.println(indentare + "Categoria " + this.denumire + " are urmatoarele subcategorii: ");
        for(StructuraAbstracta element : medicamente){
            element.afisareProspect(indentare + "      ");
        }
    }

    @Override
    public void calculeazaPret(double procentDiscount) {
        for(StructuraAbstracta element : medicamente){
            element.calculeazaPret(procentDiscount);
        }
    }
}
