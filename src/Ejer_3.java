public class Ejer_3 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 5}, {0, 2, 7}};
        imprimirMatrizPorFilas(matriz);
    }

    public static void imprimirMatrizPorFilas(int[][] matriz) { //el método  imprimirMatrizPorFilas  recibe una matriz como parámetro y utiliza dos bucles  for  anidados para recorrer cada posición de la matriz. En cada posición, se imprime el valor seguido de un espacio en blanco.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}