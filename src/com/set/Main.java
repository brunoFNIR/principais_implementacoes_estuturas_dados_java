package com.set;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
                                    //HashSet não preserva ordem de inserção
        Set<Carro> hashSetCarros = new HashSet<>(); //criando um Conjunto de carros

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeo"));


        System.out.println(hashSetCarros); //imprime tudo fora de ordem pois o Set não preserva a ordem de inserção



        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCarros); // da um erro, pois agora estamos falando de arvores e ela não tem nenhum parametro de comparação, então precisamos implementar um Comparable na classe Carro;

    }
}
