package main;

import model.animal.Leu;
import model.animal.Maimuta;
import model.animal.Zebra;
import model.animal.ZooKeeper;
import model.zoo.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo=new Zoo("Zoolandia",new ZooKeeper("Dorel"),null);
        Leu leu=new Leu("Sparky",4,4);
        zoo.adaugaAnimal(leu,"carne de pui");
        zoo.adaugaAnimal(new Zebra("Morty",5,4),"fan");
        zoo.adaugaAnimal(new Maimuta("Cici",6,4),"banane");
        zoo.hranesteToateAnimalele();
        tipuriAnimale tip=tipuriAnimale.LEU;

    }

    public enum tipuriAnimale{
        LEU,
        MAIMUTA,
        ZEBRA

    }
}