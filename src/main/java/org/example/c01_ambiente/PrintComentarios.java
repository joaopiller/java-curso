package org.example.c01_ambiente;

public class PrintComentarios {
    static final int LIMITE_DE_TAREFAS = 5; // não pode ser declarado em métodos

    public static void main(String[] args) {
        String titulo = "Estudar Java";
        int prioridade = 2;
        System.out.println("Tarefa: " + titulo + " (" + prioridade + ")");
        System.out.printf("Tarefa: %s (%d)%n", titulo, prioridade);
        System.out.printf("%.2f%n", 1.5);
        System.out.print("Sem quebra ");
        System.out.println("de linha");
        System.out.println(1.6);
        /*
        * várias linhas de comentário
        * */

        boolean concluida = false; // boolean le como pergunta (concluida?)
    }
}
