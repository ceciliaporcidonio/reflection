package org.example;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        // Obtém a classe Cliente
        Class<Cliente> clienteClass = Cliente.class;

        // Verifica se a anotação Tabela está presente na classe
        if (clienteClass.isAnnotationPresent(Tabela.class)) {
            // Obtém a anotação
            Tabela tabela = clienteClass.getAnnotation(Tabela.class);

            // Imprime o valor da anotação (nome da tabela)
            System.out.println("Nome da Tabela: " + tabela.valor());
        } else {
            System.out.println("A classe Cliente não está anotada com @Tabela.");
        }
    }
}
