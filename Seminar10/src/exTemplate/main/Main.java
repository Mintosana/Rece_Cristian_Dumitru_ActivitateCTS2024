package exTemplate.main;


import exTemplate.clase.AchizitieMedicamente;
import exTemplate.clase.AchizitiePeBazaDeReteta;
import exTemplate.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta1=new Reteta(1234);
        reteta1.adaugareMedicamente("Paracetamol");
        reteta1.adaugareMedicamente("Mig400");

        AchizitieMedicamente achizitie1=new AchizitiePeBazaDeReteta(reteta1);
        achizitie1.achitioneazaMedicamente();

        System.out.println();
        Reteta reteta2=new Reteta(1235);
        reteta2.adaugareMedicamente("Paracetamol");
        reteta2.adaugareMedicamente("Ceva");

        AchizitieMedicamente achizitie2=new AchizitiePeBazaDeReteta(reteta1);
        achizitie2.achitioneazaMedicamente();
    }
}
