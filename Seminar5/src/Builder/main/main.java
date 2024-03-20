package Builder.main;

import Builder.model.AbstractBuilder;
import Builder.model.Pacient;
import Builder.model.PacientBuilder;

public class main {
    public static void main(String[] args) {
        AbstractBuilder builder = new PacientBuilder("Andrei");

        Pacient pacient =
                builder.adaugaHalatInterior()
                        .adaugaMicDejun()
                        .build();

        System.out.println(pacient);
    }
}
