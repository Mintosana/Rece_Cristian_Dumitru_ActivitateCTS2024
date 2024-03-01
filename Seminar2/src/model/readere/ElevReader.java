package model.readere;

import model.clase.Aplicant;
import model.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {
    @Override
    public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNext()) {
           Elev elev = new Elev();
           super.citireAplicant(input,elev);
            int clasa = input.nextInt();
            String tutore = input.next();

            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        input.close();
        return elevi;
    }
}
