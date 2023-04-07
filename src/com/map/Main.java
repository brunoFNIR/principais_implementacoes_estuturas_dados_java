package com.map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
           //chave   valor
        Map<String, String> aluno = new HashMap<>(); //map chamado aluno

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Truma", "3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet()); //retorna o grupo das chaves nesse map alunos
        System.out.println(aluno.values()); //retorna os valores correpondentes a cada chave

        List<Map<String, String>> listaAlunos = new ArrayList<>(); //criando uma lista do tipo Map<String, String> de alunos

        listaAlunos.add(aluno);

        //chave   valor
        Map<String, String> aluno2 = new HashMap<>(); //map chamado aluno2

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Truma", "3b");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome")); //mostra que o map 'aluno' contem a key "Nome"
    }
}
