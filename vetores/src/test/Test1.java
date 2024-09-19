package test;

import classes.Vetor;

public class Test1 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        try {
            vetor.adicionaEficiente("elemento 1");
            vetor.adicionaEficiente("elemento 2");
            //vetor.adicionaEficiente("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
