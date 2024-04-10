package exProxy.main;

import exProxy.clase.*;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet = new Bilet("A","B",10.0);
        Client client = new Client("Popescu",13);
        Client altClient = new Client("Gigel",20);
        bilet.vanzareBilet(client);

        BiletAbstract bilet2 = new ProxyBilet(bilet);
        bilet2.vanzareBilet(client);
        bilet2.vanzareBilet(altClient);

        BiletAbstract bilet3 = new ProxyBiletSector(bilet);
        ProxyBiletSector.adaugaLitere('P');

        bilet3.vanzareBilet(client);
        bilet3.vanzareBilet(altClient);

        System.out.println("------------");
        BiletAbstract bilet4 = new ProxyBilet(bilet3);
        bilet4.vanzareBilet(client);
        bilet4.vanzareBilet(altClient);
    }
}
