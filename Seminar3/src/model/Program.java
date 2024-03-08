package model;

import singleton.Guvern;


public class Program {
    //psvm ca sa creem main
    public static void main(String[] args) {
        //**1**
//        Guvern guvern=Guvern.getInstance();
//        Guvern guvern2=Guvern.getInstance();
//**2**
        Guvern guvern=Guvern.getInstance(5, "Manole", 12);
        Guvern guvern2=Guvern.getInstance(8, "Manolica", 15);

        System.out.println(guvern);
        System.out.println(guvern2);
    }
}
