package model.animal;

public class Leu extends Mamifer{
    public Leu(String nume, int varsta, int nrPicioare)
    {
        super(nume,varsta,nrPicioare);
    }

    @Override
    public String toString() {
        return "Leu{}";
    }

    @Override
    public void eat(String mancare) {

    }
}
