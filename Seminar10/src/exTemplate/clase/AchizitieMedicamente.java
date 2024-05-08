package exTemplate.clase;

import java.util.HashMap;
import java.util.Map;

public abstract class AchizitieMedicamente {
    Map<String,Integer> stocuri;

    public AchizitieMedicamente() {
        stocuri=new HashMap<>();
        stocuri.put("Paracetamol",20);
        stocuri.put("Mig400",2);
        stocuri.put("Aspirina",7);
    }
    public final void achitioneazaMedicamente(){
        primesteReteta();
        if(verificaStoc()){
            aducereMedicamente();
            incaseaza();
            emitereBon();
        }
        else {
            respingeAchizitie();
        }
    };
    public abstract void primesteReteta();
    public abstract boolean verificaStoc();
    public abstract void aducereMedicamente();
    public abstract void incaseaza();
    public abstract void emitereBon();
    public abstract void respingeAchizitie();
}
