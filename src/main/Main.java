package main;

import model.animal.Leu;
import model.animal.Maimuta;
import model.animal.Zebra;
import model.animal.Zookeper;
import model.zoo.Zoo;

public class Main {


    public static void main(String[] args)
    {
        Zoo zoo = new Zoo("Zoo Bucuresti", new Zookeper("Dorel"), null);
        Leu leu = new Leu("Sparky", 4, 4);
        zoo.adaugaAnimal(leu, "carne de vita");
        zoo.adaugaAnimal(new Zebra("Morty",5,4),"iarba");
        zoo.adaugaAnimal(new Maimuta("Julien", 3,4),"banana");
        zoo.hranesteToateanimalele();

        TipuriAnimale tip = TipuriAnimale.LEU;
    }

    public enum TipuriAnimale{
        LEU,
        MAIMUTA,
        ZEBRA
    }

}
