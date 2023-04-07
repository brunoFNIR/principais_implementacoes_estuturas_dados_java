package com.equalshashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Vowlkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println((new Carro("Ford").hashCode()));
        System.out.println((new Carro("Ford").hashCode())); //mesmo hashCode do objeto de cima pois ele esta comparando o atributo marca dos objetos
        System.out.println((new Carro("Ford1").hashCode())); //nesse caso ja gera outro hashCode completamente diferente por ter mudado o atributo marca

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2)); //retorna false
    }
}
