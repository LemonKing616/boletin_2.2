public class Ejer_5 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 5}, {0, 2, 7}};
        imprimirMatrizPorColumnas(matriz);
    }

    public static void imprimirMatrizPorColumnas(int[][] matriz) { //el método  imprimirMatrizPorColumnas  recibe una matriz como parámetro y utiliza dos bucles  for  anidados para recorrer cada posición de la matriz, pero en este caso, se itera primero sobre las columnas y luego sobre las filas. En cada posición, se imprime el valor seguido de un espacio en blanco.
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}