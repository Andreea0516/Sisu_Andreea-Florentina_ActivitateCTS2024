package model;

import singleton.Guvern;

public class Main {
    public static void main(String[] args) {
        Guvern guvern = Guvern.getInstance(5,"Manole",26);
        Guvern guvern2= Guvern.getInstance(4,"Marcel",12); //numai primul apel al lui getInstance

        System.out.println(guvern);
        System.out.println(guvern2);
    }
}