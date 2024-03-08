package guvernelelumii.main;


import guvernelelumii.model.GuvernRegistry;

public class Program {
    public static void main(String[] args) {
        GuvernRegistry guvernReg= GuvernRegistry.getInstance();
        guvernReg.adaugaGuvern("Romania","Marian",12);
        guvernReg.adaugaGuvern("Romania","Mariana",19);
        guvernReg.adaugaGuvern("Ungaria","Dorin",17);

        System.out.println(guvernReg.getGuvern("Romania"));
        System.out.println(guvernReg.getGuvern("Ungaria"));


    }
}
