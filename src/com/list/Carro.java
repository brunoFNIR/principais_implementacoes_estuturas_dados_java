package com.list;

import java.util.Objects;

public class Carro {

    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; //objetos de classe difirente, retorna falso
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca); //leva em consideração o atributo marca
        //se ao invex da linha de cima, colocar "return true;" ele vai dizer que qql objeto do tipo carro é igual, não mais levando em consideração o atributo marca
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca); //retorna um hash gerado atraves do atributo marca
    }


    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
