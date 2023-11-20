public class Ejer_8 {
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2}, {4, 6}};
        int[][] matriz2 = {{4, 1}, {1, 0}};

        int[][] suma = sumarMatrices(matriz1, matriz2);
        imprimirMatriz(suma);
    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) { //el método  sumarMatrices  recibe dos matrices de igual tamaño como parámetros. Se crea una tercera matriz llamada  resultado  con las mismas dimensiones. Luego, se recorren las matrices  matriz1  y  matriz2  elemento por elemento y se almacena la suma en la posición correspondiente de la matriz  resultado . Finalmente, el método devuelve la matriz  resultado .
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}