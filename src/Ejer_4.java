public class Ejer_4 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 5}, {0, 2, 7}};
        imprimirMatrizPorFilasInverso(matriz);
    }

    public static void imprimirMatrizPorFilasInverso(int[][] matriz) { //l método  imprimirMatrizPorFilasInverso  recibe una matriz como parámetro y utiliza dos bucles  for  anidados para recorrer cada posición de la matriz, comenzando desde los últimos índices. En cada posición, se imprime el valor seguido de un espacio en blanco.
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}