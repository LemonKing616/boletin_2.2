public class Ejer_14 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizTranspuesta = obtenerMatrizTranspuesta(matriz);
        imprimirMatriz(matrizTranspuesta);
    }

    public static int[][] obtenerMatrizTranspuesta(int[][] matriz) { //el método  obtenerMatrizTranspuesta  recibe una matriz como parámetro. Se crea una nueva matriz  matrizTranspuesta  con las dimensiones invertidas, es decir, con el número de filas de la matriz original como número de columnas de la matriz transpuesta, y viceversa. Luego, se recorren las posiciones de la matriz original y se asignan los valores en la posición  (i, j)  de la matriz original a la posición  (j, i)  de la matriz transpuesta. Finalmente, se devuelve la matriz transpuesta.
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        return matrizTranspuesta;
    }

    public static void imprimirMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}