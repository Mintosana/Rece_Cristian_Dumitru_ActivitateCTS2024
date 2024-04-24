package exObserver.restaurant;

import exObserver.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> listaObserveri;

    public Subiect() {
        this.listaObserveri = new ArrayList<>();
    }

    public void adaugaClient(Observer observer){
        listaObserveri.add(observer);
    }

    public void stergeClient(Observer observer){
        listaObserveri.remove(observer);
    }
    protected void notificaClient(String mesaj){
        for (Observer client: listaObserveri) {
            client.primesteNotificare(mesaj);
        }
    }
    abstract public void notificareSchimbarePret();
    abstract public void notificareSchimbareMeniu();
    abstract public void notificareEveniment(String data);
}
