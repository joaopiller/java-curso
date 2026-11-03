package org.example.c01_ambiente;

public class StackTrace {
    public static void main(String[] args) {
        try {
            int[] prioridades = {1, 2, 3};
            System.out.println(terceira(prioridades));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    static int terceira(int[] valores) { // um metodo static (main) so pode chamar metodos static
        return valores[3];
    }
}
