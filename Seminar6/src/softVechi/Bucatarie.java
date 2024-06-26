package softVechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie {
   private List<Produs> listaProduse;


    public Bucatarie() {
        this.listaProduse = new ArrayList<>();
    }

    public List<Produs> getListaProduse() {
        return listaProduse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bucatarie{");
        sb.append("listaProduse=").append(listaProduse);
        sb.append('}');
        return sb.toString();
    }

    public void adaugareProdus(Produs produs) {
        this.listaProduse.add(produs);
    }

    @Override
    public void printareBon() {
        System.out.println("Lista de produse este:");
        float total=0;
        for(int i=0;i<listaProduse.size();i++){
            System.out.println("Produsul: "+listaProduse.get(i));
            total=total+listaProduse.get(i).getPret();
        }
        System.out.println("Totalul bonului este: "+total);
    }
}
