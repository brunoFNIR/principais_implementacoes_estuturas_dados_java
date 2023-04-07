package com.list;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros.contains(new Carro("Ford"))); //diz que é true pois existe o Ford

        System.out.println(listCarros.get(2)); //pega o carro no indice 2

        System.out.println(listCarros.indexOf(new Carro("Fiat"))); //retorna dois, pois é a posição do Fiat, se retornar -1 é pq n encontrou

        System.out.println(listCarros.remove(2)); //retorna o carro que ta removendo do indice 2e o tira da lista
        System.out.println(listCarros);

    }
}
