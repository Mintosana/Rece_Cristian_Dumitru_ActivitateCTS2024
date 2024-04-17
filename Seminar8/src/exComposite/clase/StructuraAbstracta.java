package exComposite.clase;

public interface StructuraAbstracta {
    public void adaugareCategorie(StructuraAbstracta sa);
    public void stergereCategorie(StructuraAbstracta sa);
    public StructuraAbstracta getCategorie(int index);
    public void afisareProspect(String indentare);
    public void calculeazaPret(double procentDiscount);
}
