package singleton;
//click dreapta pe proiect. new module
//c lick dreapta pe src al proiectului new package
public class Guvern {
    private int NrGuveratori;
    private String numePrimMininstru;
    private int nrLuni;
    private static Guvern instanta = null;

    public void setNrGuveratori(int nrGuveratori) {
        NrGuveratori = nrGuveratori;
    }

    public void setNumePrimMininstru(String numePrimMininstru) {
        this.numePrimMininstru = numePrimMininstru;
    }

    public void setNrLuni(int nrLuni) {
        this.nrLuni = nrLuni;
    }

    private Guvern(int nrGuveratori, String numePrimMininstru, int nrLuni) {
        NrGuveratori = nrGuveratori;
        this.numePrimMininstru = numePrimMininstru;
        this.nrLuni = nrLuni;
    }
//**1**
//    public static Guvern getInstance(){
//        if(instanta == null) {
//            instanta = new Guvern(4, "Marcel", 12);
//        }
//            return instanta;
//    }

    //**2**
    public synchronized static Guvern getInstance(int nrGuveratori, String numePrimMininstru, int nrLuni){
        if(instanta == null) {
             instanta = new Guvern(nrGuveratori, numePrimMininstru, nrLuni);
         }
        return instanta;
}

//asta e pt afisare
    @Override
    public String toString() {
        return "Guvern{" +
                "NrGuveratori=" + NrGuveratori +
                ", numePrimMininstru='" + numePrimMininstru + '\'' +
                ", nrLuni=" + nrLuni +
                '}';
    }
}
