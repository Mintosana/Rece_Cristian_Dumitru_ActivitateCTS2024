package exDecorator.main;

import exDecorator.bilet.Bilet;
import exDecorator.bilet.BiletAbstract;
import exDecorator.decorator.BiletLocal;
import exDecorator.decorator.BiletNational;
import exDecorator.decorator.DecoratorBilet;

public class Main {
    public static void main(String[] args) {
        //TREBUIE MODIFICAT, NU SE APLICA DISCOUNTUL
        BiletAbstract bilet1 = new Bilet("A", "B",12.0);
        imprimaBilet(bilet1);

        DecoratorBilet bilet2 = new BiletLocal(bilet1);
        bilet2.aplicaDiscountBilet();
        imprimaBilet(bilet2);

        DecoratorBilet bilet3 = new BiletNational("Romania","Danemarca",20.0);
        bilet3.aplicaDiscountBilet();
        imprimaBilet(bilet3);
    }

    public static void imprimaBilet(BiletAbstract bilet){
        bilet.printareBilet();
    }
}
