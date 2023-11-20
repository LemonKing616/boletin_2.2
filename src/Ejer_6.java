public class Ejer_6 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 5}, {0, 2, 7}};
        imprimirMatrizPorColumnasInverso(matriz);
    }

    public static void imprimirMatrizPorColumnasInverso(int[][] matriz) { //el método  imprimirMatrizPorColumnasInverso  recibe una matriz como parámetro y utiliza dos bucles  for  anidados para recorrer cada posición de la matriz, pero en este caso, se itera primero sobre las columnas en orden inverso y luego sobre las filas en orden inverso. En cada posición, se imprime el valor seguido de un espacio en blanco.
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int j = columnas - 1; j >= 0; j--) {
            for (int i = filas - 1; i >= 0; i--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}