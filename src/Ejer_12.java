public class Ejer_12 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {3, 2, 1, 4, 5}, {9, 5, 8, 6, 7}, {0, 9, 8, 5, 4}};
        int[][] reflejoDiagonal = obtenerReflejoDiagonal(matriz);
        imprimirMatriz(reflejoDiagonal);
    }

    public static int[][] obtenerReflejoDiagonal(int[][] matriz) { //el método  obtenerReflejoDiagonal  recibe una matriz cuadrada como parámetro. Primero, se verifica si la matriz es cuadrada, es decir, si tiene el mismo número de filas y columnas. Si no es cuadrada, se imprime un mensaje de error y se devuelve  null . Luego, se crea una nueva matriz  reflejoDiagonal  con las mismas dimensiones. Se recorren las posiciones de la matriz original y se asignan los valores en la posición  (i, j)  de la matriz original a la posición  (j, i)  de la matriz reflejoDiagonal. Finalmente, se devuelve la matriz reflejoDiagonal.
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            System.out.println("La matriz no es cuadrada");
            return null;
        }

        int[][] reflejoDiagonal = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                reflejoDiagonal[i][j] = matriz[j][i];
            }
        }

        return reflejoDiagonal;
    }

    public static void imprimirMatriz(int[][] matriz) {
        if (matriz == null) {
            return;
        }

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
//1 6 3 9 0
//2 7 2 5 9
//3 8 1 8 8
//4 9 4 6 5
//5 0 5 7 4