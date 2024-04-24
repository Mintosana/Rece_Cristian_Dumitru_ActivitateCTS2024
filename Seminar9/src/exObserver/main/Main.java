package exObserver.main;

import exObserver.observer.Client;
import exObserver.observer.Observer;
import exObserver.observer.Turist;
import exObserver.restaurant.Restaurant;
import exObserver.restaurant.SalaDeSport;
import exObserver.restaurant.Subiect;

public class Main {
    // EX 12 DE LA B
    public static void main(String[] args) {
        Subiect restaurant = new Restaurant("Str Mircea Badea 23");

        Observer client1 = new Client("Marcel");
        Observer client2 = new Client("Cristi");
        Observer client3 = new Client("Alin");
        Observer client4 = new Client("Alina");
        Observer client5 = new Client("Maria");

        restaurant.adaugaClient(client1);
        restaurant.adaugaClient(client2);
        restaurant.adaugaClient(client3);
        restaurant.adaugaClient(client4);
        restaurant.adaugaClient(client5);

        restaurant.notificareEveniment("11 Septembrie");

        restaurant.stergeClient(client1);
        restaurant.stergeClient(client5);
        restaurant.stergeClient(client3);

        restaurant.notificareSchimbareMeniu();

        restaurant.stergeClient(client2);
        restaurant.adaugaClient(client5);

        restaurant.notificareSchimbarePret();

        Observer turist1 = new Turist();
        restaurant.adaugaClient(turist1);

        restaurant.notificareEveniment("10 Iulie");

        Subiect salaSport = new SalaDeSport();
        salaSport.adaugaClient(client1);
        salaSport.adaugaClient(client2);
        salaSport.adaugaClient(turist1);

        salaSport.notificareEveniment("13 Ianuarie");
        ((SalaDeSport)salaSport).notificareMeciVolei();

    }
}
