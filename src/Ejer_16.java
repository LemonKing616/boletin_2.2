public class Ejer_16 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {3, 2, 1, 4, 5}, {9, 5, 8, 6, 7}, {0, 9, 8, 5, 4}};
        int[][] matrizResultado = contarCasillasAdyacentesPares(matriz);
        imprimirMatriz(matrizResultado);
    }

    public static int[][] contarCasillasAdyacentesPares(int[][] matriz) { //el método  contarCasillasAdyacentesPares  recibe una matriz de enteros como parámetro. Se crea una nueva matriz  matrizResultado  con las mismas dimensiones que la matriz original. Luego, se recorren las posiciones de la matriz original y se cuenta el número de casillas adyacentes con valores pares. Se consideran adyacentes todas las posiciones colindantes, incluidas las diagonales. El resultado se almacena en la matriz  matrizResultado .
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizResultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int contadorPares = 0;

                // Comprobar las casillas adyacentes
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k >= 0 && k < filas && l >= 0 && l < columnas && !(k == i && l == j)) {
                            if (matriz[k][l] % 2 == 0) {
                                contadorPares++;
                            }
                        }
                    }
                }

                matrizResultado[i][j] = contadorPares;
            }
        }

        return matrizResultado;
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