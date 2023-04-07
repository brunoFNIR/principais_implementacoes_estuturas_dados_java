package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot"))); //retorna true pois conseguiuu add o carro de marca peugeot na fila
        System.out.println(queueCarros);


        System.out.println(queueCarros.offer(new Carro("Renault"))); // bem parecido com o add, a diferença é q so o add não conseguir adicionar ele vai dar um erro, já o offer, apenas retornaria false
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); //pega o primeiro carro que entrou na lista, mas nao remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); //já p poll, pega o primeiro carro e remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros.size());


    }
}
