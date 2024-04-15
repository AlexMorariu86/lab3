package org.example;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumere = new ArrayList<>();
        Random random=new Random();
        int numar = 0;
        for(int i=0; i<15; i++) {
            numar= random.nextInt(100);
            listaNumere.add(numar);
        }
        for(int num: listaNumere){
            System.out.println("numar: " + num);
        }
    }
}