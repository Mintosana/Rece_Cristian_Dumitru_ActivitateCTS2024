package exState.clase;

public class Reteta {
    private int idReteta;
    private StareReteta stare;
    private int numarMedicamente;

    public Reteta(int idReteta, int numarMedicamente) {
        this.idReteta = idReteta;
        this.numarMedicamente = numarMedicamente;
        this.stare = new StareRetetaEmisa();
    }

    protected void setStareReteta(StareReteta stare){
        this.stare=stare;
    }

    public void solicitaMedicamente(){
        if(this.stare instanceof StareRetetaEmisa){
            System.out.println("Reteta cu numarul "
                    +this.idReteta+" au fost solicitate "
                    +this.numarMedicamente+" medicamente.");
            StareReteta stareSolicitata=new StareRetetaSolicitata();
            stareSolicitata.schimbaStare(this);

//            alta varianta
//            this.stare=new StareRetetaSolicitata();
        }else{
            System.out.println("Medicamentele din reteta numarul "+
                    this.idReteta+" nu pot fi solicitate.");
        }
    }

    public void cumparaMedicamente(){
        if(this.stare instanceof StareRetetaSolicitata){
            System.out.println("Reteta cu numarul "
                    +this.idReteta+" a fost folosita pentru a cumpara "
                    +this.numarMedicamente+" medicamente.");
            StareReteta stareAchizitionata=new StareRetetaAchizitionata();
            stareAchizitionata.schimbaStare(this);
        }else{
            System.out.println("Medicamentele din reteta numarul "+
                    this.idReteta+" nu pot fi cumparate.");
        }
    }

    public void respingeReteta(){
        if(this.stare instanceof StareRetetaSolicitata){
            System.out.println("Ne pare rau, nu sunt disponibile medicamente pentru reteta "
            + this.idReteta+'.');
            StareReteta stareEmisa=new StareRetetaEmisa();
            stareEmisa.schimbaStare(this);
        }else{
            System.out.println("Reteta nu poate fi respinsa.");
        }
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "idReteta=" + idReteta +
                ", stare=" + stare +
                ", numarMedicamente=" + numarMedicamente +
                '}';
    }
}
