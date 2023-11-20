public class Ejer_15 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 25, 23, 24}, {25, 26, 27, 28, 29, 30}};
        int fila = 1;
        int columna = 5;
        int numeroCasilla = obtenerNumeroCasilla(matriz, fila, columna);
        System.out.println("El número de casilla correspondiente a [" + fila + ", " + columna + "] es: " + numeroCasilla);
    }

    public static int obtenerNumeroCasilla(int[][] matriz, int fila, int columna) { //el método  obtenerNumeroCasilla  recibe una matriz, una fila y una columna como parámetros. Se asume que la matriz es válida y tiene el mismo número de columnas en cada fila. El número de casilla se calcula multiplicando la fila por el número de columnas y sumando la columna.

        int columnas = matriz[0].length;
        return fila * columnas + columna;
    }
}
