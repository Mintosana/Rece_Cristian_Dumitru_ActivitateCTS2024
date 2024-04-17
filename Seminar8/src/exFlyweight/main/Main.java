package exFlyweight.main;

import exFlyweight.clase.Flyweight;
import exFlyweight.clase.FlyweightFactory;
import exFlyweight.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Reteta reteta1 = new Reteta("reteta1",30,3);
        Reteta reteta2 = new Reteta("reteta2",11,1);
        Reteta reteta3 = new Reteta("reteta3",32,4);
        Reteta reteta4 = new Reteta("reteta4",55,6);

        Flyweight client = flyweightFactory.getClient("1234567","Gigel");
        client.achizitionareReteta(reteta1);

        flyweightFactory.getClient("1234567","Gigel").achizitionareReteta(reteta2);

        flyweightFactory.getClient("8765432","Ionel").achizitionareReteta(reteta4);
        flyweightFactory.getClient("8765432","Ionel").achizitionareReteta(reteta1);

        client.achizitionareReteta(reteta3);
    }
}
