package exObserver.restaurant;

public class SalaDeSport extends Subiect{
    @Override
    public void notificareSchimbarePret() {
        throw new RuntimeException();
    }

    @Override
    public void notificareSchimbareMeniu() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void notificareEveniment(String data) {
        super.notificaClient("In data " + data + " la sala de sport va avea loc un eveniment!!!");
        System.out.println("\n\n");
    }

    public void notificareMeciVolei(){
        super.notificaClient("In sala de sport are loc un meci de volei");
        System.out.println("\n\n");
    }
}
