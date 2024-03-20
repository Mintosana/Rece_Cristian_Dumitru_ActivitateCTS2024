package Prototype.main;

import Prototype.model.AbstractReteta;
import Prototype.model.Reteta;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<String,Double> hartaIngrediente = new HashMap<>();
        hartaIngrediente.put("HCl",5.0);
        hartaIngrediente.put("H20",20.2);
        hartaIngrediente.put("V-5",11.3);
        Reteta reteta1 = new Reteta("Mig400",hartaIngrediente,36.5);

        AbstractReteta reteta2 = reteta1.cloneaza();
        reteta2.setNumeMedicament("Mag220");
        System.out.println(reteta1);
        System.out.println(reteta2);
    }
}
