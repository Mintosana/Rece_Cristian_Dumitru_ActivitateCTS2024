package exObserver.restaurant;

public class Restaurant extends Subiect{
    private String adresa;

    public Restaurant(String adresa) {
        this.adresa = adresa;
    }
    @Override
    public void notificareSchimbarePret() {
        super.notificaClient("Restaurantul de la adresa " + adresa + " are o oferta buna buna");
        System.out.println("\n\n");
    }

    @Override
    public void notificareSchimbareMeniu() {
        super.notificaClient("Restaurantul de la adresa " + adresa + " si-a schimbat meniul");
        System.out.println("\n\n");
    }

    @Override
    public void notificareEveniment(String data) {
        super.notificaClient("In data " + data + " la restaurantul cu adresa " + adresa + " va avea loc un eveniment!!!");
        System.out.println("\n\n");
    }
}
