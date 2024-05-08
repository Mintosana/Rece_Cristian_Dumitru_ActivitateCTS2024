package exTemplate.clase;

public class AchizitiePeBazaDeReteta extends AchizitieMedicamente {
    Reteta reteta;

    public AchizitiePeBazaDeReteta(Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void primesteReteta() {
        System.out.println("A fost primita reteta cu numarul "+reteta.getNumarReteta());
    }

    @Override
    public boolean verificaStoc() {
        for(String medicament: reteta.getMedicamente()){
            if(!super.stocuri.containsKey(medicament)){
                System.out.println("Medicamentul "
                        +medicament+" nu este in stoc.");
                return false;
            }
        }
        return true;
    }

    @Override
    public void aducereMedicamente() {
        System.out.println("S-au adus medicamentele din depozit pentru reteta "+this.reteta.getNumarReteta()+'.');
        for (String medicament: reteta.getMedicamente()){
            super.stocuri.replace(medicament,
                    super.stocuri.get(medicament)-1);
        }
        // trebuie parcurs map-ul pentru a elimina medicamentele cu stoc <= 0
    }

    @Override
    public void incaseaza() {
        System.out.println("S-au incasat banii pentru reteta "+this.reteta.getNumarReteta()+'.');
    }

    @Override
    public void emitereBon() {
        System.out.println("S-a emis bonul pentru reteta "+this.reteta.getNumarReteta()+'.');
    }

    @Override
    public void respingeAchizitie() {
        System.out.println("S-a respins reteta "+this.reteta.getNumarReteta()+", deoarece medicamentele nu sunt disponibile.");
    }
}
