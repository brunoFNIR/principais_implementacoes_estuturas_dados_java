package com.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>(); //pilha de carros

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat")); //topo da pilha

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop()); //mostra o carro da marca 'Fiat' que tirei da pilha
        System.out.println(stackCarros);


        System.out.println(stackCarros.peek()); //pega o topo da pilha, mas nao retira da pilha
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty()); //retorna false pois a fila não esta vazia

    }
}
