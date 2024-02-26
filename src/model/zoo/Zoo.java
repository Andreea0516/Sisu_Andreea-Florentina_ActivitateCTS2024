package model.zoo;

import model.animal.Mamifer;
import model.animal.Vietate;
import model.animal.Zookeper;

import java.util.HashMap;
import java.util.Map;

public class Zoo {



    private String nume;
    private Zookeper ingrijitor;

    private Map<Vietate, String> animale;

    public Zoo(String nume, Zookeper ingrijitor, Map<Vietate, String> animale) {
        this.nume = nume;
        this.ingrijitor = ingrijitor;
        this.animale = animale;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Zookeper getIngrijitor() {
        return ingrijitor;
    }

    public void setIngrijitor(Zookeper ingrijitor) {
        this.ingrijitor = ingrijitor;
    }

    public Map<Vietate, String> getAnimale() {
        return animale;
    }

    public void setAnimale(Map<Vietate, String> animale) {
        this.animale = animale;
    }

    public void adaugaAnimal(Vietate vietate,String mancare)
    {
        if(this.animale== null)
        {
            this.animale= new HashMap<>();
        }

        if (vietate!= null&& mancare.length()>2){
            this.animale.put(vietate,mancare);
        }
    }

    public void hranesteToateanimalele()
    {
        for(Vietate vietate : animale.keySet())
        {
            ingrijitor.hranesteAnimal(vietate,animale.get(vietate));

        }
    }
}
