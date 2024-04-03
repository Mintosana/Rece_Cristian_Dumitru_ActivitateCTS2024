package main;

import softNou.Bar;
import softNou.Bautura;
import softVechi.*;

public class Main {

    public static void platesteConsumatie(SoftBucatarie comanda) {
              comanda.printareBon();
    }
    public static void main(String[] args)
    {
        SoftBucatarie bucatarie= new Bucatarie();
        Produs produs=new Produs("Pizza",52);
        Produs produs1=new Produs("Paste",45);
        bucatarie.adaugareProdus(produs);
        bucatarie.adaugareProdus(produs1);

        platesteConsumatie(bucatarie);

        Bar bar= new Bar();
        bar.adaugaBautura(new Bautura(12,"Cola",0));
        bar.adaugaBautura(new Bautura(25,"Mojito",25.5F));

        AdapterComandaBarBucatarie bar1=new AdapterComandaBarBucatarie();
        bar1.adaugaBautura(new Bautura(20,"Cola",0));
        bar1.adaugaBautura(new Bautura(15,"Pepsi",0));
        bar1.adaugaBautura(new Bautura(18,"Sprite",0));

       Bautura bautura=new Bautura(5,"Apa",0);
       AdapterBauturaProdus produs3=new AdapterBauturaProdus(bautura);
       bar1.adaugareProdus(produs3);

        platesteConsumatie(bar1);
    }
}