package model.animal;

public class Zebra extends Mamifer {


    public Zebra(String nume, int varsta, int nrPicioare) {

        super(nume, varsta, nrPicioare);

    }

    @Override
    public String toString() {
        return "Zebra{}";
    }

    @Override
    public void eat(String mancare) {

    }
}
