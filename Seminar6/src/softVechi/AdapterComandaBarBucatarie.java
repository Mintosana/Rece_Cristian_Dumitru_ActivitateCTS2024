package softVechi;

import softNou.Bar;
import softNou.Bautura;

public class AdapterComandaBarBucatarie extends Bar implements SoftBucatarie {
    @Override
    public void printareBon() {
        super.printareNotaDePlata();
    }

    @Override
    public void adaugareProdus(Produs produs) {
        //nu este recomandat asa, trebuia adapter de clase
        Bautura b=new Bautura(produs.getPret(), produs.getDenumire(), 0);
        super.adaugaBautura(b);
    }
}
